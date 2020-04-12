inherit haskell

do_configure() {
    ghc -threaded --make Setup
    ${S}/Setup configure --global \
                         --bindir=${D}${bindir} \
                         --libdir=${D}${libdir} \ 
                         --sysconfdir=${D}${datadir} \
                         --package-db=${HASKELL_PACKAGES} \
                         --prefix=${D} 
}

do_compile() {
    ${S}/Setup build -v
}

do_install() {
    ${S}/Setup install
    ${S}/Setup register
}