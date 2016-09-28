# Customization of dnsmasq

# Files directory
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# Sources
SRC_URI_append = " \
    file://dnsmasq.conf \
"
