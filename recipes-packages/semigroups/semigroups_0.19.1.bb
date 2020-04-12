DESCRIPTION = "The BNF Converter (bnfc) is a compiler construction tool generating a compiler front-end from a Labelled BNF grammar."

SECTION = "devel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

DEPENDS = "ghc-native"

SRC_URI = "git://github.com/ekmett/semigroups.git;protocol=https;tag=v${PV}"

S = "${WORKDIR}/git"

inherit haskell haskell-package

BBCLASSEXTEND = "native nativesdk" 
