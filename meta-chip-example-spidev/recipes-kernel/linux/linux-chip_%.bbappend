# Customization of linux-chip

# Files directory
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# Sources
SRC_URI_append = " \
    file://spidev.cfg \
    file://sun5i.dtsi.patch \
    file://sun5i-r8-chip.dts.patch \
"
