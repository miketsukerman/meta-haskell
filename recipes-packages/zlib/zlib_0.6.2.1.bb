DESCRIPTION = "Compression and decompression in the gzip and zlib formats"
SECTION = "devel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "git://github.com/haskell/zlib.git;protocol=https;tag=v${PV}"

S = "${WORKDIR}/git"

inherit haskell haskell-package

BBCLASSEXTEND = "native nativesdk" 
