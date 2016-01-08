SUMMARY = "Parallel, indexed xz compressor"

DEPENDS = "xz libarchive"

SRC_URI = "https://github.com/vasi/pixz/releases/download/v${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "f6dc5909c9a31b192f69aa397ae8df48"
SRC_URI[sha256sum] = "02c50746b134fa1b1aae41fcc314d7c6f1919b3d48bcdea01bf11769f83f72e8"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5cf6d164086105f1512ccb81bfff1926"

inherit autotools

BBCLASSEXTEND = "native"
