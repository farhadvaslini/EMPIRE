# EMPIRE GAME native bridge patch

This patch adds the missing JNI symbol and CMake configuration required by
GameClientActivity. It is a client-shell/native bridge only; it does not include
GTA/SA-MP proprietary binaries and does not implement the SA-MP game protocol.

Copy the `app/` files into the Android project, then push to GitHub Actions.
