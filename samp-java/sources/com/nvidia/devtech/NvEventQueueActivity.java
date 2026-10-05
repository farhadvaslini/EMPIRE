package com.nvidia.devtech;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import defpackage.nc2;
import defpackage.uf;
import defpackage.v;
import defpackage.vf;
import defpackage.wf;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL11;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class NvEventQueueActivity extends wf implements SensorEventListener, View.OnTouchListener {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private static final int EGL_OPENGL_ES3_BIT = 64;
    private static final int EGL_RENDERABLE_TYPE = 12352;
    private static final int MAX_NATIVE_TOUCHES = 4;
    protected boolean GetGLExtensions;
    public boolean HasGLExtensions;
    protected boolean IsShowingKeyboard;
    protected boolean ResumeEventDone;
    int SwapBufferSkip;
    protected int alphaSize;
    protected int blueSize;
    protected SurfaceHolder cachedSurfaceHolder;
    boolean capsLockOn;
    private int cleoOverlayPointerId;
    protected int[] configAttrs;
    protected int[] contextAttrs;
    public boolean delaySetContentView;
    protected int depthSize;
    protected Display display;
    EGL10 egl;
    protected EGLConfig eglConfig;
    protected EGLContext eglContext;
    protected EGLDisplay eglDisplay;
    protected EGLSurface eglSurface;
    GL11 gl;
    public String glExtensions;
    protected String glRenderer;
    protected String glVendor;
    protected String glVersion;
    protected int greenSize;
    protected Handler handler;
    protected SurfaceHolder holder;
    public boolean isNativeApp;
    protected boolean isShieldTV;
    protected FrameLayout mAndroidUI;
    protected int mSensorDelay;
    protected SensorManager mSensorManager;
    protected SurfaceView mSurfaceView;
    protected int maxDisplayHeight;
    protected int maxDisplayWidth;
    private boolean nativeCleoOverlayTouchAvailable;
    private boolean nativeEventPaused;
    private boolean nativeImGuiBridgeAvailable;
    private final int[] nativeTouchPointerIds;
    protected boolean paused;
    SharedPreferences prefs;
    private boolean ranInit;
    protected int redSize;
    protected int stencilSize;
    protected boolean supportPauseResume;
    private boolean surfaceAvailable;
    private int surfaceHeight;
    private int surfaceWidth;
    protected SurfaceView view;
    protected boolean viewIsActive;
    boolean waitingForResume;
    protected boolean wantsAccelerometer;
    protected boolean wantsMultitouch;

    /* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
    public static class RawData {
        public byte[] data;
        public int length;
    }

    /* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
    public static class RawTexture extends RawData {
        public int height;
        public int width;
    }

    /* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
    public class gSurfaceView extends SurfaceView {
        NvEventQueueActivity myActivity;

        public gSurfaceView(Context context) {
            super(context);
            this.myActivity = null;
        }

        @Override // android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 4 || !NvEventQueueActivity.this.IsShowingKeyboard) {
                return false;
            }
            this.myActivity.imeClosed();
            return false;
        }
    }

    public NvEventQueueActivity() {
        getSavedStateRegistry().c("androidx:appcompat", new uf(this));
        addOnContextAvailableListener(new vf(this));
        this.handler = null;
        this.paused = false;
        this.wantsMultitouch = false;
        this.nativeTouchPointerIds = new int[]{-1, -1, -1, -1};
        this.supportPauseResume = true;
        this.wantsAccelerometer = false;
        this.mSensorManager = null;
        this.mSensorDelay = 1;
        this.display = null;
        this.egl = null;
        this.gl = null;
        this.ranInit = false;
        this.eglSurface = null;
        this.eglDisplay = null;
        this.eglContext = null;
        this.eglConfig = null;
        this.cachedSurfaceHolder = null;
        this.surfaceWidth = 0;
        this.surfaceHeight = 0;
        this.nativeImGuiBridgeAvailable = true;
        this.GetGLExtensions = false;
        this.HasGLExtensions = false;
        this.IsShowingKeyboard = false;
        this.ResumeEventDone = false;
        this.nativeEventPaused = false;
        this.surfaceAvailable = false;
        this.SwapBufferSkip = 0;
        this.capsLockOn = false;
        this.delaySetContentView = false;
        this.glExtensions = null;
        this.glRenderer = null;
        this.glVendor = null;
        this.glVersion = null;
        this.isNativeApp = false;
        this.mAndroidUI = null;
        this.mSurfaceView = null;
        this.isShieldTV = false;
        this.maxDisplayHeight = 1080;
        this.maxDisplayWidth = 1920;
        this.viewIsActive = false;
        this.waitingForResume = false;
        this.nativeCleoOverlayTouchAvailable = true;
        this.cleoOverlayPointerId = -1;
        this.redSize = 5;
        this.greenSize = 6;
        this.blueSize = 5;
        this.alphaSize = 0;
        this.stencilSize = 0;
        this.depthSize = 16;
        this.configAttrs = null;
        this.contextAttrs = null;
    }

    private int allocateNativeTouchSlot(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            int[] iArr = this.nativeTouchPointerIds;
            if (iArr[i2] < 0) {
                iArr[i2] = i;
                return i2;
            }
        }
        return -1;
    }

    private void cancelNativeTouches() {
        if (this.wantsMultitouch) {
            try {
                customMultiTouchEvent(3, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0);
            } catch (UnsatisfiedLinkError unused) {
            }
            clearNativeTouchSlots();
        }
    }

    private void clearNativeTouchSlots() {
        for (int i = 0; i < 4; i++) {
            this.nativeTouchPointerIds[i] = -1;
        }
    }

    private void dispatchCleoOverlayTouch(MotionEvent motionEvent) {
        NvEventQueueActivity nvEventQueueActivity;
        if (motionEvent == null || !this.nativeCleoOverlayTouchAvailable) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.cleoOverlayPointerId = motionEvent.getPointerId(0);
        }
        int i = this.cleoOverlayPointerId;
        if (i < 0) {
            return;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            iFindPointerIndex = motionEvent.getActionIndex();
        }
        if (iFindPointerIndex < 0 || iFindPointerIndex >= motionEvent.getPointerCount()) {
            iFindPointerIndex = 0;
        }
        int actionIndex = motionEvent.getActionIndex();
        if (actionIndex < 0 || actionIndex >= motionEvent.getPointerCount()) {
            actionIndex = 0;
        }
        int pointerId = motionEvent.getPointerId(actionIndex);
        if (actionMasked == 6 && pointerId != this.cleoOverlayPointerId) {
            actionMasked = 2;
        }
        int i2 = actionMasked;
        SurfaceView surfaceView = this.mSurfaceView;
        int width = surfaceView != null ? surfaceView.getWidth() : 0;
        SurfaceView surfaceView2 = this.mSurfaceView;
        int height = surfaceView2 != null ? surfaceView2.getHeight() : 0;
        if (width <= 0 || height <= 0) {
            width = getWindow().getDecorView().getWidth();
            height = getWindow().getDecorView().getHeight();
        }
        int i3 = height;
        try {
            nvEventQueueActivity = this;
            try {
                nvEventQueueActivity.nativeCleoOverlayTouchEvent(i2, this.cleoOverlayPointerId, (int) motionEvent.getX(iFindPointerIndex), (int) motionEvent.getY(iFindPointerIndex), width, i3);
            } catch (UnsatisfiedLinkError unused) {
                nvEventQueueActivity.nativeCleoOverlayTouchAvailable = false;
            }
        } catch (UnsatisfiedLinkError unused2) {
            nvEventQueueActivity = this;
        }
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3 || (motionEvent.getActionMasked() == 6 && pointerId == nvEventQueueActivity.cleoOverlayPointerId)) {
            nvEventQueueActivity.cleoOverlayPointerId = -1;
        }
    }

    private void dispatchNativeImGuiTouch(MotionEvent motionEvent) {
        if (!this.nativeImGuiBridgeAvailable || motionEvent == null) {
            return;
        }
        try {
            int actionIndex = motionEvent.getActionIndex();
            if (actionIndex < 0 || actionIndex >= motionEvent.getPointerCount()) {
                actionIndex = 0;
            }
            nativeImGuiTouchEvent(motionEvent.getActionMasked(), motionEvent.getPointerId(actionIndex), (int) motionEvent.getX(actionIndex), (int) motionEvent.getY(actionIndex));
        } catch (UnsatisfiedLinkError unused) {
            this.nativeImGuiBridgeAvailable = false;
        }
    }

    private int findNativeTouchSlot(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            if (this.nativeTouchPointerIds[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$DoResumeEvent$1() {
        this.waitingForResume = true;
        System.out.println("DoResumeEvent: waiting for surface");
        while (this.cachedSurfaceHolder == null) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
        }
        this.waitingForResume = false;
        System.out.println("DoResumeEvent: calling resumeEvent");
        resumeEvent();
        this.ResumeEventDone = true;
        System.out.println("DoResumeEvent: resumeEvent done");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(int i) {
        if ((i & 4) == 0) {
            hideSystemUI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pauseNativeEventLoopIfNeeded() {
        if (!this.ResumeEventDone || this.nativeEventPaused) {
            return;
        }
        pauseEvent();
        this.nativeEventPaused = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumeNativeEventLoopIfReady() {
        if (this.ResumeEventDone && this.nativeEventPaused && this.surfaceAvailable && !this.paused) {
            resumeEvent();
            this.nativeEventPaused = false;
        }
    }

    public final void DoResumeEvent() {
        if (this.waitingForResume) {
            return;
        }
        new Thread(new v(10, this)).start();
    }

    public final int GetDepthBits() {
        return 16;
    }

    public final void GetGLExtensions() {
        GL11 gl11;
        if (this.HasGLExtensions || (gl11 = this.gl) == null || this.cachedSurfaceHolder == null) {
            return;
        }
        this.glVendor = gl11.glGetString(7936);
        this.glExtensions = this.gl.glGetString(7939);
        this.glRenderer = this.gl.glGetString(7937);
        this.glVersion = this.gl.glGetString(7938);
        System.out.println("Vendor: " + this.glVendor);
        System.out.println("Extensions " + this.glExtensions);
        System.out.println("Renderer: " + this.glRenderer);
        System.out.println("glVersion: " + this.glVersion);
        if (this.glVendor != null) {
            this.HasGLExtensions = true;
        }
    }

    public final View GetMainView() {
        SurfaceView surfaceView = this.mSurfaceView;
        return surfaceView != null ? surfaceView : this.view;
    }

    public final boolean InitEGLAndGLES2(int i) {
        boolean zInitEGL;
        System.out.println("InitEGLAndGLES2");
        if (this.cachedSurfaceHolder == null) {
            System.out.println("InitEGLAndGLES2 failed, cachedSurfaceHolder is null");
            return false;
        }
        if (this.eglContext == null) {
            if (i >= 3) {
                try {
                    zInitEGL = initEGL(3, 24);
                } catch (Exception unused) {
                    zInitEGL = false;
                }
                System.out.println("initEGL 3 " + zInitEGL);
            } else {
                zInitEGL = false;
            }
            if (!zInitEGL) {
                this.configAttrs = null;
                try {
                    zInitEGL = initEGL(2, 16);
                } catch (Exception unused2) {
                }
                System.out.println("initEGL 2 " + zInitEGL);
                if (!zInitEGL) {
                    zInitEGL = initEGL(2, 16);
                    System.out.println("initEGL 2 " + zInitEGL);
                }
            }
        } else {
            zInitEGL = true;
        }
        if (!zInitEGL) {
            System.out.println("initEGLAndGLES2 failed, core EGL init failure");
            return false;
        }
        System.out.println("Should we create a surface?");
        if (!this.viewIsActive) {
            System.out.println("Yes! Calling create surface");
            createEGLSurface(this.cachedSurfaceHolder);
            System.out.println("Done creating surface");
        }
        this.viewIsActive = true;
        this.SwapBufferSkip = 1;
        return true;
    }

    public final boolean IsPortrait() {
        return false;
    }

    public native boolean accelerometerEvent(float f, float f2, float f3);

    public native void cleanup();

    public final void cleanupEGL() {
        System.out.println("cleanupEGL");
        destroyEGLSurface();
        EGLDisplay eGLDisplay = this.eglDisplay;
        if (eGLDisplay != null) {
            EGL10 egl10 = this.egl;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        }
        EGLContext eGLContext = this.eglContext;
        if (eGLContext != null) {
            this.egl.eglDestroyContext(this.eglDisplay, eGLContext);
        }
        EGLDisplay eGLDisplay2 = this.eglDisplay;
        if (eGLDisplay2 != null) {
            this.egl.eglTerminate(eGLDisplay2);
        }
        this.eglDisplay = null;
        this.eglContext = null;
        this.eglSurface = null;
        this.ranInit = false;
        this.eglConfig = null;
        this.cachedSurfaceHolder = null;
        this.surfaceWidth = 0;
        this.surfaceHeight = 0;
    }

    public final void createEGLSurface(SurfaceHolder surfaceHolder) {
        this.eglSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surfaceHolder, null);
        System.out.println("eglSurface: " + this.eglSurface + ", err: " + this.egl.eglGetError());
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr);
        this.surfaceWidth = iArr[0];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
        this.surfaceHeight = iArr[0];
        System.out.println("checking glVendor == null?");
        if (this.glVendor == null) {
            System.out.println("Making current and back");
            makeCurrent();
            unMakeCurrent();
        }
        System.out.println("Done. Making current and back");
    }

    public native boolean customMultiTouchEvent(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11);

    public final void destroyEGLSurface() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        if (eGLDisplay != null && this.eglSurface != null) {
            EGL10 egl10 = this.egl;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        }
        EGLSurface eGLSurface2 = this.eglSurface;
        if (eGLSurface2 != null) {
            this.egl.eglDestroySurface(this.eglDisplay, eGLSurface2);
        }
        this.eglSurface = null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dispatchCleoOverlayTouch(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int getOrientation() {
        return getResources().getConfiguration().orientation;
    }

    public final boolean getSupportPauseResume() {
        return this.supportPauseResume;
    }

    public final int getSurfaceHeight() {
        return this.surfaceHeight;
    }

    public final int getSurfaceWidth() {
        return this.surfaceWidth;
    }

    public final void hideSystemUI() {
        SurfaceView surfaceView = this.view;
        if (surfaceView != null) {
            try {
                if (Build.VERSION.SDK_INT < 30) {
                    surfaceView.setSystemUiVisibility(7942);
                    return;
                }
                getWindow().setDecorFitsSystemWindows(false);
                WindowInsetsController insetsController = getWindow().getInsetsController();
                if (insetsController == null || insetsController.getSystemBarsBehavior() != 1) {
                    return;
                }
                insetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
                insetsController.setSystemBarsBehavior(2);
            } catch (Exception unused) {
            }
        }
    }

    public native void imeClosed();

    public native boolean init(boolean z);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean initEGL(int i, int i2) {
        int i3;
        int[] iArr;
        int i4;
        int[] iArr2;
        int iEglGetError;
        int i5;
        int i6;
        if (this.configAttrs == null) {
            this.configAttrs = new int[]{12344};
        }
        int[] iArr3 = this.configAttrs;
        this.configAttrs = new int[iArr3.length + 2];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 1;
            int length = iArr3.length - 1;
            iArr = this.configAttrs;
            if (i8 >= length) {
                break;
            }
            iArr[i8] = iArr3[i8];
            i8++;
        }
        int i9 = i8 + 1;
        iArr[i8] = EGL_RENDERABLE_TYPE;
        if (i == 3) {
            i4 = i8 + 2;
            iArr[i9] = EGL_OPENGL_ES3_BIT;
        } else {
            i4 = i8 + 2;
            iArr[i9] = 4;
        }
        iArr[i4] = 12344;
        this.contextAttrs = new int[]{EGL_CONTEXT_CLIENT_VERSION, 2, 12344};
        if (iArr == null) {
            this.configAttrs = new int[]{12344};
        }
        int[] iArr4 = this.configAttrs;
        this.configAttrs = new int[iArr4.length + 12];
        int i10 = 0;
        while (true) {
            int length2 = iArr4.length - 1;
            iArr2 = this.configAttrs;
            if (i10 >= length2) {
                break;
            }
            iArr2[i10] = iArr4[i10];
            i10++;
        }
        int i11 = 12324;
        iArr2[i10] = 12324;
        iArr2[i10 + 1] = this.redSize;
        int i12 = 12323;
        iArr2[i10 + 2] = 12323;
        iArr2[i10 + 3] = this.greenSize;
        int i13 = 12322;
        iArr2[i10 + 4] = 12322;
        iArr2[i10 + 5] = this.blueSize;
        int i14 = 12321;
        iArr2[i10 + 6] = 12321;
        iArr2[i10 + 7] = this.alphaSize;
        int i15 = 12326;
        iArr2[i10 + 8] = 12326;
        iArr2[i10 + 9] = this.stencilSize;
        iArr2[i10 + 10] = 12325;
        iArr2[i10 + 11] = i2;
        iArr2[i10 + 12] = 12344;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.egl = egl10;
        egl10.eglGetError();
        this.eglDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        System.out.println("eglDisplay: " + this.eglDisplay + ", err: " + this.egl.eglGetError());
        boolean zEglInitialize = this.egl.eglInitialize(this.eglDisplay, new int[2]);
        System.out.println("EglInitialize returned: " + zEglInitialize);
        if (!zEglInitialize || (iEglGetError = this.egl.eglGetError()) != 12288) {
            return false;
        }
        System.out.println("eglInitialize err: " + iEglGetError);
        EGLConfig[] eGLConfigArr = new EGLConfig[20];
        int[] iArr5 = new int[1];
        this.egl.eglChooseConfig(this.eglDisplay, this.configAttrs, eGLConfigArr, 20, iArr5);
        System.out.println("eglChooseConfig err: " + this.egl.eglGetError());
        System.out.println("num_configs " + iArr5[0]);
        int[] iArr6 = new int[1];
        int i16 = 16777216;
        int i17 = 0;
        while (i17 < iArr5[i7]) {
            int i18 = i7;
            while (true) {
                int length3 = (iArr3.length - i3) >> i3;
                EGL10 egl102 = this.egl;
                if (i18 < length3) {
                    i5 = i7;
                    i6 = i3;
                    int i19 = i18 * 2;
                    egl102.eglGetConfigAttrib(this.eglDisplay, eGLConfigArr[i17], this.configAttrs[i19], iArr6);
                    int i20 = iArr6[i5];
                    int i21 = this.configAttrs[i19 + 1];
                    if ((i20 & i21) != i21) {
                        break;
                    }
                    i18++;
                    i7 = i5;
                    i3 = i6;
                } else {
                    i5 = i7;
                    i6 = i3;
                    egl102.eglGetConfigAttrib(this.eglDisplay, eGLConfigArr[i17], i11, iArr6);
                    int i22 = iArr6[i5];
                    this.egl.eglGetConfigAttrib(this.eglDisplay, eGLConfigArr[i17], i12, iArr6);
                    int i23 = iArr6[i5];
                    this.egl.eglGetConfigAttrib(this.eglDisplay, eGLConfigArr[i17], i13, iArr6);
                    int i24 = iArr6[i5];
                    this.egl.eglGetConfigAttrib(this.eglDisplay, eGLConfigArr[i17], i14, iArr6);
                    int i25 = iArr6[i5];
                    this.egl.eglGetConfigAttrib(this.eglDisplay, eGLConfigArr[i17], 12325, iArr6);
                    int i26 = iArr6[i5];
                    this.egl.eglGetConfigAttrib(this.eglDisplay, eGLConfigArr[i17], i15, iArr6);
                    int i27 = iArr6[i5];
                    PrintStream printStream = System.out;
                    StringBuilder sbL = nc2.l(">>> EGL Config [", i17, "] R", i22, "G");
                    sbL.append(i23);
                    sbL.append("B");
                    sbL.append(i24);
                    sbL.append("A");
                    sbL.append(i25);
                    sbL.append(" D");
                    sbL.append(i26);
                    sbL.append("S");
                    sbL.append(i27);
                    printStream.println(sbL.toString());
                    int iAbs = Math.abs(i27 - this.stencilSize) + ((Math.abs(i25 - this.alphaSize) + (Math.abs(i24 - this.blueSize) + (Math.abs(i23 - this.greenSize) + Math.abs(i22 - this.redSize)))) << 16) + (Math.abs(i26 - i2) << 8);
                    if (iAbs < i16) {
                        System.out.println("--------------------------");
                        System.out.println("New config chosen: " + i17);
                        int i28 = i5;
                        while (true) {
                            int[] iArr7 = this.configAttrs;
                            if (i28 >= ((iArr7.length - 1) >> 1)) {
                                break;
                            }
                            int i29 = i28 * 2;
                            this.egl.eglGetConfigAttrib(this.eglDisplay, eGLConfigArr[i17], iArr7[i29], iArr6);
                            if (iArr6[i5] >= this.configAttrs[i29 + 1]) {
                                PrintStream printStream2 = System.out;
                                StringBuilder sbM = nc2.m("setting ", ", matches: ", i28);
                                sbM.append(iArr6[i5]);
                                printStream2.println(sbM.toString());
                            }
                            i28++;
                        }
                        this.eglConfig = eGLConfigArr[i17];
                        i16 = iAbs;
                    }
                }
            }
            i17++;
            i7 = i5;
            i3 = i6;
            i11 = 12324;
            i12 = 12323;
            i13 = 12322;
            i14 = 12321;
            i15 = 12326;
        }
        boolean z = i3;
        this.eglContext = this.egl.eglCreateContext(this.eglDisplay, this.eglConfig, EGL10.EGL_NO_CONTEXT, this.contextAttrs);
        System.out.println("eglCreateContext: " + this.egl.eglGetError());
        this.gl = (GL11) this.eglContext.getGL();
        return z;
    }

    public native void jniNvAPKInit(Object obj);

    public native boolean keyEvent(int i, int i2, int i3, int i4, KeyEvent keyEvent);

    /* JADX WARN: Can't wrap try/catch for region: R(6:(3:22|3|4)|(2:28|8)|20|9|16|(2:(0)|(1:26))) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.nvidia.devtech.NvEventQueueActivity.RawData loadFile(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "/data/"
            com.nvidia.devtech.NvEventQueueActivity$RawData r1 = new com.nvidia.devtech.NvEventQueueActivity$RawData
            r1.<init>()
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r4.append(r6)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r2 = r3
            goto L25
        L1b:
            r5 = move-exception
            goto L36
        L1d:
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            java.io.InputStream r2 = r5.open(r6)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
        L25:
            int r5 = r2.available()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L3c
            r1.length = r5     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L3c
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L3c
            r1.data = r5     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L3c
            r2.read(r5)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L3c
        L32:
            r2.close()     // Catch: java.lang.Exception -> L3f
            goto L3f
        L36:
            if (r2 == 0) goto L3b
            r2.close()     // Catch: java.lang.Exception -> L3b
        L3b:
            throw r5
        L3c:
            if (r2 == 0) goto L3f
            goto L32
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nvidia.devtech.NvEventQueueActivity.loadFile(java.lang.String):com.nvidia.devtech.NvEventQueueActivity$RawData");
    }

    public final RawTexture loadTexture(String str) {
        InputStream inputStreamOpen;
        RawTexture rawTexture = new RawTexture();
        try {
            try {
                inputStreamOpen = new FileInputStream("/data/" + str);
            } catch (Exception unused) {
                inputStreamOpen = getAssets().open(str);
            }
        } catch (Exception unused2) {
            inputStreamOpen = null;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
            rawTexture.width = bitmapDecodeStream.getWidth();
            rawTexture.height = bitmapDecodeStream.getHeight();
            int width = bitmapDecodeStream.getWidth() * bitmapDecodeStream.getHeight();
            int[] iArr = new int[width];
            bitmapDecodeStream.getPixels(iArr, 0, bitmapDecodeStream.getWidth(), 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
            int[] iArr2 = new int[bitmapDecodeStream.getWidth()];
            int width2 = bitmapDecodeStream.getWidth();
            int height = bitmapDecodeStream.getHeight();
            for (int i = 0; i < (height >> 1); i++) {
                int i2 = i * width2;
                System.arraycopy(iArr, i2, iArr2, 0, width2);
                int i3 = ((height - 1) - i) * width2;
                System.arraycopy(iArr, i3, iArr, i2, width2);
                System.arraycopy(iArr2, 0, iArr, i3, width2);
            }
            int i4 = width * 4;
            rawTexture.length = i4;
            rawTexture.data = new byte[i4];
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < height; i7++) {
                int i8 = 0;
                while (i8 < width2) {
                    int i9 = iArr[i5];
                    byte[] bArr = rawTexture.data;
                    bArr[i6] = (byte) ((i9 >> 16) & 255);
                    bArr[i6 + 1] = (byte) ((i9 >> 8) & 255);
                    int i10 = i6 + 3;
                    bArr[i6 + 2] = (byte) (i9 & 255);
                    i6 += 4;
                    bArr[i10] = (byte) ((i9 >> 24) & 255);
                    i8++;
                    i5++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rawTexture;
    }

    public native void lowMemoryEvent();

    public final void mSleep(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    public final boolean makeCurrent() {
        EGLContext eGLContext = this.eglContext;
        if (eGLContext == null) {
            System.out.println("eglContext is NULL");
            return false;
        }
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface == null) {
            System.out.println("eglSurface is NULL");
            return false;
        }
        if (!this.egl.eglMakeCurrent(this.eglDisplay, eGLSurface, eGLSurface, eGLContext)) {
            System.out.println("eglMakeCurrent err: " + this.egl.eglGetError());
            EGL10 egl10 = this.egl;
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface2 = this.eglSurface;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.eglContext)) {
                return false;
            }
        }
        GetGLExtensions();
        return true;
    }

    public native boolean multiTouchEvent(int i, int i2, int i3, int i4, int i5, int i6, MotionEvent motionEvent);

    public native boolean multiTouchEvent4(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, MotionEvent motionEvent);

    public native boolean multiTouchEvent4Ex(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    public native void nativeCleoMenuButtonEvent(boolean z);

    public native void nativeCleoOverlayTouchEvent(int i, int i2, int i3, int i4, int i5, int i6);

    public final void nativeCrashed() {
        System.err.println("nativeCrashed");
        if (this.prefs != null) {
            try {
                System.err.println("saved game was:\n" + this.prefs.getString("savedGame", ""));
            } catch (Exception unused) {
            }
        }
        new RuntimeException("crashed here (native trace should follow after the Java trace)").printStackTrace();
    }

    public native void nativeImGuiRenderFrame();

    public native void nativeImGuiTouchEvent(int i, int i2, int i3, int i4);

    @Override // defpackage.lr0, defpackage.xz, defpackage.wz, android.app.Activity
    public void onCreate(Bundle bundle) {
        System.out.println("**** NvEventQueueActivity onCreate");
        NvUtil.getInstance().setActivity(this);
        super.onCreate(bundle);
        if (this.wantsAccelerometer && this.mSensorManager == null) {
            this.mSensorManager = (SensorManager) getSystemService("sensor");
        }
        NvAPKFileHelper.getInstance().setContext(this);
        try {
            jniNvAPKInit(getAssets());
        } catch (UnsatisfiedLinkError unused) {
        }
        this.display = getWindowManager().getDefaultDisplay();
        systemInit();
        hideSystemUI();
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: xx1
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i) {
                this.a.lambda$onCreate$0(i);
            }
        });
    }

    @Override // defpackage.wf, defpackage.lr0, android.app.Activity
    public void onDestroy() {
        System.out.println("**** onDestroy");
        if (this.supportPauseResume) {
            quitAndWait();
            finish();
        }
        super.onDestroy();
        systemCleanup();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24 || i == 25) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean zOnKeyDown = false;
        if (i != 89 && i != 85 && i != 90) {
            if (i != 82 && i != 4) {
                zOnKeyDown = super.onKeyDown(i, keyEvent);
            }
            if (i == 82) {
                nativeCleoMenuButtonEvent(true);
            }
            if (!zOnKeyDown) {
                return keyEvent(keyEvent.getAction(), i, keyEvent.getUnicodeChar(), keyEvent.getMetaState(), keyEvent);
            }
        }
        return zOnKeyDown;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NvEventQueueActivity nvEventQueueActivity;
        KeyEvent keyEvent2;
        if (i == 82) {
            nativeCleoMenuButtonEvent(false);
        }
        if (i == 115) {
            boolean zIsCapsLockOn = keyEvent.isCapsLockOn();
            this.capsLockOn = zIsCapsLockOn;
            nvEventQueueActivity = this;
            keyEvent2 = keyEvent;
            nvEventQueueActivity.keyEvent(zIsCapsLockOn ? 3 : 4, 115, 0, 0, keyEvent2);
        } else {
            nvEventQueueActivity = this;
            keyEvent2 = keyEvent;
        }
        if (i == 89 || i == 85 || i == 90) {
            return false;
        }
        if (super.onKeyUp(i, keyEvent2)) {
            return true;
        }
        return nvEventQueueActivity.keyEvent(keyEvent2.getAction(), i, keyEvent2.getUnicodeChar(), keyEvent2.getMetaState(), keyEvent2);
    }

    @Override // defpackage.lr0, android.app.Activity
    public void onPause() {
        System.out.println("**** onPause");
        cancelNativeTouches();
        super.onPause();
        if (this.supportPauseResume) {
            System.out.println("java is invoking pauseEvent(), this will block until\nthe client calls NVEventPauseProcessed");
            pauseNativeEventLoopIfNeeded();
            System.out.println("pauseEvent() returned");
        } else {
            quitAndWait();
            finish();
        }
        this.paused = true;
    }

    @Override // android.app.Activity
    public final void onRestart() {
        System.out.println("**** onRestart");
        super.onRestart();
    }

    @Override // defpackage.lr0, android.app.Activity
    public void onResume() {
        System.out.println("**** onResume");
        super.onResume();
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null) {
            sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), this.mSensorDelay);
        }
        this.paused = false;
        resumeNativeEventLoopIfReady();
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float[] fArr = sensorEvent.values;
            accelerometerEvent(fArr[0], fArr[1], fArr[2]);
        }
    }

    @Override // defpackage.wf, defpackage.lr0, android.app.Activity
    public void onStop() {
        System.out.println("**** onStop");
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        super.onStop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        int i4;
        dispatchNativeImGuiTouch(motionEvent);
        if (this.wantsMultitouch) {
            int actionMasked = motionEvent.getActionMasked();
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            int iFindNativeTouchSlot = findNativeTouchSlot(pointerId);
            if ((actionMasked == 0 || actionMasked == 5) && iFindNativeTouchSlot < 0) {
                allocateNativeTouchSlot(pointerId);
            }
            for (int i5 = 0; i5 < motionEvent.getPointerCount(); i5++) {
                int pointerId2 = motionEvent.getPointerId(i5);
                if (findNativeTouchSlot(pointerId2) < 0) {
                    allocateNativeTouchSlot(pointerId2);
                }
            }
            int iFindNativeTouchSlot2 = findNativeTouchSlot(pointerId);
            int[] iArr = new int[8];
            int i6 = 0;
            for (int i7 = 0; i7 < motionEvent.getPointerCount(); i7++) {
                int iFindNativeTouchSlot3 = findNativeTouchSlot(motionEvent.getPointerId(i7));
                if (iFindNativeTouchSlot3 >= 0) {
                    int i8 = iFindNativeTouchSlot3 * 2;
                    iArr[i8] = (int) motionEvent.getX(i7);
                    iArr[i8 + 1] = (int) motionEvent.getY(i7);
                    i6 |= 1 << iFindNativeTouchSlot3;
                }
            }
            if (iFindNativeTouchSlot2 >= 0 || actionMasked == 3) {
                i = iFindNativeTouchSlot2;
                i2 = actionMasked;
            } else {
                i = 0;
                i2 = 2;
            }
            try {
                int i9 = i;
                try {
                    i4 = 6;
                    i3 = i9;
                    try {
                        customMultiTouchEvent(i2, Math.max(i, 0), i6, iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], iArr[6], iArr[7]);
                    } catch (UnsatisfiedLinkError e) {
                        e = e;
                        e.printStackTrace();
                    }
                } catch (UnsatisfiedLinkError e2) {
                    e = e2;
                    i4 = 6;
                    i3 = i9;
                }
            } catch (UnsatisfiedLinkError e3) {
                e = e3;
                i3 = i;
                i4 = 6;
            }
            if (actionMasked == i4 && i3 >= 0) {
                this.nativeTouchPointerIds[i3] = -1;
            } else if (actionMasked == 1 || actionMasked == 3) {
                clearNativeTouchSlots();
            }
        } else {
            touchEvent(motionEvent.getAction(), (int) motionEvent.getX(), (int) motionEvent.getY(), motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (!z) {
            cancelNativeTouches();
        }
        super.onWindowFocusChanged(z);
    }

    public native void pauseEvent();

    public native void quitAndWait();

    public native void resumeEvent();

    public final void setGameWindowSize(int i, int i2) {
        if (i2 > i) {
            setWindowSize(i2, i);
        } else {
            setWindowSize(i, i2);
        }
    }

    public native void setWindowSize(int i, int i2);

    public boolean shouldDispatchAutomaticPauseResume() {
        return true;
    }

    public final void showSystemUI() {
        SurfaceView surfaceView = this.view;
        if (surfaceView != null) {
            try {
                if (Build.VERSION.SDK_INT < 30) {
                    surfaceView.setSystemUiVisibility(1792);
                    return;
                }
                getWindow().setDecorFitsSystemWindows(false);
                WindowInsetsController insetsController = getWindow().getInsetsController();
                if (insetsController == null || insetsController.getSystemBarsBehavior() == 1) {
                    return;
                }
                insetsController.show(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
                insetsController.setSystemBarsBehavior(1);
            } catch (Exception unused) {
            }
        }
    }

    public final boolean swapBuffers() {
        int i = this.SwapBufferSkip;
        if (i > 0) {
            this.SwapBufferSkip = i - 1;
            System.out.println("swapBuffer wait");
            return true;
        }
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface == null) {
            System.out.println("eglSurface is NULL");
            return false;
        }
        if (this.egl.eglSwapBuffers(this.eglDisplay, eGLSurface)) {
            return true;
        }
        System.out.println("eglSwapBufferrr: " + this.egl.eglGetError());
        return false;
    }

    public final void systemCleanup() {
        if (this.ranInit) {
            cleanup();
        }
        cleanupEGL();
    }

    public final boolean systemInit() {
        System.out.println("In systemInit");
        if (!this.GetGLExtensions && this.supportPauseResume) {
            init(false);
        }
        setContentView(2131427359);
        SurfaceView surfaceView = (SurfaceView) findViewById(2131230840);
        this.view = surfaceView;
        this.mSurfaceView = surfaceView;
        this.mAndroidUI = (FrameLayout) findViewById(2131230918);
        SurfaceHolder holder = this.view.getHolder();
        this.holder = holder;
        holder.setType(2);
        this.holder.setKeepScreenOn(true);
        if (this.isShieldTV) {
            this.holder.setFixedSize(this.maxDisplayWidth, this.maxDisplayHeight);
        }
        this.view.setFocusable(true);
        this.view.setFocusableInTouchMode(true);
        this.view.setOnTouchListener(this);
        this.holder.addCallback(new SurfaceHolder.Callback() { // from class: com.nvidia.devtech.NvEventQueueActivity.1
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                System.out.println("Surface changed: " + i2 + ", " + i3);
                NvEventQueueActivity.this.surfaceWidth = i2;
                NvEventQueueActivity.this.surfaceHeight = i3;
                NvEventQueueActivity nvEventQueueActivity = NvEventQueueActivity.this;
                nvEventQueueActivity.setGameWindowSize(nvEventQueueActivity.surfaceWidth, NvEventQueueActivity.this.surfaceHeight);
                NvEventQueueActivity.this.hideSystemUI();
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                NvEventQueueActivity nvEventQueueActivity = NvEventQueueActivity.this;
                boolean z = nvEventQueueActivity.cachedSurfaceHolder == null;
                nvEventQueueActivity.cachedSurfaceHolder = surfaceHolder;
                nvEventQueueActivity.surfaceAvailable = true;
                NvEventQueueActivity.this.resumeNativeEventLoopIfReady();
                NvEventQueueActivity.this.ranInit = true;
                NvEventQueueActivity nvEventQueueActivity2 = NvEventQueueActivity.this;
                if (!nvEventQueueActivity2.supportPauseResume) {
                    nvEventQueueActivity2.init(nvEventQueueActivity2.GetGLExtensions);
                }
                System.out.println("surfaceCreated: w:" + NvEventQueueActivity.this.surfaceWidth + ", h:" + NvEventQueueActivity.this.surfaceHeight);
                NvEventQueueActivity nvEventQueueActivity3 = NvEventQueueActivity.this;
                nvEventQueueActivity3.setGameWindowSize(nvEventQueueActivity3.surfaceWidth, NvEventQueueActivity.this.surfaceHeight);
                NvEventQueueActivity nvEventQueueActivity4 = NvEventQueueActivity.this;
                if (nvEventQueueActivity4.GetGLExtensions && nvEventQueueActivity4.supportPauseResume && z) {
                    nvEventQueueActivity4.init(true);
                }
                if (z) {
                    NvEventQueueActivity.this.getClass();
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                NvEventQueueActivity.this.surfaceAvailable = false;
                NvEventQueueActivity.this.pauseNativeEventLoopIfNeeded();
                NvEventQueueActivity.this.destroyEGLSurface();
                NvEventQueueActivity.this.viewIsActive = false;
            }
        });
        DoResumeEvent();
        return true;
    }

    public native boolean touchEvent(int i, int i2, int i3, MotionEvent motionEvent);

    public final boolean unMakeCurrent() {
        EGL10 egl10 = this.egl;
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
            return true;
        }
        System.out.println("egl(Un)MakeCurrent err: " + this.egl.eglGetError());
        return false;
    }

    public void GamepadReportSurfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
