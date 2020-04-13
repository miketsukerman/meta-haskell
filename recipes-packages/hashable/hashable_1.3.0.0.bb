DESCRIPTION = "This package defines a class, Hashable, for types that can be converted to a hash value"
SECTION = "devel"
LICENSE = "BSD3"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

SRCREV="b317a69cb8c4b97463151db4c6cc50b9d1aa4aa7"
SRC_URI = "git://github.com/tibbe/hashable.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit haskell haskell-package

BBCLASSEXTEND = "native nativesdk" 
