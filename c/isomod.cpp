//
//--------------------------------------------------------------------------------
//
// File: isomod.cpp
//
// Description:
//
//   A small proof-of-concept, demonstating how to modify
//   the Primary Volume Descriptor of an ISO9660 image.
//
// Authors: Preston Lee <preston.lee@openrain.com>
//
// License: GPL
//
// See Also:
//
//   http://lists.asu.edu/cgi-bin/wa?A2=ind0402&L=ASULUG&P=R537
//   http://www.ecma-international.org/publications/standards/Ecma-119.htm
//   http://www.ecma-international.org/publications/files/ecma-st/Ecma-119.pdf
//
//--------------------------------------------------------------------------------
//

#include <iostream>
#include <fstream>

#define BUFF_SIZE 64
#define VID_ADDR 0x8028
#define PVD_ADDR 0x8001
#define PVD_HEAD "CD001"
#define PVD_HEAD_LEN 5
#define VID_MAX_SIZE 31

using namespace std;


int main(int argc, char * argv[]) {

  cout << "\n" << __FILE__ << "\nAn ISO9660 image modification utility.\n"
       << "Author: Preston Lee <preston.lee@typeglob.org>\n\n" ;

  if(argc != 4 || strcmp("-V", argv[2]) != 0) {
    cout << "Usage: " << argv[0] << " <some.iso> -V <new volume id>" << endl;
    return 1;
  }

  if(strlen(argv[1]) > VID_MAX_SIZE) {
    cout << "Volume IDs must be less than 31 characters long." << endl;
    return 1;
  }

  char new_vid[VID_MAX_SIZE + 1];// = (char *)malloc(VID_MAX_SIZE + 1);
  char old_vid[VID_MAX_SIZE + 1];// = (char *)malloc(VID_MAX_SIZE + 1);
  memset(new_vid, 0x20, VID_MAX_SIZE);
  strncpy(new_vid, argv[3], strlen(argv[3]));

  // Open the ISO.
  fstream iso;
  iso.open(argv[1], ios::in | ios::out | ios::binary);

  // Make sure this is an ISO. :)
  char buf[BUFF_SIZE];
  long addr = PVD_ADDR;
  iso.seekg(addr);
  iso.read(buf, PVD_HEAD_LEN);
  buf[PVD_HEAD_LEN] = '\0';
  if(strcmp(buf, PVD_HEAD) != 0) {
    cout << "This does not look like an ISO. I will not modify it." << endl;
    return 1;
  }

  // Read current (old) Volume ID.
  iso.seekg(VID_ADDR);
  iso.read(old_vid, VID_MAX_SIZE);
  old_vid[VID_MAX_SIZE] = '\0';
  cout << "Old Volume ID: " << old_vid << endl;

  // Overwrite with new Volume ID.
  iso.seekg(VID_ADDR);
  iso.write(new_vid, VID_MAX_SIZE);
  cout << "New Volume ID: " << argv[3] << "\n\n";

  return 0;
}

