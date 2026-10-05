package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class tr3 extends rr3 {
    private static final int MAX_GAME_PADS = 4;
    public final sr3[] GamePads = new sr3[4];

    public static float s(float f) {
        if (Math.abs(f) < 0.25f) {
            return 0.0f;
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float GetGamepadAxis(int i, int i2) {
        sr3 sr3Var;
        if (i >= 0) {
            sr3[] sr3VarArr = this.GamePads;
            sr3Var = i >= sr3VarArr.length ? null : sr3VarArr[i];
        }
        if (sr3Var == null || i2 < 0) {
            return 0.0f;
        }
        float[] fArr = sr3Var.a;
        if (i2 >= fArr.length) {
            return 0.0f;
        }
        return fArr[i2];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int GetGamepadButtons(int i) {
        sr3 sr3Var;
        if (i >= 0) {
            sr3[] sr3VarArr = this.GamePads;
            sr3Var = i >= sr3VarArr.length ? null : sr3VarArr[i];
        }
        if (sr3Var == null) {
            return 0;
        }
        return sr3Var.b;
    }

    public final int GetGamepadTrack(int i, int i2, int i3) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int GetGamepadType(int i) {
        sr3 sr3Var;
        if (i >= 0) {
            sr3[] sr3VarArr = this.GamePads;
            sr3Var = i >= sr3VarArr.length ? null : sr3VarArr[i];
        }
        if (sr3Var == null) {
            return -1;
        }
        return sr3Var.c;
    }

    public final int InitMogaController(int i) {
        return -1;
    }

    @Override // com.nvidia.devtech.NvEventQueueActivity, defpackage.lr0, defpackage.xz, defpackage.wz, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 0;
        while (true) {
            sr3[] sr3VarArr = this.GamePads;
            if (i >= sr3VarArr.length) {
                super.onCreate(bundle);
                return;
            } else {
                sr3VarArr[i] = new sr3();
                i++;
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        sr3 sr3VarT;
        if (motionEvent != null) {
            int source = motionEvent.getSource();
            if (((source & 1025) == 1025 || (source & 16777232) == 16777232) && (sr3VarT = t(motionEvent.getDeviceId())) != null) {
                float[] fArr = sr3VarT.a;
                fArr[0] = s(motionEvent.getAxisValue(0));
                fArr[1] = s(motionEvent.getAxisValue(1));
                fArr[2] = s(motionEvent.getAxisValue(11));
                fArr[3] = s(motionEvent.getAxisValue(14));
                fArr[4] = s(motionEvent.getAxisValue(17));
                fArr[5] = s(motionEvent.getAxisValue(18));
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // com.nvidia.devtech.NvEventQueueActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        u(i, keyEvent, true);
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.nvidia.devtech.NvEventQueueActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        u(i, keyEvent, false);
        return super.onKeyUp(i, keyEvent);
    }

    public final sr3 t(int i) {
        for (sr3 sr3Var : this.GamePads) {
            if (sr3Var.d && sr3Var.e == i) {
                return sr3Var;
            }
        }
        for (sr3 sr3Var2 : this.GamePads) {
            if (!sr3Var2.d) {
                sr3Var2.d = true;
                sr3Var2.e = i;
                sr3Var2.c = 5;
                return sr3Var2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(int i, KeyEvent keyEvent, boolean z) {
        sr3 sr3VarT;
        if (keyEvent != null) {
            int source = keyEvent.getSource();
            if ((source & 1025) == 1025 || (source & 16777232) == 16777232) {
                int i2 = 4;
                if (i == 4) {
                    i2 = 32;
                } else if (i == 96) {
                    i2 = 1;
                } else if (i == 97) {
                    i2 = 2;
                } else if (i != 99) {
                    if (i == 100) {
                        i2 = 8;
                    } else if (i == 102) {
                        i2 = 64;
                    } else if (i == 103) {
                        i2 = 128;
                    } else if (i == 108) {
                        i2 = 16;
                    } else if (i != 109) {
                        switch (i) {
                            case 19:
                                i2 = 256;
                                break;
                            case 20:
                                i2 = 512;
                                break;
                            case 21:
                                i2 = 1024;
                                break;
                            case 22:
                                i2 = 2048;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                    }
                }
                if (i2 == 0 || (sr3VarT = t(keyEvent.getDeviceId())) == null) {
                    return;
                }
                int i3 = sr3VarT.b;
                if (z) {
                    sr3VarT.b = i3 | i2;
                } else {
                    sr3VarT.b = i3 & (~i2);
                }
            }
        }
    }

    @Override // com.nvidia.devtech.NvEventQueueActivity
    public final void GamepadReportSurfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // defpackage.qr3
    public final void SetGamepad(String str) {
    }

    public final void SetReportPS3As360(boolean z) {
    }

    public final void TouchpadEvent(int i, int i2, int i3, int i4, int i5, int i6) {
    }
}
