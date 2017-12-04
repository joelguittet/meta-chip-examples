meta-chip-example-wifi
==

NextThingCo C.H.I.P. Yocto meta layer example WiFi.

This layer contains WiFi example for the NextThingCo C.H.I.P. boards.

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
* chip-image-example-wifi: image with WiFi tools to connect to an external network.

The wanted image is chosen during the build with bitbake command.


Using
--

Clone sources:

	git clone https://github.com/myfreescalewebpage/meta-chip-examples.git ~/yocto/meta-chip-examples

Add "meta-chip-examples/meta-chip-example-wifi" to the bitbake layers configuration file.

See the README file of the meta-chip layer (from my GitHub https://github.com/myfreescalewebpage/meta-chip) to check details about building and flashing images on the C.H.I.P. board.

### chip-image-example-wifi

This image includes configuration files to connect automatically to a WiFi network when it is available.
The files "/etc/network/interfaces" and "/etc/wpa_supplicant.conf" are customized to achieve this.
The current configuration is done for a testing network called "AndroidAP" with WPA passphrase "cass2734". It is possible to modify it in the file "recipes-connectivity/wpa_supplicant/files/wpa_supplicant.conf-sane".
Checkout wpa-supplicant man pages for more options, particularly, it is possible to specify several preferred networks with priority management.


Contributing
--

All contributions are welcome :-)

Use Github Issues to report anomalies or to propose enhancements (labels are available to clearly identify what you are writing) and Pull Requests to submit modifications.


References
--

* https://github.com/myfreescalewebpage/meta-chip
