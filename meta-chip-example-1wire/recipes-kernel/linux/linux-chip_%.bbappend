# Customization of linux-chip

# Version (can be retrieved with uname -a)
LINUX_KERNEL_TYPE = "example-1wire"

# Files directory
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# Sources
SRC_URI_append = " \
    file://1wire.cfg \
    file://sun5i-r8-chip.dts.patch \
"
