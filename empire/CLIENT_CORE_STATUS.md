# EMPIRE GAME client core status

Implemented in this package:
- Native JNI bridge
- Native CMake library
- Client engine discovery under `files/empire-data/engine/arm64-v8a/`
- Safe loading of user-supplied/authorized native libraries
- TCP reachability check for `85.133.205.240:7777`
- Example engine manifest schema
- Existing downloader remains the data installation layer

Not bundled:
- GTA/SA-MP proprietary game/client binaries
- GTA game assets
- A proprietary SA-MP protocol implementation

Those components must come from a version the user is authorized to use. Once supplied, their exact filenames, dependencies and initialization API can be wired into this shell.
