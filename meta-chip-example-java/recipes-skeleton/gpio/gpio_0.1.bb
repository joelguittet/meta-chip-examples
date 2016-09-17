SUMMARY = "JAVA gpio OpenJdk DIO example"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit java-library

DEPENDS_${PN} = "openjdk-7-jre openjdk-dio"
RDEPENDS_${PN} = "openjdk-7-jre openjdk-dio"

PR = "r0"

SRC_URI = " \
  file://gpio.java \
  file://manifest \
"

S = "${WORKDIR}"

export JAVA_HOME="${STAGING_DIR_NATIVE}/usr/lib/jvm/icedtea7-native"

do_compile () {
  mkdir -p build
  ${JAVA_HOME}/bin/javac -classpath ${STAGING_DIR_TARGET}/usr/share/java/dio.jar -sourcepath . -d build `find . -name "*.java"`
  ${JAVA_HOME}/bin/jar cfm gpio-${PV}.jar manifest -C build .
}

do_install_append () {
  install -d ${D}/usr/local/java
  install -m 0644 ${WORKDIR}/gpio-${PV}.jar ${D}/usr/local/java/gpio.jar
}

FILES_${PN} = " \
  /usr/local/java/gpio.jar \
"
