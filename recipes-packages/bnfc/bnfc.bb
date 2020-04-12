DESCRIPTION = "The BNF Converter (bnfc) is a compiler construction tool generating a compiler front-end from a Labelled BNF grammar."

SECTION = "devel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

DEPENDS = "ghc-native alex-native happy-native semigroups"

SRCREV = "8cff60c6a94a393f93c9fc5d14b1e17dde6ec530"
SRC_URI = "git://github.com/BNFC/bnfc.git;protocol=https;branch=master"

S = "${WORKDIR}/git/source"

inherit haskell haskell-package

BBCLASSEXTEND = "native nativesdk" 
