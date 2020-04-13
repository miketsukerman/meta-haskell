DESCRIPTION = "This package provides a low-level networking interface."
SECTION = "devel"
LICENSE = "BSD3"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "git://github.com/haskell/network.git;protocol=https;tag=v${PV}"

S = "${WORKDIR}/git"

inherit haskell haskell-package

do_configure_prepend() {
    autoreconf -i
}

BBCLASSEXTEND = "native nativesdk" 