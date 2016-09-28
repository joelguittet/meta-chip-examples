meta-chip-example-wifi-hotspot
==

NextThingCo C.H.I.P. Yocto meta layer example WiFi hotspot.

This layer contains WiFi hotspot example for the NextThingCo C.H.I.P. board.

This layer depends on the additional layers:
* meta-yocto
* meta-yocto-bsp
* meta-openembedded/meta-oe
* meta-openembedded/meta-python
* meta-openembedded/meta-networking
* meta-chip (from my GitHub https://github.com/myfreescalewebpage/meta-chip)


Images
--

The following images are available:
* chip-image-example-wifi-hotspot: image with WiFi tools to create a hotspot.

The wanted image is chosen during the build with bitbake command.


Using
--

Clone sources:

	git clone https://github.com/myfreescalewebpage/meta-chip-examples.git ~/yocto/meta-chip-examples

Add "meta-chip-examples/meta-chip-example-wifi-hotspot" to the bitbake layers configuration file.

See the README file of the meta-chip layer (from my GitHub https://github.com/myfreescalewebpage/meta-chip) to check details about building and flashing images on the C.H.I.P. board.

### chip-image-example-wifi-hotspot

This image includes configuration files to create and start automatically a WiFi hotspot called "ChipAP".
The files "/etc/network/interfaces", "/etc/hostapd.conf" and "/etc/dnsmasq.conf" are customized to achieve this.
The current configuration is done for a testing network called "ChipAP" with no security. It is possible to modify it in the file "recipes-connectivity/hostapd/files/hostapd.conf". DHCP server configuration can also be customized in the file "recipes-support/dnsmasq/files/dnsmasq.conf".
Checkout hostapd and dnsmasq man pages for more options.


Contributing
--

All contributions are welcome :-)

Use Github Issues to report anomalies or to propose enhancements (labels are available to clearly identify what you are writing) and Pull Requests to submit modifications.


References
--

* https://github.com/myfreescalewebpage/meta-chip
