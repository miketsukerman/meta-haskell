DESCRIPTION = "This package provides facilities for parsing and unparsing URIs, and creating and resolving relative URI references, closely following the URI spec, IETF RFC 3986 [1]."
SECTION = "devel"
LICENSE = "BSD3"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRCREV = "41ab335802f2808e24977a2e7b5a1665c2e3dd3c"
SRC_URI = "git://github.com/haskell/network-uri.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit haskell haskell-package

BBCLASSEXTEND = "native nativesdk" 