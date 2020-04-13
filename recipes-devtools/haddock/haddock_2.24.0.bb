include haddock.inc

DEPENDS += "haddock-api haddock-library"

S = "${WORKDIR}/haddock-haddock-${PV}-release/"

inherit haskell haskell-package

BBCLASSEXTEND = "native nativesdk" 
