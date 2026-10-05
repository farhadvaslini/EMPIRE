package top.th1nk.samp.feature.game;

import android.R;
import android.app.NotificationManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import defpackage.a8;
import defpackage.ac0;
import defpackage.at;
import defpackage.au0;
import defpackage.b32;
import defpackage.b4;
import defpackage.by1;
import defpackage.cl3;
import defpackage.cs0;
import defpackage.cu0;
import defpackage.d82;
import defpackage.dm3;
import defpackage.e41;
import defpackage.em0;
import defpackage.f82;
import defpackage.fa2;
import defpackage.fa3;
import defpackage.ft0;
import defpackage.ft1;
import defpackage.gt0;
import defpackage.gt1;
import defpackage.h01;
import defpackage.hf1;
import defpackage.ht0;
import defpackage.ht1;
import defpackage.ir;
import defpackage.it0;
import defpackage.iu0;
import defpackage.j;
import defpackage.j22;
import defpackage.j90;
import defpackage.ja2;
import defpackage.jo3;
import defpackage.k41;
import defpackage.k71;
import defpackage.kt0;
import defpackage.l41;
import defpackage.lc1;
import defpackage.lf2;
import defpackage.lq;
import defpackage.lu0;
import defpackage.mu0;
import defpackage.ni0;
import defpackage.nt1;
import defpackage.nt3;
import defpackage.nu0;
import defpackage.nw;
import defpackage.om1;
import defpackage.os1;
import defpackage.ot0;
import defpackage.ot3;
import defpackage.ou0;
import defpackage.oz2;
import defpackage.p40;
import defpackage.p72;
import defpackage.pk2;
import defpackage.pp2;
import defpackage.pq;
import defpackage.pt0;
import defpackage.pt3;
import defpackage.pu0;
import defpackage.qi;
import defpackage.qn2;
import defpackage.qp2;
import defpackage.qt0;
import defpackage.qx;
import defpackage.qy2;
import defpackage.r3;
import defpackage.r32;
import defpackage.rn2;
import defpackage.rt0;
import defpackage.rw;
import defpackage.rx;
import defpackage.rz2;
import defpackage.s3;
import defpackage.s51;
import defpackage.s7;
import defpackage.si0;
import defpackage.su0;
import defpackage.sz2;
import defpackage.ti;
import defpackage.tl1;
import defpackage.u1;
import defpackage.ui;
import defpackage.uj;
import defpackage.ur;
import defpackage.ut0;
import defpackage.vb;
import defpackage.vr;
import defpackage.wt0;
import defpackage.x80;
import defpackage.xb3;
import defpackage.y02;
import defpackage.y31;
import defpackage.y92;
import defpackage.y93;
import defpackage.ys;
import defpackage.zt0;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class GameActivity extends SAMP {
    public static final int $stable = 8;
    public static final lu0 Companion = new lu0();
    private int activeDialogId;
    private EditText activeDialogInput;
    private int activeDialogLastClickItem;
    private long activeDialogLastClickTime;
    private LinearLayout activeDialogListContainer;
    private FrameLayout activeDialogOverlay;
    private List<byte[]> activeDialogSelectableInputBytes;
    private List<String> activeDialogSelectableInputText;
    private byte[] activeDialogSelectedInputBytes;
    private String activeDialogSelectedInputText;
    private int activeDialogSelectedItem;
    private String chatDraft;
    private final List<String> chatHistory;
    private int chatHistoryIndex;
    private EditText chatInputEditText;
    private FrameLayout chatInputOverlay;
    private FrameLayout cleoBreakpointOverlay;
    private FrameLayout cleoMenuArrowOverlay;
    private FrameLayout cleoMenuOverlay;
    private boolean cleoMenuQuickLauncher;
    private List<? extends TextView> cleoMenuRows;
    private int cleoMenuSelectedIndex;
    private int cleoMenuStartupHintChecks;
    private Runnable cleoMenuStartupHintRunnable;
    private boolean cleoMenuStartupHintShown;
    private int cleoMenuSwipePointerId;
    private long cleoMenuSwipeStartTime;
    private float cleoMenuSwipeStartX;
    private float cleoMenuSwipeStartY;
    private final s3 cleoScriptPicker;
    private final lc1 cleoScriptRepository$delegate;
    private final HashMap<String, byte[]> completedPluginImageDecodes;
    private final os1 dialogVisible$delegate;
    private Runnable disconnectWatchRunnable;
    private boolean dlModelProgressAutoScroll;
    private ProgressBar dlModelProgressBar;
    private int dlModelProgressContentHeight;
    private FrameLayout dlModelProgressOverlay;
    private boolean dlModelProgressProgrammaticScroll;
    private final AtomicLong dlModelProgressRequest;
    private final HashMap<Long, mu0> dlModelProgressRowViews;
    private LinearLayout dlModelProgressRows;
    private ScrollView dlModelProgressScroll;
    private ViewTreeObserver.OnGlobalLayoutListener dlModelProgressScrollLayoutListener;
    private TextView dlModelProgressTitle;
    private int dlModelProgressTotal;
    private boolean dlModelProgressTotalKnown;
    private boolean dlModelProgressUserTouching;
    private final LinkedHashMap<Long, Integer> dlModelProgressValues;
    private FrameLayout editObjectOverlay;
    private final os1 editObjectVisible$delegate;
    private final HashSet<String> failedPluginImageDecodes;
    private final lc1 gameFontSize$delegate;
    private final os1 hudVisible$delegate;
    private final os1 isPaused$delegate;
    private final os1 keyboardVisible$delegate;
    private int lastPlayerCount;
    private String lastServerAddress;
    private String lastServerName;
    private int lastTabClickId;
    private long lastTabClickTime;
    private final lc1 launchClientVersion$delegate;
    private final lc1 launchClientVersionName$delegate;
    private final lc1 launchLanguageTag$delegate;
    private final lc1 launchNickname$delegate;
    private final os1 loadingScreenVisible$delegate;
    private boolean nativeChatHiddenByPause;
    private float nativeChatLastTouchY;
    private final List<SpannableString> nativeChatLines;
    private ft1 nativeChatScrollBar;
    private int nativeChatScrollOffset;
    private TextView nativeChatText;
    private boolean nativeChatTouchMoved;
    private final AtomicBoolean nativeExitRequested;
    private final lc1 nativeKeyboardEnabled$delegate;
    private FrameLayout nativeTabOverlay;
    private LinearLayout nativeTabRows;
    private View nativeTabSelectedRow;
    private TextView nativeTabServerName;
    private TextView nativeTabTotalPlayers;
    private nt1 nativeTextDrawView;
    private final HashSet<String> pendingPluginImageDecodes;
    private volatile byte[] pluginClipboardCache;
    private final ClipboardManager.OnPrimaryClipChangedListener pluginClipboardListener;
    private final Object pluginImageDecodeLock;
    private y92 pluginRepository;
    private boolean pluginRuntimeShutdown;
    private ja2 pluginSessionRecovery;
    private boolean pluginSessionStarted;
    private lf2 quickCommandsRepo;
    private final lc1 radarAtBottomLeft$delegate;
    private List<fa2> restartPluginsAtLaunch;
    private pp2 sampButtonOverlay;
    private boolean sampButtonsExpanded;
    private boolean sampButtonsNativeVisible;
    private final lc1 serverRepository$delegate;
    private Set<String> sessionEnabledPluginIds;
    private boolean settingsButtonAdded;
    private int settingsButtonRetries;
    private sz2 settingsMenu;
    private final lc1 showChatTimestamp$delegate;
    private boolean showServerNotificationEnabled;
    private final os1 tabVisible$delegate;

    static {
        System.loadLibrary("bass");
        System.loadLibrary("samp");
    }

    public GameActivity() {
        Boolean bool = Boolean.FALSE;
        this.tabVisible$delegate = b32.w(bool);
        this.loadingScreenVisible$delegate = b32.w(bool);
        this.keyboardVisible$delegate = b32.w(bool);
        this.hudVisible$delegate = b32.w(bool);
        this.dialogVisible$delegate = b32.w(bool);
        this.editObjectVisible$delegate = b32.w(bool);
        this.isPaused$delegate = b32.w(bool);
        this.cleoScriptRepository$delegate = new xb3(new pt0(7, this));
        this.nativeExitRequested = new AtomicBoolean(false);
        ni0 ni0Var = ni0.f;
        this.restartPluginsAtLaunch = ni0Var;
        this.sessionEnabledPluginIds = si0.f;
        this.pluginImageDecodeLock = new Object();
        this.pendingPluginImageDecodes = new HashSet<>();
        this.completedPluginImageDecodes = new HashMap<>();
        this.failedPluginImageDecodes = new HashSet<>();
        this.cleoScriptPicker = registerForActivityResult(new r3(0), new b4(1, this));
        this.nativeChatLines = new ArrayList();
        this.activeDialogId = -1;
        this.activeDialogSelectedItem = -1;
        this.activeDialogSelectedInputText = "";
        this.activeDialogSelectedInputBytes = new byte[0];
        this.activeDialogSelectableInputText = ni0Var;
        this.activeDialogSelectableInputBytes = ni0Var;
        this.activeDialogLastClickItem = -1;
        this.cleoMenuRows = ni0Var;
        this.cleoMenuSelectedIndex = -1;
        this.cleoMenuSwipePointerId = -1;
        this.lastTabClickId = -1;
        this.dlModelProgressValues = new LinkedHashMap<>();
        this.dlModelProgressRowViews = new HashMap<>();
        this.dlModelProgressRequest = new AtomicLong(0L);
        this.dlModelProgressAutoScroll = true;
        this.nativeKeyboardEnabled$delegate = new xb3(new pt0(9, this));
        this.launchLanguageTag$delegate = new xb3(new pt0(10, this));
        this.gameFontSize$delegate = new xb3(new pt0(11, this));
        this.showChatTimestamp$delegate = new xb3(new pt0(12, this));
        this.radarAtBottomLeft$delegate = new xb3(new pt0(13, this));
        this.launchNickname$delegate = new xb3(new pt0(14, this));
        this.serverRepository$delegate = new xb3(new pt0(15, this));
        this.launchClientVersion$delegate = new xb3(new pt0(16, this));
        this.launchClientVersionName$delegate = new xb3(new pt0(8, this));
        this.showServerNotificationEnabled = true;
        this.lastServerAddress = "";
        this.lastServerName = "";
        this.chatHistory = new ArrayList();
        this.chatDraft = "";
        this.pluginClipboardListener = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: du0
            @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
            public final void onPrimaryClipChanged() {
                GameActivity.Z(this.a);
            }
        };
    }

    public static void B(GameActivity gameActivity) {
        gameActivity.hideChatInput(true);
    }

    public static void C(GameActivity gameActivity) {
        gameActivity.removeCleoMenuArrowOverlay();
    }

    public static void D0(GameActivity gameActivity, int i, int i2, String str, String str2, String str3, String str4, byte[] bArr) throws Throwable {
        gameActivity.showNativeDialog(i, i2, str, str2, str3, str4, bArr);
    }

    public static void I(GameActivity gameActivity) {
        gameActivity.updateNativeChatScrollBar();
    }

    public static boolean J(int i, GameActivity gameActivity) {
        return gameActivity.setCleoDialogListItemOnUiThread(i);
    }

    public static boolean K0(GameActivity gameActivity, byte[] bArr) {
        return gameActivity.setCleoDialogInputOnUiThread(bArr);
    }

    public static void N0(FrameLayout frameLayout, GameActivity gameActivity) {
        if (gameActivity.cleoMenuArrowOverlay == frameLayout) {
            gameActivity.removeCleoMenuArrowOverlay();
        }
    }

    public static void O0(GameActivity gameActivity) {
        Vibrator cleoVibrator = gameActivity.getCleoVibrator();
        if (cleoVibrator != null) {
            cleoVibrator.cancel();
        }
    }

    public static void S0(GameActivity gameActivity) {
        FrameLayout frameLayout = gameActivity.editObjectOverlay;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    public static void T(GameActivity gameActivity) {
        gameActivity.addSettingsButton();
    }

    public static void T0(GameActivity gameActivity) {
        gameActivity.removeCleoMenuArrowOverlay();
    }

    public static void W(GameActivity gameActivity) {
        gameActivity.removeCleoMenuOverlay();
    }

    public static void Z(GameActivity gameActivity) {
        gameActivity.refreshPluginClipboardCache();
    }

    private final TextView addDlModelProgressCell(LinearLayout linearLayout, String str, int i, Typeface typeface) {
        TextView textView = new TextView(this);
        textView.setTextColor(i);
        textView.setTextSize(14.0f);
        textView.setTypeface(typeface);
        textView.setGravity(17);
        textView.setText(str);
        textView.setPadding(dp(4.0f), 0, dp(4.0f), 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addNativeChatLine$lambda$0(GameActivity gameActivity, String str, int i) {
        int i2 = 0;
        boolean z = gameActivity.nativeChatScrollOffset == 0;
        gameActivity.nativeChatLines.add(gameActivity.buildChatLine(str, i));
        while (gameActivity.nativeChatLines.size() > 80) {
            gameActivity.nativeChatLines.remove(0);
        }
        if (!z) {
            int i3 = gameActivity.nativeChatScrollOffset + 1;
            int iMaxNativeChatScrollOffset = gameActivity.maxNativeChatScrollOffset();
            i2 = i3 > iMaxNativeChatScrollOffset ? iMaxNativeChatScrollOffset : i3;
        }
        gameActivity.nativeChatScrollOffset = i2;
        gameActivity.refreshNativeChatText();
        gameActivity.showNativeChatOverlayIfNeeded();
    }

    private final void addNativeTabCell(LinearLayout linearLayout, String str, float f, int i, boolean z) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setTextSize(2, getGameFontSize() + 2);
        textView.setTypeface(Typeface.MONOSPACE, z ? 1 : 0);
        textView.setSingleLine(true);
        textView.setIncludeFontPadding(false);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(0, -2, f));
    }

    private final void addNativeTabHeader() {
        LinearLayout linearLayout = this.nativeTabRows;
        if (linearLayout == null) {
            return;
        }
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(dp(4.0f), 0, dp(4.0f), dp(4.0f));
        addNativeTabCell(linearLayout2, "ID", 0.12f, -4601409, true);
        addNativeTabCell(linearLayout2, "Nickname", 0.5f, -4601409, true);
        addNativeTabCell(linearLayout2, "Score", 0.2f, -4601409, true);
        addNativeTabCell(linearLayout2, "Ping", 0.18f, -4601409, true);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final void addSettingsButton() {
        Object qn2Var;
        if (this.settingsButtonAdded) {
            return;
        }
        try {
            nativeImGuiAddButton(100, 8.0f, 190.0f, 0.0f, 0.0f, -12751873, "S");
            this.settingsButtonAdded = true;
            ti tiVar = ui.a;
            ui.c(ti.g, "GameActivity", "Settings button added via bridge", null);
            qn2Var = dm3.a;
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        Throwable thA = rn2.a(qn2Var);
        if (thA != null) {
            ti tiVar2 = ui.a;
            ui.c(ti.i, "GameActivity", by1.h("addSettingsButton failed (attempt ", ")", this.settingsButtonRetries + 1), thA);
            int i = this.settingsButtonRetries + 1;
            this.settingsButtonRetries = i;
            if (i < 5) {
                getWindow().getDecorView().postDelayed(new ft0(2, this), 2000L);
            }
        }
    }

    private final void addSettingsMenuOverlay() {
        sz2 sz2Var = this.settingsMenu;
        if (sz2Var != null) {
            addContentView(sz2Var.z, new FrameLayout.LayoutParams(-1, -1));
        } else {
            s51.F("settingsMenu");
            throw null;
        }
    }

    private final void appendMissingIniKeys(List<String> list, LinkedHashMap<String, String> linkedHashMap, Set<String> set) {
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Set<String> set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (fa3.Z((String) it.next(), key, true)) {
                        break;
                    }
                }
            }
            list.add(key + "=" + value);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.text.SpannableString buildChatLine(java.lang.String r17, int r18) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.th1nk.samp.feature.game.GameActivity.buildChatLine(java.lang.String, int):android.text.SpannableString");
    }

    private final SpannableString buildColoredText(String str, int i) {
        return buildChatLine(str, i);
    }

    private final View buildInputDialogView(String str, EditText editText) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(dp(4.0f), dp(4.0f), dp(4.0f), dp(4.0f));
        if (!y93.q0(str)) {
            ScrollView scrollView = new ScrollView(this);
            scrollView.setFillViewport(false);
            TextView textView = new TextView(this);
            textView.setText(buildChatLine(str, -1183753));
            textView.setTextColor(-1183753);
            textView.setTextSize(2, getGameFontSize() + 1.5f);
            textView.setLineSpacing(dp(1.0f), 1.0f);
            scrollView.addView(textView, -1, -2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            layoutParams.bottomMargin = dp(8.0f);
            linearLayout.addView(scrollView, layoutParams);
        }
        linearLayout.addView(editText, new LinearLayout.LayoutParams(-1, dp(42.0f)));
        return linearLayout;
    }

    private final View buildListDialogView(String str, int i, byte[] bArr, int i2) throws Throwable {
        ArrayList arrayList;
        List arrayList2;
        boolean z;
        View viewDialogListRow;
        Iterator it;
        List listS0 = y93.s0(str);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : listS0) {
            if (!y93.q0((String) obj)) {
                arrayList3.add(obj);
            }
        }
        boolean z2 = i == 5 && !arrayList3.isEmpty();
        List<String> listO0 = z2 ? qx.o0(1, arrayList3) : arrayList3;
        boolean z3 = i == 4 || i == 5;
        List<Integer> listDialogColumnWidths = z3 ? dialogColumnWidths(arrayList3) : ni0.f;
        int iMaxDialogContentWidth = maxDialogContentWidth() - dp(8.0f);
        int iDialogTableRowWidth = z3 ? dialogTableRowWidth(arrayList3, listDialogColumnWidths) : dialogListRowWidth(listO0);
        int iDp = dp(220.0f);
        if (iDialogTableRowWidth < iDp) {
            iDialogTableRowWidth = iDp;
        }
        int iDp2 = i2 - dp(8.0f);
        if (iDp2 < 0) {
            iDp2 = 0;
        }
        if (iDialogTableRowWidth >= iDp2) {
            iDp2 = iDialogTableRowWidth;
        }
        if (iDp2 > iMaxDialogContentWidth) {
            iDp2 = iMaxDialogContentWidth;
        }
        if (bArr.length == 0) {
            arrayList2 = new ArrayList();
            arrayList = arrayList3;
        } else {
            ArrayList arrayList4 = new ArrayList();
            int length = bArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (bArr[i4] == 10) {
                    arrayList4.add(uj.M(bArr, i3, i4));
                    i3 = i4 + 1;
                }
            }
            if (i3 <= bArr.length) {
                arrayList4.add(uj.M(bArr, i3, bArr.length));
            }
            ArrayList arrayList5 = new ArrayList(rx.d0(arrayList4, 10));
            int size = arrayList4.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj2 = arrayList4.get(i5);
                i5++;
                byte[] bArr2 = (byte[]) obj2;
                ArrayList arrayList6 = new ArrayList();
                int length2 = bArr2.length;
                ArrayList arrayList7 = arrayList3;
                int i6 = 0;
                while (i6 < length2) {
                    int i7 = i6;
                    byte b = bArr2[i7];
                    int i8 = size;
                    if (b != 13) {
                        arrayList6.add(Byte.valueOf(b));
                    }
                    i6 = i7 + 1;
                    size = i8;
                }
                arrayList5.add(qx.K0(arrayList6));
                arrayList3 = arrayList7;
            }
            arrayList = arrayList3;
            ArrayList arrayList8 = new ArrayList();
            int size2 = arrayList5.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj3 = arrayList5.get(i9);
                i9++;
                if (((byte[]) obj3).length != 0) {
                    arrayList8.add(obj3);
                }
            }
            arrayList2 = new ArrayList(arrayList8);
        }
        if (z2 && arrayList2.size() > 1) {
            arrayList2 = qx.o0(1, arrayList2);
        }
        Throwable th = null;
        this.activeDialogListContainer = null;
        ArrayList arrayList9 = new ArrayList(rx.d0(listO0, 10));
        Iterator it2 = listO0.iterator();
        while (it2.hasNext()) {
            arrayList9.add(dialogRowInputText((String) it2.next(), z3));
        }
        this.activeDialogSelectableInputText = arrayList9;
        ArrayList arrayList10 = new ArrayList(rx.d0(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            byte[] bArr3 = (byte[]) it3.next();
            bArr3.getClass();
            byte[] bArr4 = new byte[bArr3.length];
            int i10 = 0;
            int i11 = 0;
            while (i10 < bArr3.length) {
                int i12 = i10 + 8;
                Throwable th2 = th;
                boolean z4 = z3;
                if (i12 > bArr3.length || bArr3[i10] != 123) {
                    it = it3;
                } else {
                    int i13 = i10 + 7;
                    it = it3;
                    if (bArr3[i13] == 125 && lq.M(uj.M(bArr3, i10 + 1, i13), 6)) {
                        th = th2;
                        i10 = i12;
                    }
                    z3 = z4;
                    it3 = it;
                }
                int i14 = i10 + 9;
                if (i14 <= bArr3.length && bArr3[i10] == 123 && bArr3[i12] == 125 && lq.M(uj.M(bArr3, i10 + 1, i12), 8)) {
                    th = th2;
                    i10 = i14;
                } else {
                    bArr4[i11] = bArr3[i10];
                    th = th2;
                    i11++;
                    i10++;
                }
                z3 = z4;
                it3 = it;
            }
            arrayList10.add(Arrays.copyOf(bArr4, i11));
            z3 = z3;
        }
        boolean z5 = z3;
        Throwable th3 = th;
        this.activeDialogSelectableInputBytes = arrayList10;
        String str2 = (String) qx.r0(this.activeDialogSelectableInputText);
        if (str2 == null) {
            str2 = "";
        }
        this.activeDialogSelectedInputText = str2;
        byte[] bArr5 = (byte[]) qx.r0(this.activeDialogSelectableInputBytes);
        this.activeDialogSelectedInputBytes = bArr5 != null ? Arrays.copyOf(bArr5, bArr5.length) : new byte[0];
        try {
            nativeUpdateCleoDialogListItem(this.activeDialogSelectedItem);
            nativeUpdateCleoDialogInput(this.activeDialogSelectedInputBytes);
        } catch (Throwable unused) {
        }
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(dp(4.0f), dp(4.0f), dp(4.0f), dp(4.0f));
        if (z2) {
            View viewDialogTableRow = dialogTableRow((String) qx.q0(arrayList), listDialogColumnWidths, false, true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iDp2, -2);
            layoutParams.bottomMargin = dp(3.0f);
            linearLayout.addView(viewDialogTableRow, layoutParams);
        }
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        this.activeDialogListContainer = linearLayout2;
        int i15 = 0;
        for (Object obj4 : listO0) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                vr.b0();
                throw th3;
            }
            String str3 = (String) obj4;
            if (z5) {
                z = true;
                viewDialogListRow = dialogTableRow(str3, listDialogColumnWidths, true, false);
            } else {
                z = true;
                viewDialogListRow = dialogListRow(str3);
            }
            viewDialogListRow.setClickable(z);
            viewDialogListRow.setOnClickListener(new ht0(i15, this, linearLayout2, viewDialogListRow));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iDp2, -2);
            layoutParams2.bottomMargin = dp(2.0f);
            linearLayout2.addView(viewDialogListRow, layoutParams2);
            i15 = i16;
        }
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(iDp2, -2));
        if (!listO0.isEmpty()) {
            highlightSelectedDialogRow(linearLayout2, 0);
        }
        ScrollView scrollView = new ScrollView(this);
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.addView(linearLayout, -2, -2);
        if (!z5 || iDialogTableRowWidth <= iMaxDialogContentWidth) {
            scrollView.setBackground(roundedDrawable(856889380, 12.0f, 587202559, 1.0f));
            return scrollView;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
        horizontalScrollView.setBackground(roundedDrawable(856889380, 12.0f, 587202559, 1.0f));
        horizontalScrollView.setFillViewport(false);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.addView(scrollView, -2, -2);
        return horizontalScrollView;
    }

    public static /* synthetic */ View buildListDialogView$default(GameActivity gameActivity, String str, int i, byte[] bArr, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            bArr = new byte[0];
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return gameActivity.buildListDialogView(str, i, bArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildListDialogView$lambda$9$0$0(GameActivity gameActivity, int i, View view, LinearLayout linearLayout, View view2) {
        Editable text;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = gameActivity.activeDialogLastClickItem == i && jCurrentTimeMillis - gameActivity.activeDialogLastClickTime < 350;
        gameActivity.activeDialogSelectedItem = i;
        String str = (String) qx.s0(i, gameActivity.activeDialogSelectableInputText);
        if (str == null) {
            str = "";
        }
        gameActivity.activeDialogSelectedInputText = str;
        byte[] bArr = (byte[]) qx.s0(i, gameActivity.activeDialogSelectableInputBytes);
        gameActivity.activeDialogSelectedInputBytes = bArr != null ? Arrays.copyOf(bArr, bArr.length) : new byte[0];
        try {
            gameActivity.nativeUpdateCleoDialogListItem(gameActivity.activeDialogSelectedItem);
            gameActivity.nativeUpdateCleoDialogInput(gameActivity.activeDialogSelectedInputBytes);
        } catch (Throwable unused) {
        }
        gameActivity.activeDialogLastClickItem = i;
        gameActivity.activeDialogLastClickTime = jCurrentTimeMillis;
        gameActivity.highlightSelectedDialogRow(linearLayout, i);
        if (z) {
            EditText editText = gameActivity.activeDialogInput;
            String string = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
            gameActivity.sendActiveDialogResponse(1, string != null ? string : "");
        }
    }

    private final View buildMessageDialogView(String str) {
        ScrollView scrollView = new ScrollView(this);
        scrollView.setFillViewport(false);
        TextView textView = new TextView(this);
        textView.setText(buildChatLine(str, -1183753));
        textView.setTextColor(-1183753);
        textView.setTextSize(2, getGameFontSize() + 1.5f);
        textView.setLineSpacing(dp(1.0f), 1.0f);
        textView.setPadding(dp(4.0f), dp(4.0f), dp(4.0f), dp(4.0f));
        scrollView.addView(textView, -1, -2);
        return scrollView;
    }

    public static void c0(GameActivity gameActivity) {
        gameActivity.addSettingsButton();
    }

    private final boolean canOpenCleoMenuFromSwipe() {
        if (this.cleoMenuOverlay != null || this.cleoBreakpointOverlay != null || getEditObjectVisible() || getDialogVisible()) {
            return false;
        }
        return !getSettingsMenuVisible();
    }

    private final void cancelActiveDialog() {
        if (this.activeDialogId != -1) {
            sendActiveDialogResponse(0, "");
        } else {
            removeActiveDialogOverlay();
        }
    }

    private final int chatHexLength(String str, int i) {
        char cCharAt;
        int i2 = 0;
        while (true) {
            int i3 = i + i2;
            if (i3 >= str.length() || i2 >= 8 || (('0' > (cCharAt = str.charAt(i3)) || cCharAt >= ':') && (('a' > cCharAt || cCharAt >= 'g') && ('A' > cCharAt || cCharAt >= 'G')))) {
                break;
            }
            i2++;
        }
        return i2;
    }

    private final int chatScrollBarHeight() {
        return dp((getGameFontSize() + 2) * 9);
    }

    private final void clearChatLog() {
        File externalFilesDir = getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = getFilesDir();
        }
        File file = new File(externalFilesDir, "chatlog.txt");
        try {
            if (file.exists()) {
                em0.a0(file, "", ys.a);
                ti tiVar = ui.a;
                ui.c(ti.g, "GameActivity", "Cleared previous chat log", null);
            }
        } catch (Exception e) {
            ti tiVar2 = ui.a;
            ui.c(ti.i, "GameActivity", "Unable to clear previous chat log", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearNativeTextDraws$lambda$0(GameActivity gameActivity) {
        nt1 nt1Var;
        if (gameActivity.isFinishing() || gameActivity.isDestroyed() || (nt1Var = gameActivity.nativeTextDrawView) == null) {
            return;
        }
        nt1Var.g.clear();
        nt1Var.h.clear();
        LinkedHashMap linkedHashMap = nt1Var.f;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        linkedHashMap.clear();
        nt1Var.invalidate();
    }

    private final void clearSampLog() {
        String absolutePath;
        File externalFilesDir = getExternalFilesDir(null);
        if (externalFilesDir == null || (absolutePath = externalFilesDir.getAbsolutePath()) == null) {
            return;
        }
        File file = new File(absolutePath, "samp_log.txt");
        if (file.exists()) {
            file.delete();
            ti tiVar = ui.a;
            ui.c(ti.g, "GameActivity", "Cleared previous SAMP log", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearTab$lambda$0(GameActivity gameActivity) {
        LinearLayout linearLayout = gameActivity.nativeTabRows;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            gameActivity.nativeTabSelectedRow = null;
            gameActivity.addNativeTabHeader();
        }
    }

    private final int cleoMenuInitialScrollHeight() {
        Object next;
        SurfaceView surfaceView = this.mSurfaceView;
        Iterator it = vr.L(Integer.valueOf(surfaceView != null ? surfaceView.getHeight() : 0), Integer.valueOf(getWindow().getDecorView().getHeight()), Integer.valueOf(getResources().getDisplayMetrics().heightPixels)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Number) next).intValue() > 0) {
                break;
            }
        }
        Integer num = (Integer) next;
        int iIntValue = ((num != null ? num.intValue() : 0) - dp(48.0f)) - dp(112.0f);
        int i = iIntValue >= 0 ? iIntValue : 0;
        int iDp = dp(360.0f);
        return i > iDp ? iDp : i;
    }

    private final int cleoMenuTouchHeight() {
        SurfaceView surfaceView = this.mSurfaceView;
        if (surfaceView != null) {
            Integer numValueOf = Integer.valueOf(surfaceView.getHeight());
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return getWindow().getDecorView().getHeight();
    }

    private final int cleoMenuTouchWidth() {
        SurfaceView surfaceView = this.mSurfaceView;
        if (surfaceView != null) {
            Integer numValueOf = Integer.valueOf(surfaceView.getWidth());
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return getWindow().getDecorView().getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleoScriptPicker$lambda$0(GameActivity gameActivity, Uri uri) {
        if (uri == null) {
            return;
        }
        hf1 hf1VarA = pq.A(gameActivity);
        j90 j90Var = ac0.a;
        cl3.t(hf1VarA, x80.h, new j(gameActivity, uri, null, 23), 2);
    }

    private static final nw cleoScriptRepository_delegate$lambda$0(GameActivity gameActivity) {
        return new nw(gameActivity);
    }

    private final void configureNativePlugins(List<fa2> list) {
        try {
            ArrayList arrayList = new ArrayList(rx.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((fa2) it.next()).a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            ArrayList arrayList2 = new ArrayList(rx.d0(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((fa2) it2.next()).b);
            }
            String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
            ArrayList arrayList3 = new ArrayList(rx.d0(list, 10));
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((fa2) it3.next()).c);
            }
            String[] strArr3 = (String[]) arrayList3.toArray(new String[0]);
            ArrayList arrayList4 = new ArrayList(rx.d0(list, 10));
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                String str = ((fa2) it4.next()).d;
                if (str == null) {
                    str = "";
                }
                arrayList4.add(str);
            }
            String[] strArr4 = (String[]) arrayList4.toArray(new String[0]);
            ArrayList arrayList5 = new ArrayList(rx.d0(list, 10));
            Iterator<T> it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList5.add(((fa2) it5.next()).e);
            }
            String[] strArr5 = (String[]) arrayList5.toArray(new String[0]);
            ArrayList arrayList6 = new ArrayList(rx.d0(list, 10));
            Iterator<T> it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList6.add(((fa2) it6.next()).f);
            }
            String[] strArr6 = (String[]) arrayList6.toArray(new String[0]);
            ArrayList arrayList7 = new ArrayList(rx.d0(list, 10));
            Iterator<T> it7 = list.iterator();
            while (it7.hasNext()) {
                arrayList7.add(((fa2) it7.next()).g);
            }
            String[] strArr7 = (String[]) arrayList7.toArray(new String[0]);
            ArrayList arrayList8 = new ArrayList(rx.d0(list, 10));
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList8.add(qx.x0(((fa2) it8.next()).i, "\n", null, null, null, 62));
            }
            nativeConfigurePlugins(strArr, strArr2, strArr3, strArr4, strArr5, strArr6, strArr7, (String[]) arrayList8.toArray(new String[0]));
        } catch (UnsatisfiedLinkError e) {
            ti tiVar = ui.a;
            ui.c(ti.i, "GameActivity", "Failed to configure plugins", e);
        }
    }

    private final void configurePluginsForCurrentSession() {
        y92 y92Var = this.pluginRepository;
        if (y92Var == null) {
            s51.F("pluginRepository");
            throw null;
        }
        Set<String> set = this.sessionEnabledPluginIds;
        h01 h01Var = y92.i;
        ArrayList arrayListP = y92Var.p(set, f82.Multiplayer);
        ArrayList arrayList = new ArrayList();
        int size = arrayListP.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListP.get(i2);
            i2++;
            if (((fa2) obj).h == p72.g) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListD0 = qx.D0(this.restartPluginsAtLaunch, arrayList);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayListD0.size();
        while (i < size2) {
            Object obj2 = arrayListD0.get(i);
            i++;
            if (hashSet.add(((fa2) obj2).a)) {
                arrayList2.add(obj2);
            }
        }
        if (this.pluginSessionStarted) {
            ja2 ja2Var = this.pluginSessionRecovery;
            if (ja2Var == null) {
                s51.F("pluginSessionRecovery");
                throw null;
            }
            try {
                List listC = ja2.c(ja2Var.b, 16384L);
                if (listC == null) {
                    throw new IllegalStateException("Active plugin session is unavailable");
                }
                String strA = ja2.a("session", listC);
                if (strA != null) {
                    String str = ja2.e.c(strA) ? strA : null;
                    if (str != null) {
                        if (s51.n(ja2.a("state", listC), "closing")) {
                            throw new IllegalArgumentException("Plugin session is already closing");
                        }
                        ja2Var.e(str, arrayList2);
                    }
                }
                throw new IllegalStateException("Active plugin session is invalid");
            } catch (Throwable unused) {
            }
        }
        configureNativePlugins(arrayList2);
    }

    private final mu0 createDlModelProgressRow() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        Typeface typeface = Typeface.DEFAULT;
        typeface.getClass();
        TextView textViewCreateDlModelProgressRow$cell = createDlModelProgressRow$cell(this, typeface);
        Typeface typeface2 = Typeface.MONOSPACE;
        typeface2.getClass();
        TextView textViewCreateDlModelProgressRow$cell2 = createDlModelProgressRow$cell(this, typeface2);
        TextView textViewCreateDlModelProgressRow$cell3 = createDlModelProgressRow$cell(this, typeface2);
        mu0 mu0Var = new mu0(textViewCreateDlModelProgressRow$cell, textViewCreateDlModelProgressRow$cell2, textViewCreateDlModelProgressRow$cell3);
        linearLayout.addView(textViewCreateDlModelProgressRow$cell, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.addView(textViewCreateDlModelProgressRow$cell2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.addView(textViewCreateDlModelProgressRow$cell3, new LinearLayout.LayoutParams(0, -2, 1.0f));
        LinearLayout linearLayout2 = this.dlModelProgressRows;
        if (linearLayout2 != null) {
            linearLayout2.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        }
        return mu0Var;
    }

    private static final TextView createDlModelProgressRow$cell(GameActivity gameActivity, Typeface typeface) {
        TextView textView = new TextView(gameActivity);
        textView.setTextColor(-1);
        textView.setTextSize(14.0f);
        textView.setTypeface(typeface);
        textView.setGravity(17);
        textView.setPadding(gameActivity.dp(4.0f), gameActivity.dp(3.0f), gameActivity.dp(4.0f), gameActivity.dp(3.0f));
        return textView;
    }

    public static void d1(GameActivity gameActivity) {
        gameActivity.handleBackPress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] decodePluginImageFile(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (1 > i || i >= 1025 || 1 > i2 || i2 >= 1025 || ((long) i) * ((long) i2) > 1048576) {
            return new byte[0];
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options2.inScaled = false;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options2);
        if (bitmapDecodeFile == null) {
            return new byte[0];
        }
        try {
            int width = bitmapDecodeFile.getWidth();
            int height = bitmapDecodeFile.getHeight();
            if (width == i && height == i2) {
                int i3 = width * height;
                int[] iArr = new int[i3];
                bitmapDecodeFile.getPixels(iArr, 0, width, 0, 0, width, height);
                int i4 = 8;
                byte[] bArr = new byte[(i3 * 4) + 8];
                lq.c0(bArr, 0, width);
                lq.c0(bArr, 4, height);
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = iArr[i5];
                    bArr[i4] = (byte) (i6 >>> 16);
                    bArr[i4 + 1] = (byte) (i6 >>> 8);
                    int i7 = i4 + 3;
                    bArr[i4 + 2] = (byte) i6;
                    i4 += 4;
                    bArr[i7] = (byte) (i6 >>> 24);
                }
                return bArr;
            }
            byte[] bArr2 = new byte[0];
            bitmapDecodeFile.recycle();
            return bArr2;
        } finally {
            bitmapDecodeFile.recycle();
        }
    }

    private final String decodeServerName(byte[] bArr) {
        return lq.p(bArr);
    }

    private final int defaultDialogListItem(int i) {
        return (i == 2 || i == 4 || i == 5) ? 0 : -1;
    }

    private final TextView dialogButton(String str, boolean z, cs0 cs0Var) {
        TextView textView = new TextView(this);
        if (y93.q0(str)) {
            str = "OK";
        }
        textView.setText(buildChatLine(str, z ? -1 : -2696730));
        textView.setTextColor(z ? -1 : -2696730);
        int i = 1;
        textView.setTextSize(2, getGameFontSize() + 1);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        textView.setClickable(true);
        textView.setBackground(roundedDrawable(z ? -12751873 : 858403141, 999.0f, z ? 1720296703 : 872415231, 1.0f));
        textView.setPadding(dp(14.0f), dp(7.0f), dp(14.0f), dp(7.0f));
        textView.setOnClickListener(new it0(cs0Var, i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = dp(8.0f);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private final List<Integer> dialogColumnWidths(List<String> list) {
        TextView textView = new TextView(this);
        textView.setTextSize(2, getGameFontSize() + 1.5f);
        textView.setTypeface(Typeface.DEFAULT);
        ArrayList arrayList = new ArrayList(4);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.add(Integer.valueOf(dp(48.0f)));
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i3 = 0;
            for (Object obj : qx.I0(y93.z0((String) it.next(), new char[]{'\t'}, 6), 4)) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    vr.b0();
                    throw null;
                }
                int iMeasureText = ((int) textView.getPaint().measureText(buildChatLine((String) obj, -1).toString())) + dp(32.0f);
                if (iMeasureText > ((Number) arrayList.get(i3)).intValue()) {
                    arrayList.set(i3, Integer.valueOf(iMeasureText));
                }
                i3 = i4;
            }
        }
        ArrayList arrayList2 = new ArrayList(rx.d0(arrayList, 10));
        int size = arrayList.size();
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            int iIntValue = ((Number) obj2).intValue();
            int iDp = dp(220.0f);
            if (iIntValue > iDp) {
                iIntValue = iDp;
            }
            arrayList2.add(Integer.valueOf(iIntValue));
        }
        return arrayList2;
    }

    private final TextView dialogListRow(String str) {
        TextView textView = new TextView(this);
        textView.setText(buildChatLine(str, -1183753));
        textView.setTextColor(-1183753);
        textView.setTextSize(2, getGameFontSize() + 1.5f);
        textView.setPadding(dp(8.0f), dp(5.0f), dp(8.0f), dp(5.0f));
        return textView;
    }

    private final int dialogListRowWidth(List<String> list) {
        Integer num;
        TextView textView = new TextView(this);
        textView.setTextSize(2, getGameFontSize() + 1.5f);
        textView.setTypeface(Typeface.DEFAULT);
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((int) textView.getPaint().measureText(buildChatLine((String) it.next(), -1).toString())) + dp(32.0f));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((int) textView.getPaint().measureText(buildChatLine((String) it.next(), -1).toString())) + dp(32.0f));
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        return num != null ? num.intValue() : dp(220.0f);
    }

    private final String dialogRowInputText(String str, boolean z) {
        if (z && (str = (String) qx.r0(y93.z0(str, new char[]{'\t'}, 6))) == null) {
            str = "";
        }
        String string = buildChatLine(str, -1).toString();
        string.getClass();
        return string;
    }

    private final LinearLayout dialogTableRow(String str, List<Integer> list, boolean z, boolean z2) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(dp(8.0f), z2 ? dp(6.0f) : dp(5.0f), dp(8.0f), z2 ? dp(6.0f) : dp(5.0f));
        if (z2) {
            linearLayout.setBackground(roundedDrawable$default(this, 1140850688, 8.0f, 0, 0.0f, 12, null));
        }
        int i = 0;
        for (Object obj : qx.I0(y93.z0(str, new char[]{'\t'}, 6), 4)) {
            int i2 = i + 1;
            if (i < 0) {
                vr.b0();
                throw null;
            }
            String str2 = (String) obj;
            TextView textView = new TextView(this);
            textView.setText(buildChatLine(str2, z2 ? -11654 : -1183753));
            textView.setTextColor(z2 ? -11654 : -1183753);
            textView.setTextSize(2, getGameFontSize() + 1.5f);
            textView.setTypeface(z2 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            textView.setIncludeFontPadding(false);
            textView.setPadding(0, 0, dp(20.0f), 0);
            textView.setIncludeFontPadding(false);
            linearLayout.addView(textView, new LinearLayout.LayoutParams(((i < 0 || i >= list.size()) ? Integer.valueOf(dp(80.0f)) : list.get(i)).intValue(), -2));
            i = i2;
        }
        linearLayout.setEnabled(z);
        return linearLayout;
    }

    private final int dialogTableRowWidth(List<String> list, List<Integer> list2) {
        Integer num;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(qx.I0(y93.z0((String) it.next(), new char[]{'\t'}, 6), 4).size());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(qx.I0(y93.z0((String) it.next(), new char[]{'\t'}, 6), 4).size());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        return qx.H0(qx.I0(list2, num != null ? num.intValue() : 1)) + dp(16.0f);
    }

    private final void dispatchCleoMenuSwipe(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getActionMasked() == 0) {
            resetCleoMenuSwipe();
            if (canOpenCleoMenuFromSwipe()) {
                int iCleoMenuTouchWidth = cleoMenuTouchWidth();
                int iCleoMenuTouchHeight = cleoMenuTouchHeight();
                if (iCleoMenuTouchWidth <= 0 || iCleoMenuTouchHeight <= 0 || motionEvent.getPointerCount() == 0) {
                    return;
                }
                float x = motionEvent.getX(0);
                float y = motionEvent.getY(0);
                if (isCleoMenuCenterColumn(x, iCleoMenuTouchWidth) && isCleoMenuTopRegion(y, iCleoMenuTouchHeight)) {
                    this.cleoMenuSwipePointerId = motionEvent.getPointerId(0);
                    this.cleoMenuSwipeStartX = x;
                    this.cleoMenuSwipeStartY = y;
                    this.cleoMenuSwipeStartTime = motionEvent.getEventTime();
                    return;
                }
                return;
            }
            return;
        }
        int i = this.cleoMenuSwipePointerId;
        if (i < 0) {
            return;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            resetCleoMenuSwipe();
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || ((actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.cleoMenuSwipePointerId) || actionMasked == 3)) {
            int iCleoMenuTouchWidth2 = cleoMenuTouchWidth();
            int iCleoMenuTouchHeight2 = cleoMenuTouchHeight();
            long eventTime = motionEvent.getEventTime() - this.cleoMenuSwipeStartTime;
            if (actionMasked != 3 && iCleoMenuTouchWidth2 > 0 && iCleoMenuTouchHeight2 > 0 && eventTime >= 0 && eventTime <= 1500 && isCleoMenuCenterColumn(motionEvent.getX(iFindPointerIndex), iCleoMenuTouchWidth2) && isCleoMenuBottomRegion(motionEvent.getY(iFindPointerIndex), iCleoMenuTouchHeight2) && motionEvent.getY(iFindPointerIndex) > this.cleoMenuSwipeStartY && Math.abs(motionEvent.getX(iFindPointerIndex) - this.cleoMenuSwipeStartX) <= iCleoMenuTouchWidth2 * 0.33f) {
                z = true;
            }
            resetCleoMenuSwipe();
            if (z) {
                openCleoMenuFromSwipe();
            }
        }
    }

    private final int dp(float f) {
        return (int) TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    private final View.OnTouchListener editObjectTouchListener(final int i, final boolean z) {
        final pk2 pk2Var = new pk2();
        return new View.OnTouchListener() { // from class: yt0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                GameActivity.editObjectTouchListener$lambda$0(pk2Var, this, i, z, 50L, view, motionEvent);
                return true;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean editObjectTouchListener$lambda$0(pk2 pk2Var, GameActivity gameActivity, int i, boolean z, long j, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            view.performClick();
            pk2Var.f = System.currentTimeMillis();
            gameActivity.attachEditClick(i, z);
            return true;
        }
        if (actionMasked != 2) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - pk2Var.f < j) {
            return true;
        }
        pk2Var.f = jCurrentTimeMillis;
        gameActivity.attachEditClick(i, z);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void exitGame$lambda$0(GameActivity gameActivity) {
        if (gameActivity.isFinishing() || gameActivity.isDestroyed()) {
            return;
        }
        ti tiVar = ui.a;
        ui.a("GameActivity", "Finishing game activity on the UI thread");
        Intent className = new Intent().setClassName(gameActivity.getPackageName(), "top.th1nk.samp.MainActivity");
        className.addFlags(131072);
        gameActivity.startActivity(className);
        gameActivity.finish();
        System.exit(0);
    }

    private final synchronized void finishPluginSession() {
        try {
            if (this.pluginSessionStarted) {
                ja2 ja2Var = this.pluginSessionRecovery;
                if (ja2Var == null) {
                    s51.F("pluginSessionRecovery");
                    throw null;
                }
                ja2Var.b();
            }
            if (!this.pluginRuntimeShutdown) {
                try {
                    nativeShutdownPlugins();
                } catch (UnsatisfiedLinkError unused) {
                }
                this.pluginRuntimeShutdown = true;
            }
            if (this.pluginSessionStarted) {
                this.pluginSessionStarted = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int gameFontSize_delegate$lambda$0(GameActivity gameActivity) {
        return y02.h(gameActivity.getIntent().getIntExtra("font_size", 10), 8, 16);
    }

    private final nw getCleoScriptRepository() {
        return (nw) this.cleoScriptRepository$delegate.getValue();
    }

    private final Vibrator getCleoVibrator() {
        if (Build.VERSION.SDK_INT < 31) {
            return (Vibrator) getSystemService(Vibrator.class);
        }
        VibratorManager vibratorManagerE = s7.e(getSystemService(s7.r()));
        if (vibratorManagerE != null) {
            return vibratorManagerE.getDefaultVibrator();
        }
        return null;
    }

    private final int getGameFontSize() {
        return ((Number) this.gameFontSize$delegate.getValue()).intValue();
    }

    private final qp2 getLaunchClientVersion() {
        return (qp2) this.launchClientVersion$delegate.getValue();
    }

    private final String getLaunchClientVersionName() {
        return (String) this.launchClientVersionName$delegate.getValue();
    }

    private final String getLaunchLanguageTag() {
        return (String) this.launchLanguageTag$delegate.getValue();
    }

    private final String getLaunchNickname() {
        return (String) this.launchNickname$delegate.getValue();
    }

    private final boolean getNativeKeyboardEnabled() {
        return ((Boolean) this.nativeKeyboardEnabled$delegate.getValue()).booleanValue();
    }

    private final boolean getRadarAtBottomLeft() {
        return ((Boolean) this.radarAtBottomLeft$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qy2 getServerRepository() {
        return (qy2) this.serverRepository$delegate.getValue();
    }

    private final boolean getShowChatTimestamp() {
        return ((Boolean) this.showChatTimestamp$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleBackPress() {
        if (!nativeCancelTextDrawSelection()) {
            if (this.cleoMenuOverlay == null) {
                if (getTabVisible()) {
                    hideTab();
                    return true;
                }
                sz2 sz2Var = this.settingsMenu;
                if (sz2Var != null && sz2Var.b()) {
                    sz2 sz2Var2 = this.settingsMenu;
                    if (sz2Var2 != null) {
                        sz2Var2.c();
                        return true;
                    }
                    s51.F("settingsMenu");
                    throw null;
                }
                FrameLayout frameLayout = this.chatInputOverlay;
                if (frameLayout != null && frameLayout.getVisibility() == 0) {
                    hideChatInput(false);
                    return true;
                }
                if (getNativeKeyboardEnabled() && getKeyboardVisible()) {
                    hideNativeChatKeyboard();
                    setKeyboardVisible(false);
                    return true;
                }
                if (!getEditObjectVisible()) {
                    if (getDialogVisible()) {
                        cancelActiveDialog();
                        return true;
                    }
                    sendBackToNativeMenu();
                    return true;
                }
                try {
                    exitEditObject();
                } catch (UnsatisfiedLinkError e) {
                    ti tiVar = ui.a;
                    ui.c(ti.j, "GameActivity", "exitEditObject failed", e);
                }
                hideEditObject();
                return true;
            }
            boolean z = this.cleoMenuQuickLauncher;
            removeCleoMenuOverlay();
            if (!z) {
                try {
                    nativeCleoMenuClosed();
                } catch (Throwable unused) {
                }
            }
        }
        return true;
    }

    private final boolean handleNativeChatTouch(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.nativeChatLastTouchY = motionEvent.getY();
            this.nativeChatTouchMoved = false;
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                float y = motionEvent.getY() - this.nativeChatLastTouchY;
                int iDp = dp(12.0f);
                if (iDp < 1) {
                    iDp = 1;
                }
                float f = iDp;
                if (Math.abs(y) >= f) {
                    this.nativeChatTouchMoved = true;
                    int iAbs = (int) (Math.abs(y) / f);
                    if (iAbs < 1) {
                        iAbs = 1;
                    }
                    if (y <= 0.0f) {
                        iAbs = -iAbs;
                    }
                    scrollNativeChat(iAbs);
                    this.nativeChatLastTouchY = motionEvent.getY();
                }
            }
        } else if (!this.nativeChatTouchMoved) {
            showChatInput();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideChatInput(boolean z) {
        Editable text;
        FrameLayout frameLayout = this.chatInputOverlay;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            return;
        }
        Object systemService = getSystemService("input_method");
        String string = null;
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(frameLayout.getWindowToken(), 0);
        }
        frameLayout.setTranslationY(0.0f);
        if (z) {
            EditText editText = this.chatInputEditText;
            if (editText != null && (text = editText.getText()) != null) {
                string = text.toString();
            }
            if (string == null) {
                string = "";
            }
            if (!y93.q0(string)) {
                this.chatHistory.add(string);
                if (this.chatHistory.size() > 10) {
                    this.chatHistory.remove(0);
                }
                try {
                    Charset charset = StandardCharsets.UTF_8;
                    charset.getClass();
                    byte[] bytes = string.getBytes(charset);
                    bytes.getClass();
                    onInputEnd(bytes);
                } catch (UnsatisfiedLinkError e) {
                    ti tiVar = ui.a;
                    ui.c(ti.j, "GameActivity", "onInputEnd failed", e);
                }
            }
        }
        frameLayout.setVisibility(8);
        setKeyboardVisible(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideCleoDialogIfId$lambda$0(GameActivity gameActivity, int i) throws Throwable {
        if (gameActivity.activeDialogId == i) {
            showNativeDialog$default(gameActivity, -1, 0, "", "", "", "", null, 64, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideDlModelProgress$lambda$0(GameActivity gameActivity, long j) {
        if (gameActivity.dlModelProgressRequest.get() == j) {
            gameActivity.removeDlModelProgressOverlay();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideEditObject$lambda$0(GameActivity gameActivity) {
        FrameLayout frameLayout = gameActivity.editObjectOverlay;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    private final void hideNativeChatKeyboard() {
        try {
            hideChatKeyboard();
        } catch (UnsatisfiedLinkError e) {
            ti tiVar = ui.a;
            ui.c(ti.j, "GameActivity", "hideChatKeyboard failed", e);
        }
    }

    private final void hideNativeChatOverlay() {
        TextView textView = this.nativeChatText;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ft1 ft1Var = this.nativeChatScrollBar;
        if (ft1Var != null) {
            ft1Var.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideNativeTextDraw$lambda$0(GameActivity gameActivity, int i) throws Throwable {
        if (gameActivity.isFinishing() || gameActivity.isDestroyed()) {
            return;
        }
        nt1 nt1Var = gameActivity.nativeTextDrawView;
        if (nt1Var != null) {
            nt1Var.g.remove(Integer.valueOf(i));
            nt1Var.h.remove(Integer.valueOf(i));
            if (nt1Var.f.remove(Integer.valueOf(i)) != null) {
                nt1Var.invalidate();
            }
        }
        gameActivity.syncNativeTextDrawRuns(i);
    }

    private final void hideSettingsMenu() {
        sz2 sz2Var = this.settingsMenu;
        if (sz2Var != null) {
            sz2Var.c();
        } else {
            s51.F("settingsMenu");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideTab$lambda$0(GameActivity gameActivity) {
        FrameLayout frameLayout = gameActivity.nativeTabOverlay;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        gameActivity.setTabVisible(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideWithoutReset$lambda$0(GameActivity gameActivity) {
        nt1 nt1Var = gameActivity.nativeTextDrawView;
        if (nt1Var != null) {
            nt1Var.setVisibility(8);
        }
        gameActivity.nativeChatHiddenByPause = true;
        gameActivity.hideNativeChatOverlay();
        gameActivity.hideTab();
        gameActivity.hideChatInput(false);
    }

    private final void highlightCleoMenuRows() {
        GameActivity gameActivity;
        GradientDrawable gradientDrawableRoundedDrawable$default;
        int i = 0;
        for (Object obj : this.cleoMenuRows) {
            int i2 = i + 1;
            if (i < 0) {
                vr.b0();
                throw null;
            }
            TextView textView = (TextView) obj;
            if (this.cleoMenuQuickLauncher) {
                gameActivity = this;
                gradientDrawableRoundedDrawable$default = roundedDrawable$default(gameActivity, i % 2 == 0 ? 452984831 : 234881023, 6.0f, 0, 0.0f, 12, null);
            } else {
                gameActivity = this;
                gradientDrawableRoundedDrawable$default = i == gameActivity.cleoMenuSelectedIndex ? roundedDrawable$default(gameActivity, 1715301375, 6.0f, 0, 0.0f, 12, null) : roundedDrawable$default(gameActivity, 0, 6.0f, 0, 0.0f, 12, null);
            }
            textView.setBackground(gradientDrawableRoundedDrawable$default);
            i = i2;
            this = gameActivity;
        }
    }

    private final void highlightSelectedDialogRow(LinearLayout linearLayout, int i) {
        GameActivity gameActivity;
        GradientDrawable gradientDrawableRoundedDrawable$default;
        int childCount = linearLayout.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = linearLayout.getChildAt(i2);
            if (i2 == i) {
                gradientDrawableRoundedDrawable$default = this.roundedDrawable(1715301375, 8.0f, 1720296703, 1.0f);
                gameActivity = this;
            } else {
                gameActivity = this;
                gradientDrawableRoundedDrawable$default = roundedDrawable$default(gameActivity, 0, 8.0f, 0, 0.0f, 12, null);
            }
            childAt.setBackground(gradientDrawableRoundedDrawable$default);
            i2++;
            this = gameActivity;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean importCleoScript(Uri uri) {
        ti tiVar = ti.i;
        Object objE = getCleoScriptRepository().e(uri);
        Throwable thA = rn2.a(objE);
        if (thA != null) {
            ti tiVar2 = ui.a;
            ui.c(tiVar, "GameActivity", "Failed to import CLEO file", thA);
        }
        boolean z = objE instanceof qn2;
        boolean z2 = !z;
        if (!z) {
            try {
                nativeRefreshCleoScripts();
                return z2;
            } catch (UnsatisfiedLinkError e) {
                ti tiVar3 = ui.a;
                ui.c(tiVar, "GameActivity", "Failed to refresh CLEO catalog", e);
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void initializePluginRuntimeAndSamp() {
        ArrayList arrayList;
        Object qn2Var;
        y92 y92Var = this.pluginRepository;
        Object obj = null;
        if (y92Var == null) {
            s51.F("pluginRepository");
            throw null;
        }
        h01 h01Var = y92.i;
        f82 f82Var = f82.Multiplayer;
        Iterable iterable = (Iterable) y92Var.f.getValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : iterable) {
            if (((y31) obj2).c) {
                arrayList2.add(obj2);
            }
        }
        HashSet hashSet = new HashSet();
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            hashSet.add(((y31) obj3).a.b);
        }
        ArrayList arrayListP = y92Var.p(hashSet, f82Var);
        HashSet hashSet2 = new HashSet();
        int size2 = arrayListP.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj4 = arrayListP.get(i3);
            i3++;
            hashSet2.add(((fa2) obj4).a);
        }
        this.sessionEnabledPluginIds = hashSet2;
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayListP.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj5 = arrayListP.get(i4);
            i4++;
            if (((fa2) obj5).h == p72.h) {
                arrayList3.add(obj5);
            }
        }
        this.restartPluginsAtLaunch = arrayList3;
        lf2 lf2Var = this.quickCommandsRepo;
        if (lf2Var == null) {
            s51.F("quickCommandsRepo");
            throw null;
        }
        y92 y92Var2 = this.pluginRepository;
        if (y92Var2 == null) {
            s51.F("pluginRepository");
            throw null;
        }
        int i5 = 3;
        int i6 = 2;
        int i7 = 4;
        int i8 = 1;
        this.settingsMenu = new sz2(this, lf2Var, y92Var2, this.sessionEnabledPluginIds, new ot0(i, this), new ot0(i5, this), new qt0(i6, this), new ir(i7, this), new gt0(i8, this), new pt0(i8, this), new ot0(i7, this), new pt0(i6, this), new pt0(i5, this), new pt0(i7, this), new pt0(i, this), new ot0(1, this), new qt0(0, this), new qt0(1, this), new ot0(2, this));
        addSettingsMenuOverlay();
        try {
            ja2 ja2Var = this.pluginSessionRecovery;
            if (ja2Var == null) {
                s51.F("pluginSessionRecovery");
                throw null;
            }
            try {
                ja2Var.c.delete();
                String string = UUID.randomUUID().toString();
                string.getClass();
                arrayList = arrayListP;
                try {
                    ja2Var.e(string, arrayList);
                    qn2Var = string;
                } catch (Throwable th) {
                    th = th;
                    qn2Var = new qn2(th);
                }
            } catch (Throwable th2) {
                th = th2;
                arrayList = arrayListP;
            }
            if (!(qn2Var instanceof qn2)) {
                obj = qn2Var;
            }
            String str = (String) obj;
            this.pluginSessionStarted = str != null;
            if (str == null) {
                str = "";
            }
            nativeConfigurePluginCrashSession(str);
            configureNativePlugins(arrayList);
            setServerTextEncoding(getIntent().getIntExtra("server_text_encoding", 2));
            initializeSAMP();
        } catch (UnsatisfiedLinkError e) {
            ti tiVar = ui.a;
            ui.c(ti.j, "GameActivity", "initializeSAMP failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List initializePluginRuntimeAndSamp$lambda$10(GameActivity gameActivity) {
        ti tiVar = ti.i;
        ni0 ni0Var = ni0.f;
        try {
            return y02.z(gameActivity.nativeGetPluginMenus());
        } catch (RuntimeException e) {
            ti tiVar2 = ui.a;
            ui.c(tiVar, "GameActivity", "Failed to parse plugin menus", e);
            return ni0Var;
        } catch (UnsatisfiedLinkError e2) {
            ti tiVar3 = ui.a;
            ui.c(tiVar, "GameActivity", "Failed to read plugin menus", e2);
            return ni0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long initializePluginRuntimeAndSamp$lambda$11(GameActivity gameActivity) {
        try {
            return gameActivity.nativeGetPluginMenuRevision();
        } catch (UnsatisfiedLinkError e) {
            ti tiVar = ui.a;
            ui.c(ti.i, "GameActivity", "Failed to read plugin menu revision", e);
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List initializePluginRuntimeAndSamp$lambda$12(GameActivity gameActivity) {
        ti tiVar = ti.i;
        ni0 ni0Var = ni0.f;
        try {
            return jo3.u(gameActivity.nativeGetPluginStatuses());
        } catch (RuntimeException e) {
            ti tiVar2 = ui.a;
            ui.c(tiVar, "GameActivity", "Failed to parse plugin statuses", e);
            return ni0Var;
        } catch (UnsatisfiedLinkError e2) {
            ti tiVar3 = ui.a;
            ui.c(tiVar, "GameActivity", "Failed to read plugin statuses", e2);
            return ni0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dm3 initializePluginRuntimeAndSamp$lambda$13(GameActivity gameActivity, d82 d82Var) {
        d82Var.getClass();
        try {
            gameActivity.nativePluginControlChanged(d82Var.a, d82Var.b, d82Var.c, d82Var.d, d82Var.e);
        } catch (UnsatisfiedLinkError e) {
            ti tiVar = ui.a;
            ui.c(ti.i, "GameActivity", "Failed to dispatch plugin control change", e);
        }
        return dm3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dm3 initializePluginRuntimeAndSamp$lambda$14(GameActivity gameActivity, String str, boolean z) {
        str.getClass();
        try {
            gameActivity.nativePluginMenuVisibilityChanged(str, z);
        } catch (UnsatisfiedLinkError e) {
            ti tiVar = ui.a;
            ui.c(ti.i, "GameActivity", "Failed to dispatch plugin menu visibility", e);
        }
        return dm3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dm3 initializePluginRuntimeAndSamp$lambda$15(GameActivity gameActivity, String str, boolean z) {
        Object next;
        str.getClass();
        y92 y92Var = gameActivity.pluginRepository;
        if (y92Var == null) {
            s51.F("pluginRepository");
            throw null;
        }
        Iterator it = ((Iterable) y92Var.g.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (s51.n(((y31) next).a.b, str)) {
                break;
            }
        }
        y31 y31Var = (y31) next;
        if ((y31Var != null ? y31Var.a.h : null) == p72.g) {
            Set<String> set = gameActivity.sessionEnabledPluginIds;
            gameActivity.sessionEnabledPluginIds = z ? oz2.F(set, str) : oz2.A(set, str);
            gameActivity.configurePluginsForCurrentSession();
        }
        return dm3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.dm3 initializePluginRuntimeAndSamp$lambda$16(top.th1nk.samp.feature.game.GameActivity r5, java.lang.String r6) {
        /*
            r6.getClass()
            y92 r0 = r5.pluginRepository
            java.lang.String r1 = "pluginRepository"
            r2 = 0
            if (r0 == 0) goto L81
            i93 r0 = r0.g
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r0.next()
            r4 = r3
            y31 r4 = (defpackage.y31) r4
            k82 r4 = r4.a
            java.lang.String r4 = r4.b
            boolean r4 = defpackage.s51.n(r4, r6)
            if (r4 == 0) goto L16
            goto L2f
        L2e:
            r3 = r2
        L2f:
            y31 r3 = (defpackage.y31) r3
            if (r3 == 0) goto L38
            k82 r0 = r3.a
            p72 r0 = r0.h
            goto L39
        L38:
            r0 = r2
        L39:
            y92 r3 = r5.pluginRepository
            if (r3 == 0) goto L7d
            ea2 r3 = r3.n(r6)
            boolean r4 = r3 instanceof defpackage.da2
            if (r4 == 0) goto L7a
            p72 r4 = defpackage.p72.g
            if (r0 != r4) goto L7a
            da2 r3 = (defpackage.da2) r3
            y31 r0 = r3.a
            k82 r0 = r0.a
            p72 r0 = r0.h
            if (r0 != r4) goto L6f
            y92 r0 = r5.pluginRepository
            if (r0 == 0) goto L6b
            java.util.Set r1 = java.util.Collections.singleton(r6)
            r1.getClass()
            f82 r2 = defpackage.f82.Multiplayer
            java.util.ArrayList r0 = r0.p(r1, r2)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6f
            goto L77
        L6b:
            defpackage.s51.F(r1)
            throw r2
        L6f:
            java.util.Set<java.lang.String> r0 = r5.sessionEnabledPluginIds
            java.util.LinkedHashSet r6 = defpackage.oz2.A(r0, r6)
            r5.sessionEnabledPluginIds = r6
        L77:
            r5.configurePluginsForCurrentSession()
        L7a:
            dm3 r5 = defpackage.dm3.a
            return r5
        L7d:
            defpackage.s51.F(r1)
            throw r2
        L81:
            defpackage.s51.F(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.th1nk.samp.feature.game.GameActivity.initializePluginRuntimeAndSamp$lambda$16(top.th1nk.samp.feature.game.GameActivity, java.lang.String):dm3");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dm3 initializePluginRuntimeAndSamp$lambda$2(GameActivity gameActivity, String str) {
        str.getClass();
        try {
            gameActivity.nativeSendQuickCommand(str);
        } catch (UnsatisfiedLinkError e) {
            ti tiVar = ui.a;
            ui.c(ti.i, "GameActivity", "nativeSendQuickCommand failed", e);
        }
        gameActivity.hideSettingsMenu();
        return dm3.a;
    }

    private static final boolean initializePluginRuntimeAndSamp$lambda$3(GameActivity gameActivity, int i) {
        gameActivity.getClass();
        try {
            return gameActivity.nativeIsRpcFilterEnabled(i);
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dm3 initializePluginRuntimeAndSamp$lambda$4(GameActivity gameActivity, int i, boolean z) {
        gameActivity.getClass();
        try {
            gameActivity.nativeSetRpcFilter(i, z);
        } catch (UnsatisfiedLinkError unused) {
        }
        return dm3.a;
    }

    private static final boolean initializePluginRuntimeAndSamp$lambda$5(GameActivity gameActivity, int i, int i2, int i3) {
        gameActivity.getClass();
        try {
            return gameActivity.nativeIsNetworkPacketFilterEnabled(i, i2, i3);
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dm3 initializePluginRuntimeAndSamp$lambda$6(GameActivity gameActivity, int i, int i2, int i3, boolean z) {
        gameActivity.getClass();
        try {
            gameActivity.nativeSetNetworkPacketFilter(i, i2, i3, z);
        } catch (UnsatisfiedLinkError unused) {
        }
        return dm3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List initializePluginRuntimeAndSamp$lambda$7(GameActivity gameActivity) {
        try {
            return uj.Z(gameActivity.nativeGetCleoScripts());
        } catch (UnsatisfiedLinkError e) {
            ti tiVar = ui.a;
            ui.c(ti.i, "GameActivity", "Failed to read CLEO scripts", e);
            return ni0.f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initializePluginRuntimeAndSamp$lambda$8(GameActivity gameActivity, String str) {
        str.getClass();
        try {
            return gameActivity.nativeStartCleoScript(str);
        } catch (UnsatisfiedLinkError e) {
            ti tiVar = ui.a;
            ui.c(ti.i, "GameActivity", "Failed to start CLEO script", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dm3 initializePluginRuntimeAndSamp$lambda$9(GameActivity gameActivity) {
        gameActivity.cleoScriptPicker.a(new String[]{"*/*"});
        return dm3.a;
    }

    private final boolean isCleoMenuBottomRegion(float f, int i) {
        return f / ((float) i) > 0.66f;
    }

    private final boolean isCleoMenuCenterColumn(float f, int i) {
        float f2 = f / i;
        return f2 >= 0.33f && f2 <= 0.66f;
    }

    private final boolean isCleoMenuTopRegion(float f, int i) {
        return f / ((float) i) < 0.33f;
    }

    public static void j0(int i, GameActivity gameActivity) {
        gameActivity.updateServerNotification(i - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String launchClientVersionName_delegate$lambda$0(GameActivity gameActivity) {
        qy2 serverRepository = gameActivity.getServerRepository();
        String stringExtra = gameActivity.getIntent().getStringExtra("client_version_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        qp2 launchClientVersion = gameActivity.getLaunchClientVersion();
        serverRepository.getClass();
        return qy2.f(stringExtra, launchClientVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qp2 launchClientVersion_delegate$lambda$0(GameActivity gameActivity) {
        Object next;
        int intExtra = gameActivity.getIntent().getIntExtra("client_version", 0);
        qp2.h.getClass();
        Iterator it = qp2.k.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((qp2) next).g == intExtra) {
                break;
            }
        }
        qp2 qp2Var = (qp2) next;
        return qp2Var == null ? qp2.i : qp2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String launchLanguageTag_delegate$lambda$0(GameActivity gameActivity) {
        String stringExtra = gameActivity.getIntent().getStringExtra("language_tag");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return gameActivity.sanitizeLaunchLanguageTag(stringExtra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String launchNickname_delegate$lambda$0(GameActivity gameActivity) {
        String stringExtra = gameActivity.getIntent().getStringExtra("nickname");
        String string = stringExtra != null ? y93.G0(stringExtra).toString() : null;
        if (string == null) {
            string = "";
        }
        return y93.q0(string) ? "Player" : string;
    }

    private final int maxDialogContentWidth() {
        return y02.h((int) (getResources().getDisplayMetrics().widthPixels * 0.72f), dp(280.0f), dp(620.0f));
    }

    private final int maxNativeChatScrollOffset() {
        int size = this.nativeChatLines.size() - 9;
        if (size < 0) {
            return 0;
        }
        return size;
    }

    private final int measureDialogMessageWidth(String str, int i) {
        TextView textView = new TextView(this);
        textView.setText(buildChatLine(str, -1183753));
        textView.setTextSize(2, getGameFontSize() + 1.5f);
        textView.setLineSpacing(dp(1.0f), 1.0f);
        textView.setPadding(dp(4.0f), dp(4.0f), dp(4.0f), dp(4.0f));
        textView.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredWidth();
    }

    public static void n0(GameActivity gameActivity) {
        gameActivity.readAndLockChatPosition();
    }

    private final native void nativeCleoBreakpointResumed();

    private final native void nativeCleoMenuClosed();

    private final native void nativeCleoMenuItemSelected(int i);

    private final native void nativeConfigurePluginCrashSession(String str);

    private final native void nativeConfigurePlugins(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7, String[] strArr8);

    private final native String[] nativeGetCleoScripts();

    private final native long nativeGetPluginMenuRevision();

    private final native String nativeGetPluginMenus();

    private final native String nativeGetPluginStatuses();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOnDlModelDownloadProgress(long j, int i, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOnDlModelDownloadResult(long j, int i, String str, boolean z, long j2);

    private final native void nativePluginControlChanged(String str, String str2, String str3, String str4, String str5);

    private final native void nativePluginMenuVisibilityChanged(String str, boolean z);

    private final native void nativeRefreshCleoScripts();

    private final native void nativeSetTextDrawNativeRuns(int i, String[] strArr, float[] fArr, int[] iArr, boolean[] zArr);

    private final native void nativeShutdownPlugins();

    private final native boolean nativeStartCleoScript(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeUpdateCleoDialogInput(byte[] bArr);

    private final native void nativeUpdateCleoDialogListItem(int i);

    private final int normalizeChatColor(int i) {
        if (i == 0) {
            return -1;
        }
        return ((i >>> 24) & 255) == 0 ? (16777215 & i) | (-16777216) : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [ni0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    private final void openCleoMenuFromSwipe() {
        ?? arrayList;
        try {
            List listZ = uj.Z(nativeGetCleoScripts());
            arrayList = new ArrayList();
            for (Object obj : listZ) {
                if (!y93.q0((String) obj)) {
                    arrayList.add(obj);
                }
            }
        } catch (UnsatisfiedLinkError e) {
            ti tiVar = ui.a;
            ui.c(ti.i, "GameActivity", "Failed to read CLEO scripts for swipe menu", e);
            arrayList = ni0.f;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        removeCleoMenuArrowOverlay();
        ti tiVar2 = ui.a;
        ui.c(ti.g, "GameActivity", by1.h("Opening CLEO swipe menu with ", " script(s)", arrayList.size()), null);
        String string = getString(2131624011);
        string.getClass();
        String string2 = getString(2131624006);
        string2.getClass();
        showCleoMenuInternal(string, string2, (String[]) arrayList.toArray(new String[0]), 0, true);
    }

    private final int parseSampColor(String str, int i) {
        Object qn2Var;
        int iRgb;
        try {
            int length = str.length();
            if (length == 6) {
                String strSubstring = str.substring(0, 2);
                ur.r(16);
                int i2 = Integer.parseInt(strSubstring, 16);
                String strSubstring2 = str.substring(2, 4);
                ur.r(16);
                int i3 = Integer.parseInt(strSubstring2, 16);
                String strSubstring3 = str.substring(4, 6);
                ur.r(16);
                iRgb = Color.rgb(i2, i3, Integer.parseInt(strSubstring3, 16));
            } else if (length != 8) {
                iRgb = normalizeChatColor(i);
            } else {
                ur.r(16);
                int i4 = (int) Long.parseLong(str, 16);
                int i5 = i4 & 255;
                int i6 = (i4 >>> 24) & 255;
                iRgb = (i5 == 255 || i5 == 0) ? Color.rgb(i6, (i4 >>> 16) & 255, (i4 >>> 8) & 255) : (i6 == 255 || i6 == 0) ? Color.rgb((i4 >>> 16) & 255, (i4 >>> 8) & 255, i5) : Color.rgb(i6, (i4 >>> 16) & 255, (i4 >>> 8) & 255);
            }
            qn2Var = Integer.valueOf(iRgb);
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        if (rn2.a(qn2Var) != null) {
            qn2Var = Integer.valueOf(normalizeChatColor(i));
        }
        return ((Number) qn2Var).intValue();
    }

    private final void prepareGtasaCompatLaunch() {
        this.expansionFileName = "";
        this.patchFileName = "";
        getPackageName();
        this.apkFileName = getApplicationInfo().sourceDir;
        this.baseDirectory = GetGameBaseDirectory();
        this.AllowLongPressForExit = true;
        this.xAPKS = null;
        this.wantsMultitouch = true;
        this.wantsAccelerometer = true;
        RestoreCurrentLanguage();
        ti tiVar = ui.a;
        String strG = by1.g("GTASA baseDirectory: ", this.baseDirectory);
        ti tiVar2 = ti.g;
        ui.c(tiVar2, "GameActivity", strG, null);
        ui.c(tiVar2, "GameActivity", "GTASA apkFileName: " + this.apkFileName, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean radarAtBottomLeft_delegate$lambda$0(GameActivity gameActivity) {
        return s51.n(gameActivity.getIntent().getStringExtra("radar_position"), "bottom_left");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readAndLockChatPosition() {
        FrameLayout.LayoutParams layoutParams;
        TextView textView = this.nativeChatText;
        if (textView == null) {
            return;
        }
        if (getRadarAtBottomLeft()) {
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            layoutParams = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams == null) {
                return;
            }
            layoutParams.leftMargin = dp(16.0f);
            textView.setLayoutParams(layoutParams);
            updateNativeChatScrollBarPosition(layoutParams);
            return;
        }
        try {
            float[] radarScreenRect = getRadarScreenRect();
            if (radarScreenRect != null && radarScreenRect.length >= 4) {
                int i = (int) radarScreenRect[2];
                int i2 = (int) radarScreenRect[0];
                if (i > 0 && i2 >= 0 && i2 < i) {
                    ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                    layoutParams = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
                    if (layoutParams == null) {
                        return;
                    }
                    layoutParams.leftMargin = i + dp(8.0f);
                    textView.setLayoutParams(layoutParams);
                    updateNativeChatScrollBarPosition(layoutParams);
                    return;
                }
            }
        } catch (UnsatisfiedLinkError unused) {
        }
        textView.postDelayed(new ft0(12, this), 2000L);
    }

    private final void refreshDlModelProgressTitle() {
        int i;
        if (!this.dlModelProgressTotalKnown) {
            TextView textView = this.dlModelProgressTitle;
            if (textView != null) {
                textView.setText(2131624016);
            }
            ProgressBar progressBar = this.dlModelProgressBar;
            if (progressBar != null) {
                progressBar.setProgress(0);
                return;
            }
            return;
        }
        Collection<Integer> collectionValues = this.dlModelProgressValues.values();
        collectionValues.getClass();
        Collection<Integer> collection = collectionValues;
        int iH = 100;
        if (collection.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = collection.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((Integer) it.next()).intValue() >= 100 && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        int i2 = this.dlModelProgressTotal;
        if (i2 != 0) {
            Collection<Integer> collectionValues2 = this.dlModelProgressValues.values();
            collectionValues2.getClass();
            iH = y02.h(qx.H0(collectionValues2) / i2, 0, 100);
        }
        TextView textView2 = this.dlModelProgressTitle;
        if (textView2 != null) {
            textView2.setText(getString(2131624018, Integer.valueOf(i), Integer.valueOf(i2)));
        }
        ProgressBar progressBar2 = this.dlModelProgressBar;
        if (progressBar2 != null) {
            progressBar2.setProgress(iH);
        }
        if (i2 <= 0 || i < i2) {
            return;
        }
        removeDlModelProgressOverlay();
    }

    private final void refreshNativeChatText() {
        TextView textView = this.nativeChatText;
        if (textView == null) {
            return;
        }
        int size = this.nativeChatLines.size() - this.nativeChatScrollOffset;
        int i = size - 9;
        if (i < 0) {
            i = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        while (i < size) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) this.nativeChatLines.get(i));
            i++;
        }
        textView.setText(spannableStringBuilder);
        updateNativeChatScrollBar();
        textView.post(new ft0(14, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void refreshPluginClipboardCache() {
        /*
            r3 = this;
            java.lang.String r0 = "clipboard"
            java.lang.Object r0 = r3.getSystemService(r0)
            boolean r1 = r0 instanceof android.content.ClipboardManager
            r2 = 0
            if (r1 == 0) goto Le
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L45
            android.content.ClipData r0 = r0.getPrimaryClip()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L45
            int r1 = r0.getItemCount()     // Catch: java.lang.Throwable -> L3e
            if (r1 <= 0) goto L1e
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 == 0) goto L45
            r1 = 0
            android.content.ClipData$Item r0 = r0.getItemAt(r1)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L45
            java.lang.CharSequence r0 = r0.coerceToText(r3)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L45
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L45
            java.nio.charset.Charset r1 = defpackage.ys.a     // Catch: java.lang.Throwable -> L3e
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L3e
            r0.getClass()     // Catch: java.lang.Throwable -> L3e
            goto L46
        L3e:
            r0 = move-exception
            qn2 r1 = new qn2
            r1.<init>(r0)
            goto L47
        L45:
            r0 = r2
        L46:
            r1 = r0
        L47:
            boolean r0 = r1 instanceof defpackage.qn2
            if (r0 == 0) goto L4d
            goto L4e
        L4d:
            r2 = r1
        L4e:
            byte[] r2 = (byte[]) r2
            r3.pluginClipboardCache = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: top.th1nk.samp.feature.game.GameActivity.refreshPluginClipboardCache():void");
    }

    private final void registerPluginClipboardListener() {
        Object systemService = getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.addPrimaryClipChangedListener(this.pluginClipboardListener);
        refreshPluginClipboardCache();
    }

    private final void removeActiveDialogOverlay() {
        FrameLayout frameLayout = this.activeDialogOverlay;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        this.activeDialogOverlay = null;
        this.activeDialogInput = null;
        this.activeDialogListContainer = null;
        this.activeDialogSelectedInputText = "";
        this.activeDialogSelectedInputBytes = new byte[0];
        ni0 ni0Var = ni0.f;
        this.activeDialogSelectableInputText = ni0Var;
        this.activeDialogSelectableInputBytes = ni0Var;
        this.activeDialogLastClickItem = -1;
        this.activeDialogLastClickTime = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeCleoBreakpointOverlay() {
        FrameLayout frameLayout = this.cleoBreakpointOverlay;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        this.cleoBreakpointOverlay = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeCleoMenuArrowOverlay() {
        FrameLayout frameLayout = this.cleoMenuArrowOverlay;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        this.cleoMenuArrowOverlay = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeCleoMenuOverlay() {
        FrameLayout frameLayout = this.cleoMenuOverlay;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        this.cleoMenuOverlay = null;
        this.cleoMenuRows = ni0.f;
        this.cleoMenuSelectedIndex = -1;
        this.cleoMenuQuickLauncher = false;
    }

    private final void removeDlModelProgressOverlay() {
        ScrollView scrollView = this.dlModelProgressScroll;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.dlModelProgressScrollLayoutListener;
        if (scrollView != null && onGlobalLayoutListener != null && scrollView.getViewTreeObserver().isAlive()) {
            scrollView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        FrameLayout frameLayout = this.dlModelProgressOverlay;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        this.dlModelProgressOverlay = null;
        this.dlModelProgressTitle = null;
        this.dlModelProgressRows = null;
        this.dlModelProgressScroll = null;
        this.dlModelProgressBar = null;
        this.dlModelProgressTotal = 0;
        this.dlModelProgressTotalKnown = false;
        this.dlModelProgressValues.clear();
        this.dlModelProgressRowViews.clear();
        this.dlModelProgressAutoScroll = true;
        this.dlModelProgressProgrammaticScroll = false;
        this.dlModelProgressUserTouching = false;
        this.dlModelProgressContentHeight = 0;
        this.dlModelProgressScrollLayoutListener = null;
    }

    private final byte[] renderTextTexture(byte[] bArr, int i, boolean z, int i2, boolean z2) {
        SpannableString spannableStringBuildChatLine = buildChatLine(lq.p(bArr), normalizeChatColor(i2));
        if (spannableStringBuildChatLine.length() == 0) {
            return new byte[0];
        }
        int iDp = dp(3.0f);
        int i3 = iDp * 2;
        int i4 = 1024 - i3;
        if (i4 < 1) {
            i4 = 1;
        }
        int iH = y02.h((int) (getResources().getDisplayMetrics().widthPixels * 0.55f), dp(160.0f), dp(720.0f));
        if (iH <= i4) {
            i4 = iH;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(normalizeChatColor(i2));
        int i5 = i;
        if (i5 < 1) {
            i5 = 1;
        }
        textPaint.setTextSize(i5);
        textPaint.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        textPaint.setShadowLayer(2.0f, 1.0f, 1.0f, -16777216);
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(spannableStringBuildChatLine, 0, spannableStringBuildChatLine.length(), textPaint, i4).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).setLineSpacing(0.0f, 1.0f).build();
        staticLayoutBuild.getClass();
        int lineCount = staticLayoutBuild.getLineCount();
        int i6 = 1;
        for (int i7 = 0; i7 < lineCount; i7++) {
            int iCeil = (int) Math.ceil(staticLayoutBuild.getLineWidth(i7));
            if (i6 < iCeil) {
                i6 = iCeil;
            }
        }
        int iH2 = y02.h(i6 + i3, 1, i4 + i3);
        int iH3 = y02.h(iH2 <= 1 ? 1 : Integer.highestOneBit(iH2 - 1) << 1, 1, 1024);
        StaticLayout staticLayoutBuild2 = StaticLayout.Builder.obtain(spannableStringBuildChatLine, 0, spannableStringBuildChatLine.length(), textPaint, iH2 - i3).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).setLineSpacing(0.0f, 1.0f).build();
        staticLayoutBuild2.getClass();
        int height = staticLayoutBuild2.getHeight() + i3;
        if (height < 1) {
            height = 1;
        }
        int iH4 = y02.h(height <= 1 ? 1 : Integer.highestOneBit(height - 1) << 1, 1, 1024);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iH3, iH4, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0);
        float f = iDp;
        int iSave = canvas.save();
        canvas.translate(((iH3 - iH2) / 2.0f) + f, f);
        try {
            staticLayoutBuild2.draw(canvas);
            canvas.restoreToCount(iSave);
            int i8 = iH3 * iH4;
            int[] iArr = new int[i8];
            bitmapCreateBitmap.getPixels(iArr, 0, iH3, 0, 0, iH3, iH4);
            int i9 = z2 ? 12 : 8;
            byte[] bArr2 = new byte[(i8 * 4) + i9];
            lq.c0(bArr2, 0, iH3);
            lq.c0(bArr2, 4, iH4);
            if (z2) {
                lq.c0(bArr2, 8, staticLayoutBuild2.getLineCount());
            }
            for (int i10 = 0; i10 < i8; i10++) {
                int i11 = iArr[i10];
                bArr2[i9] = (byte) (i11 >>> 16);
                bArr2[i9 + 1] = (byte) (i11 >>> 8);
                int i12 = i9 + 3;
                bArr2[i9 + 2] = (byte) i11;
                i9 += 4;
                bArr2[i12] = (byte) (i11 >>> 24);
            }
            return bArr2;
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    private final void resetCleoMenuSwipe() {
        this.cleoMenuSwipePointerId = -1;
        this.cleoMenuSwipeStartX = 0.0f;
        this.cleoMenuSwipeStartY = 0.0f;
        this.cleoMenuSwipeStartTime = 0L;
    }

    private final String resolveNativeKeyboardLayout() {
        String launchLanguageTag = getLaunchLanguageTag();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = launchLanguageTag.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase.equals("ru") ? "ru" : "en";
    }

    private final GradientDrawable roundedDrawable(int i, float f, int i2, float f2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(dp(f));
        if (f2 > 0.0f) {
            gradientDrawable.setStroke(dp(f2), i2);
        }
        return gradientDrawable;
    }

    public static /* synthetic */ GradientDrawable roundedDrawable$default(GameActivity gameActivity, int i, float f, int i2, float f2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            f2 = 0.0f;
        }
        return gameActivity.roundedDrawable(i, f, i2, f2);
    }

    private final boolean runCleoDialogMutation(cs0 cs0Var) {
        if (s51.n(Looper.myLooper(), Looper.getMainLooper())) {
            return ((Boolean) cs0Var.a()).booleanValue();
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        runOnUiThread(new vb(atomicBoolean, cs0Var, countDownLatch, 2));
        return countDownLatch.await(1L, TimeUnit.SECONDS) && atomicBoolean.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runCleoDialogMutation$lambda$0(AtomicBoolean atomicBoolean, cs0 cs0Var, CountDownLatch countDownLatch) {
        try {
            atomicBoolean.set(((Boolean) cs0Var.a()).booleanValue());
        } finally {
            countDownLatch.countDown();
        }
    }

    public static /* synthetic */ dm3 s0(GameActivity gameActivity) {
        setupChatInputOverlay$lambda$4(gameActivity);
        return dm3.a;
    }

    private final String sanitizeLaunchLanguageTag(String str) {
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        if (iHashCode == 3241 ? lowerCase.equals("en") : iHashCode == 3651 ? lowerCase.equals("ru") : iHashCode == 3886 && lowerCase.equals("zh")) {
            locale.getClass();
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            return lowerCase2;
        }
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        locale.getClass();
        String lowerCase3 = language.toLowerCase(locale);
        lowerCase3.getClass();
        if (!lowerCase3.equals("zh") && !lowerCase3.equals("ru")) {
            return "en";
        }
        String language2 = Locale.getDefault().getLanguage();
        language2.getClass();
        locale.getClass();
        String lowerCase4 = language2.toLowerCase(locale);
        lowerCase4.getClass();
        return lowerCase4;
    }

    private final void scheduleCleoMenuStartupHint() {
        int i;
        if (this.cleoMenuStartupHintShown || this.cleoMenuStartupHintRunnable != null || (i = this.cleoMenuStartupHintChecks) >= 8) {
            return;
        }
        this.cleoMenuStartupHintChecks = i + 1;
        ft0 ft0Var = new ft0(18, this);
        this.cleoMenuStartupHintRunnable = ft0Var;
        getWindow().getDecorView().postDelayed(ft0Var, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleCleoMenuStartupHint$lambda$0(GameActivity gameActivity) {
        gameActivity.cleoMenuStartupHintRunnable = null;
        if (gameActivity.isFinishing() || gameActivity.isDestroyed() || gameActivity.cleoMenuStartupHintShown) {
            return;
        }
        try {
            for (String str : gameActivity.nativeGetCleoScripts()) {
                if (!y93.q0(str)) {
                    gameActivity.showCleoMenuArrow();
                    return;
                }
            }
        } catch (UnsatisfiedLinkError e) {
            if (gameActivity.cleoMenuStartupHintChecks == 1) {
                ti tiVar = ui.a;
                ui.c(ti.i, "GameActivity", "Failed to check CLEO scripts for startup hint", e);
            }
        }
        gameActivity.scheduleCleoMenuStartupHint();
    }

    private final void scrollDlModelProgressToBottom() {
        ScrollView scrollView = this.dlModelProgressScroll;
        if (scrollView != null && this.dlModelProgressAutoScroll && this.dlModelProgressScrollLayoutListener == null) {
            ou0 ou0Var = new ou0(this, scrollView);
            this.dlModelProgressScrollLayoutListener = ou0Var;
            scrollView.getViewTreeObserver().addOnGlobalLayoutListener(ou0Var);
            scrollView.requestLayout();
        }
    }

    private final void scrollNativeChat(int i) {
        if (this.nativeChatLines.isEmpty()) {
            return;
        }
        this.nativeChatScrollOffset = y02.h(this.nativeChatScrollOffset + i, 0, maxNativeChatScrollOffset());
        refreshNativeChatText();
    }

    private final void sendActiveDialogResponse(int i, String str) {
        int i2 = this.activeDialogId;
        if (i2 == -1) {
            return;
        }
        int i3 = this.activeDialogSelectedItem;
        if (str.length() == 0) {
            str = this.activeDialogSelectedInputText;
        }
        byte[] bytes = this.activeDialogSelectedInputBytes;
        if (bytes.length == 0) {
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            bytes = str.getBytes(charset);
            bytes.getClass();
        }
        this.activeDialogId = -1;
        this.activeDialogSelectedItem = -1;
        this.activeDialogSelectedInputText = "";
        this.activeDialogSelectedInputBytes = new byte[0];
        removeActiveDialogOverlay();
        setDialogVisible(false);
        try {
            setNativeDialogVisible(false);
        } catch (Throwable unused) {
        }
        sendDialogResponse(i2, i, i3, bytes);
    }

    private final void sendBackToNativeMenu() {
        try {
            nativeNotifyNativeInput();
            long jUptimeMillis = SystemClock.uptimeMillis();
            KeyEvent keyEvent = new KeyEvent(jUptimeMillis, jUptimeMillis, 0, 4, 0);
            KeyEvent keyEvent2 = new KeyEvent(jUptimeMillis, jUptimeMillis, 1, 4, 0);
            keyEvent(0, 4, 0, 0, keyEvent);
            keyEvent(1, 4, 0, 0, keyEvent2);
        } catch (UnsatisfiedLinkError e) {
            ti tiVar = ui.a;
            ui.c(ti.j, "GameActivity", "Failed to send BACK to native menu", e);
        }
    }

    private static final qy2 serverRepository_delegate$lambda$0(GameActivity gameActivity) {
        return new qy2(gameActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setCleoDialogInputOnUiThread(byte[] bArr) {
        if (this.activeDialogId == -1 || this.activeDialogInput == null) {
            return false;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 255);
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        String str = new String(bArrCopyOf, charset);
        this.activeDialogSelectedInputText = str;
        this.activeDialogSelectedInputBytes = bArrCopyOf;
        EditText editText = this.activeDialogInput;
        if (editText == null) {
            return true;
        }
        Editable text = editText.getText();
        if (!s51.n(text != null ? text.toString() : null, str)) {
            editText.setText(str);
        }
        editText.setSelection(editText.length());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setCleoDialogListItemOnUiThread(int i) {
        LinearLayout linearLayout;
        if (this.activeDialogId == -1 || (linearLayout = this.activeDialogListContainer) == null || i < 0 || i >= linearLayout.getChildCount()) {
            return false;
        }
        this.activeDialogSelectedItem = i;
        String str = (String) qx.s0(i, this.activeDialogSelectableInputText);
        if (str == null) {
            str = "";
        }
        this.activeDialogSelectedInputText = str;
        byte[] bArr = (byte[]) qx.s0(i, this.activeDialogSelectableInputBytes);
        this.activeDialogSelectedInputBytes = bArr != null ? Arrays.copyOf(bArr, bArr.length) : new byte[0];
        highlightSelectedDialogRow(linearLayout, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCleoMenuActiveIndex$lambda$0(int i, GameActivity gameActivity) {
        if (i < 0 || i >= gameActivity.cleoMenuRows.size()) {
            return;
        }
        gameActivity.cleoMenuSelectedIndex = i;
        gameActivity.highlightCleoMenuRows();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClipboardTextBytes$lambda$0(GameActivity gameActivity, byte[] bArr) {
        if (gameActivity.isFinishing() || gameActivity.isDestroyed()) {
            return;
        }
        Object systemService = gameActivity.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return;
        }
        bArr.getClass();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("plugin", new String(bArr, ys.a)));
    }

    private final void setDialogVisible(boolean z) {
        this.dialogVisible$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setEditObjectVisible(boolean z) {
        this.editObjectVisible$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setHudVisible(boolean z) {
        this.hudVisible$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setKeyboardVisible(boolean z) {
        this.keyboardVisible$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setLegacySystemBarColors() {
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setNavigationBarColor(-16777216);
        getWindow().setStatusBarColor(-16777216);
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
    }

    private final void setLoadingScreenVisible(boolean z) {
        this.loadingScreenVisible$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPauseState$lambda$0(boolean z, GameActivity gameActivity) {
        if (!z) {
            nt1 nt1Var = gameActivity.nativeTextDrawView;
            if (nt1Var != null) {
                nt1Var.setVisibility(0);
            }
            gameActivity.showNativeChatOverlayIfNeeded();
            FrameLayout frameLayout = gameActivity.dlModelProgressOverlay;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            pp2 pp2Var = gameActivity.sampButtonOverlay;
            if (pp2Var != null) {
                pp2Var.b(gameActivity.sampButtonsNativeVisible, gameActivity.sampButtonsExpanded);
                return;
            }
            return;
        }
        nt1 nt1Var2 = gameActivity.nativeTextDrawView;
        if (nt1Var2 != null) {
            nt1Var2.setVisibility(8);
        }
        gameActivity.hideNativeChatOverlay();
        gameActivity.hideTab();
        FrameLayout frameLayout2 = gameActivity.dlModelProgressOverlay;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        pp2 pp2Var2 = gameActivity.sampButtonOverlay;
        if (pp2Var2 != null) {
            pp2Var2.b(false, gameActivity.sampButtonsExpanded);
        }
    }

    private final void setPaused(boolean z) {
        this.isPaused$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSampButtonsState$lambda$0(GameActivity gameActivity, boolean z, boolean z2) {
        pp2 pp2Var;
        gameActivity.sampButtonsNativeVisible = z;
        gameActivity.sampButtonsExpanded = z2;
        try {
            String[] strArrNativeGetSampButtonsCaptions = gameActivity.nativeGetSampButtonsCaptions();
            float[] fArrNativeGetSampButtonsMetrics = gameActivity.nativeGetSampButtonsMetrics();
            int[] iArrNativeGetSampButtonsColors = gameActivity.nativeGetSampButtonsColors();
            if (strArrNativeGetSampButtonsCaptions != null && fArrNativeGetSampButtonsMetrics != null && iArrNativeGetSampButtonsColors != null && (pp2Var = gameActivity.sampButtonOverlay) != null && fArrNativeGetSampButtonsMetrics.length >= 4 && iArrNativeGetSampButtonsColors.length >= 4) {
                pp2Var.k = strArrNativeGetSampButtonsCaptions;
                pp2Var.l = fArrNativeGetSampButtonsMetrics;
                pp2Var.m = iArrNativeGetSampButtonsColors;
                pp2Var.h.setColor(iArrNativeGetSampButtonsColors[2]);
                pp2Var.i.setColor(iArrNativeGetSampButtonsColors[3]);
                pp2Var.invalidate();
            }
        } catch (UnsatisfiedLinkError e) {
            ti tiVar = ui.a;
            ui.c(ti.j, "GameActivity", "native SampButtons configuration failed", e);
        }
        pp2 pp2Var2 = gameActivity.sampButtonOverlay;
        if (pp2Var2 != null) {
            pp2Var2.b(z && !gameActivity.isPaused(), z2);
        }
    }

    private final native void setServerTextEncoding(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTab$lambda$0(final GameActivity gameActivity, final int i, String str, int i2, int i3, int i4) {
        LinearLayout linearLayout = gameActivity.nativeTabRows;
        if (linearLayout == null) {
            return;
        }
        final LinearLayout linearLayout2 = new LinearLayout(gameActivity);
        linearLayout2.setOrientation(0);
        linearLayout2.setClickable(true);
        linearLayout2.setPadding(gameActivity.dp(4.0f), gameActivity.dp(3.0f), gameActivity.dp(4.0f), gameActivity.dp(3.0f));
        gameActivity.addNativeTabCell(linearLayout2, String.valueOf(i), 0.12f, -1, false);
        gameActivity.addNativeTabCell(linearLayout2, str, 0.5f, gameActivity.normalizeChatColor(i2), false);
        gameActivity.addNativeTabCell(linearLayout2, String.valueOf(i3), 0.2f, -1, false);
        gameActivity.addNativeTabCell(linearLayout2, String.valueOf(i4), 0.18f, -1, false);
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: bu0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameActivity.setTab$lambda$0$1(i, gameActivity, linearLayout2, view);
            }
        });
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTab$lambda$0$1(int i, GameActivity gameActivity, LinearLayout linearLayout, View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i == gameActivity.lastTabClickId) {
            long j = jCurrentTimeMillis - gameActivity.lastTabClickTime;
            if (1 <= j && j < 501) {
                gameActivity.lastTabClickId = -1;
                gameActivity.lastTabClickTime = 0L;
                try {
                    gameActivity.onTabPlayerClick(i);
                    return;
                } catch (UnsatisfiedLinkError e) {
                    ti tiVar = ui.a;
                    ui.c(ti.j, "GameActivity", "onTabPlayerClick failed", e);
                    return;
                }
            }
        }
        gameActivity.lastTabClickId = i;
        gameActivity.lastTabClickTime = jCurrentTimeMillis;
        View view2 = gameActivity.nativeTabSelectedRow;
        if (view2 != null) {
            view2.setBackgroundColor(0);
        }
        gameActivity.nativeTabSelectedRow = linearLayout;
        linearLayout.setBackgroundColor(-10185235);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTabHeader$lambda$1(GameActivity gameActivity, String str, int i) {
        TextView textView = gameActivity.nativeTabServerName;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = gameActivity.nativeTabTotalPlayers;
        if (textView2 != null) {
            textView2.setText("Players: " + i);
        }
    }

    private final void setTabVisible(boolean z) {
        this.tabVisible$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setupChatInputOverlay() {
        EditText editText = new EditText(this);
        editText.setId(View.generateViewId());
        editText.setSingleLine(true);
        editText.setMaxLines(1);
        editText.setMinHeight(dp(42.0f));
        editText.setGravity(16);
        editText.setIncludeFontPadding(false);
        editText.setTextColor(-1);
        editText.setHintTextColor(-1996488705);
        editText.setTextSize(getGameFontSize() + 2);
        editText.setHint(getString(2131623974));
        editText.setBackground(new ColorDrawable(1712527396));
        editText.setPadding(dp(10.0f), 0, dp(10.0f), 0);
        editText.setInputType(524289);
        editText.setImeOptions(4);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ku0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return GameActivity.setupChatInputOverlay$lambda$0$0(this.a, textView, i, keyEvent);
            }
        });
        TextView textView = setupChatInputOverlay$navButton(this, "↑", new pt0(17, this));
        TextView textView2 = setupChatInputOverlay$navButton(this, "↓", new pt0(18, this));
        TextView textView3 = setupChatInputOverlay$navButton(this, "/", new pt0(19, this));
        TextView textView4 = new TextView(this);
        textView4.setText("▶");
        textView4.setTextColor(-1);
        textView4.setTextSize(getGameFontSize() + 6);
        textView4.setGravity(17);
        textView4.setPadding(dp(8.0f), 0, dp(8.0f), 0);
        textView4.setOnClickListener(new kt0(3, this));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(new ColorDrawable(-871362536));
        linearLayout.addView(editText, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(textView3, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(textView4, new LinearLayout.LayoutParams(-2, -2));
        this.chatInputEditText = editText;
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setVisibility(8);
        frameLayout.setBackgroundColor(-871362536);
        if (Build.VERSION.SDK_INT >= 30) {
            frameLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: et0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    GameActivity.setupChatInputOverlay$lambda$7$0(this.a, view, windowInsets);
                    return windowInsets;
                }
            });
        }
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2, 80));
        addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -2, 80));
        this.chatInputOverlay = frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupChatInputOverlay$lambda$0$0(GameActivity gameActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        gameActivity.hideChatInput(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dm3 setupChatInputOverlay$lambda$2(GameActivity gameActivity) {
        int i;
        EditText editText;
        boolean zIsEmpty = gameActivity.chatHistory.isEmpty();
        dm3 dm3Var = dm3.a;
        if (zIsEmpty || (i = gameActivity.chatHistoryIndex) <= 0 || (editText = gameActivity.chatInputEditText) == null) {
            return dm3Var;
        }
        if (i == gameActivity.chatHistory.size()) {
            gameActivity.chatDraft = editText.getText().toString();
        }
        int i2 = gameActivity.chatHistoryIndex - 1;
        gameActivity.chatHistoryIndex = i2;
        editText.setText(gameActivity.chatHistory.get(i2));
        editText.setSelection(editText.getText().length());
        return dm3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dm3 setupChatInputOverlay$lambda$3(GameActivity gameActivity) {
        EditText editText = gameActivity.chatInputEditText;
        dm3 dm3Var = dm3.a;
        if (editText == null) {
            return dm3Var;
        }
        if (gameActivity.chatHistoryIndex < gameActivity.chatHistory.size() - 1) {
            int i = gameActivity.chatHistoryIndex + 1;
            gameActivity.chatHistoryIndex = i;
            editText.setText(gameActivity.chatHistory.get(i));
        } else {
            gameActivity.chatHistoryIndex = gameActivity.chatHistory.size();
            editText.setText(gameActivity.chatDraft);
        }
        editText.setSelection(editText.getText().length());
        return dm3Var;
    }

    private static final dm3 setupChatInputOverlay$lambda$4(GameActivity gameActivity) {
        EditText editText = gameActivity.chatInputEditText;
        dm3 dm3Var = dm3.a;
        if (editText != null) {
            String string = editText.getText().toString();
            if (!fa3.e0(string, "/", false)) {
                editText.setText("/".concat(string));
                editText.setSelection(editText.getText().length());
            }
        }
        return dm3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets setupChatInputOverlay$lambda$7$0(GameActivity gameActivity, View view, WindowInsets windowInsets) {
        view.getClass();
        windowInsets.getClass();
        gameActivity.updateChatInputImeOffset(windowInsets);
        return windowInsets;
    }

    private static final TextView setupChatInputOverlay$navButton(GameActivity gameActivity, String str, cs0 cs0Var) {
        TextView textView = new TextView(gameActivity);
        textView.setText(str);
        textView.setTextColor(-1);
        textView.setTextSize(gameActivity.getGameFontSize() + 6);
        textView.setGravity(17);
        textView.setPadding(gameActivity.dp(10.0f), gameActivity.dp(10.0f), gameActivity.dp(10.0f), gameActivity.dp(10.0f));
        textView.setOnClickListener(new it0(cs0Var, 0));
        return textView;
    }

    private final void setupEditObjectOverlay() {
        FrameLayout frameLayout = new FrameLayout(this);
        int i = 0;
        frameLayout.setBackgroundColor(0);
        frameLayout.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        int i2 = 17;
        linearLayout.setGravity(17);
        linearLayout.setBackground(roundedDrawable(1711276032, 14.0f, 872415231, 1.0f));
        linearLayout.setPadding(dp(10.0f), dp(10.0f), dp(10.0f), dp(10.0f));
        TextView textView = new TextView(this);
        textView.setText(getString(2131623996));
        int i3 = -1;
        textView.setTextColor(-1);
        textView.setTextSize(2, 14.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        textView.setPadding(0, 0, 0, dp(8.0f));
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        String string = getString(2131623988);
        string.getClass();
        pu0 pu0Var = new pu0(0, string);
        String string2 = getString(2131623993);
        string2.getClass();
        pu0 pu0Var2 = new pu0(1, string2);
        String string3 = getString(2131623987);
        string3.getClass();
        pu0 pu0Var3 = new pu0(2, string3);
        String string4 = getString(2131623992);
        string4.getClass();
        pu0 pu0Var4 = new pu0(3, string4);
        String string5 = getString(2131623989);
        string5.getClass();
        pu0 pu0Var5 = new pu0(4, string5);
        String string6 = getString(2131623990);
        string6.getClass();
        pu0 pu0Var6 = new pu0(5, string6);
        String string7 = getString(2131623991);
        string7.getClass();
        for (pu0 pu0Var7 : vr.L(pu0Var, pu0Var2, pu0Var3, pu0Var4, pu0Var5, pu0Var6, new pu0(6, string7))) {
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(i2);
            linearLayout2.setPadding(0, dp(2.0f), 0, dp(2.0f));
            TextView textView2 = new TextView(this);
            textView2.setText("◀");
            textView2.setTextColor(i3);
            textView2.setTextSize(2, 16.0f);
            textView2.setGravity(i2);
            textView2.setBackground(roundedDrawable$default(this, -12751873, 8.0f, 0, 0.0f, 12, null));
            textView2.setPadding(dp(16.0f), dp(8.0f), dp(16.0f), dp(8.0f));
            textView2.setOnTouchListener(editObjectTouchListener(pu0Var7.b, false));
            TextView textView3 = new TextView(this);
            textView3.setText("▶");
            textView3.setTextColor(i3);
            textView3.setTextSize(2, 16.0f);
            textView3.setGravity(17);
            textView3.setBackground(roundedDrawable$default(this, -12751873, 8.0f, 0, 0.0f, 12, null));
            textView3.setPadding(dp(16.0f), dp(8.0f), dp(16.0f), dp(8.0f));
            textView3.setOnTouchListener(editObjectTouchListener(pu0Var7.b, true));
            TextView textView4 = new TextView(this);
            textView4.setText(pu0Var7.a);
            textView4.setTextColor(-4601409);
            textView4.setTextSize(2, 11.0f);
            textView4.setGravity(17);
            textView4.setMinWidth(dp(90.0f));
            linearLayout2.addView(textView2, new LinearLayout.LayoutParams(dp(48.0f), dp(36.0f)));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = dp(8.0f);
            layoutParams.rightMargin = dp(8.0f);
            linearLayout2.addView(textView4, layoutParams);
            linearLayout2.addView(textView3, new LinearLayout.LayoutParams(dp(48.0f), dp(36.0f)));
            linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-2, -2));
            i2 = 17;
            i3 = -1;
        }
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(17);
        linearLayout3.setPadding(0, dp(12.0f), 0, 0);
        TextView textView5 = new TextView(this);
        textView5.setText(getString(2131623995));
        textView5.setTextColor(-1);
        textView5.setTextSize(2, 12.0f);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView5.setTypeface(typeface);
        textView5.setGravity(17);
        textView5.setBackground(roundedDrawable$default(this, -13710223, 999.0f, 0, 0.0f, 12, null));
        textView5.setPadding(dp(20.0f), dp(8.0f), dp(20.0f), dp(8.0f));
        textView5.setOnClickListener(new kt0(i, this));
        TextView textView6 = new TextView(this);
        textView6.setText(getString(2131623994));
        textView6.setTextColor(-1);
        textView6.setTextSize(2, 12.0f);
        textView6.setTypeface(typeface);
        textView6.setGravity(17);
        textView6.setBackground(roundedDrawable$default(this, -1618884, 999.0f, 0, 0.0f, 12, null));
        textView6.setPadding(dp(20.0f), dp(8.0f), dp(20.0f), dp(8.0f));
        textView6.setOnClickListener(new kt0(1, this));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.rightMargin = dp(16.0f);
        linearLayout3.addView(textView5, layoutParams2);
        linearLayout3.addView(textView6, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(linearLayout3, new LinearLayout.LayoutParams(-2, -2));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, 8388629);
        layoutParams3.rightMargin = dp(18.0f);
        frameLayout.addView(linearLayout, layoutParams3);
        addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        this.editObjectOverlay = frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupEditObjectOverlay$lambda$10$0(GameActivity gameActivity, View view) {
        try {
            gameActivity.exitEditObject();
            gameActivity.hideEditObject();
        } catch (UnsatisfiedLinkError e) {
            ti tiVar = ui.a;
            ui.c(ti.j, "GameActivity", "exitEditObject failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupEditObjectOverlay$lambda$9$0(GameActivity gameActivity, View view) {
        try {
            gameActivity.saveEditObject();
            gameActivity.hideEditObject();
        } catch (UnsatisfiedLinkError e) {
            ti tiVar = ui.a;
            ui.c(ti.j, "GameActivity", "saveEditObject failed", e);
        }
    }

    private final void setupNativeChatOverlay() {
        TextView textView = new TextView(this);
        textView.setTextColor(-1);
        textView.setTextSize(2, getGameFontSize());
        textView.setShadowLayer(2.0f, 1.0f, 1.0f, -16777216);
        textView.setMaxLines(9);
        textView.setIncludeFontPadding(false);
        textView.setVisibility(8);
        textView.setClickable(true);
        textView.setOnTouchListener(new ut0(this, 0));
        this.nativeChatText = textView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = dp(128.0f);
        layoutParams.topMargin = dp(8.0f);
        addContentView(this.nativeChatText, layoutParams);
        ft1 ft1Var = new ft1(this);
        ft1Var.setVisibility(8);
        this.nativeChatScrollBar = ft1Var;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dp(3.0f), chatScrollBarHeight());
        int iDp = layoutParams.leftMargin - dp(6.0f);
        layoutParams2.leftMargin = iDp >= 0 ? iDp : 0;
        layoutParams2.topMargin = dp(8.0f);
        addContentView(ft1Var, layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupNativeChatOverlay$lambda$0$0(GameActivity gameActivity, View view, MotionEvent motionEvent) {
        motionEvent.getClass();
        gameActivity.handleNativeChatTouch(motionEvent);
        return true;
    }

    private final void setupNativeTabOverlay() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-871362536);
        frameLayout.setPadding(dp(14.0f), dp(12.0f), dp(14.0f), dp(12.0f));
        frameLayout.setVisibility(8);
        this.nativeTabOverlay = frameLayout;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        TextView textView = new TextView(this);
        textView.setText("SA-MP Server");
        textView.setTextColor(-1);
        textView.setTextSize(2, getGameFontSize() + 3);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setSingleLine(true);
        textView.setShadowLayer(2.0f, 1.0f, 1.0f, -16777216);
        this.nativeTabServerName = textView;
        TextView textView2 = new TextView(this);
        textView2.setText("Players: 0");
        textView2.setTextColor(-4601409);
        textView2.setTextSize(2, getGameFontSize() + 2);
        textView2.setSingleLine(true);
        textView2.setShadowLayer(2.0f, 1.0f, 1.0f, -16777216);
        this.nativeTabTotalPlayers = textView2;
        linearLayout2.addView(this.nativeTabServerName, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.addView(this.nativeTabTotalPlayers, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        ScrollView scrollView = new ScrollView(this);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        this.nativeTabRows = linearLayout3;
        scrollView.addView(linearLayout3, new ViewGroup.LayoutParams(-1, -2));
        linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        FrameLayout frameLayout2 = this.nativeTabOverlay;
        if (frameLayout2 != null) {
            frameLayout2.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iDp = displayMetrics.widthPixels - dp(160.0f);
        int iDp2 = dp(500.0f);
        if (iDp > iDp2) {
            iDp = iDp2;
        }
        int iDp3 = displayMetrics.heightPixels - dp(120.0f);
        int iDp4 = dp(420.0f);
        if (iDp3 > iDp4) {
            iDp3 = iDp4;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDp, iDp3);
        layoutParams.leftMargin = (displayMetrics.widthPixels - iDp) / 2;
        layoutParams.topMargin = (displayMetrics.heightPixels - iDp3) / 2;
        addContentView(this.nativeTabOverlay, layoutParams);
        addNativeTabHeader();
    }

    private final void setupNativeTextDrawOverlay() {
        nt1 nt1Var = new nt1(this);
        this.nativeTextDrawView = nt1Var;
        addContentView(nt1Var, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void setupSampButtonOverlay() {
        pp2 pp2Var = new pp2(this, new gt0(0, this));
        this.sampButtonOverlay = pp2Var;
        addContentView(pp2Var, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupSampButtonOverlay$lambda$0(GameActivity gameActivity, int i, int i2, int i3, int i4) {
        try {
            return gameActivity.nativeSampButtonsTouch(i, i2, i3, i4);
        } catch (UnsatisfiedLinkError e) {
            ti tiVar = ui.a;
            ui.c(ti.j, "GameActivity", "nativeSampButtonsTouch failed", e);
            return false;
        }
    }

    private final void showChatInput() {
        if (this.nativeChatHiddenByPause) {
            return;
        }
        try {
            showChatKeyboard();
            int i = 1;
            if (getNativeKeyboardEnabled()) {
                setKeyboardVisible(true);
                return;
            }
            FrameLayout frameLayout = this.chatInputOverlay;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                frameLayout.bringToFront();
                setKeyboardVisible(true);
                this.chatHistoryIndex = this.chatHistory.size();
                this.chatDraft = "";
                EditText editText = this.chatInputEditText;
                if (editText != null) {
                    editText.setText("");
                    editText.requestFocus();
                    editText.post(new zt0(editText, this, i));
                }
                frameLayout.requestApplyInsets();
                frameLayout.postDelayed(new iu0(frameLayout, this), 80L);
            }
        } catch (UnsatisfiedLinkError e) {
            ti tiVar = ui.a;
            ui.c(ti.j, "GameActivity", "showChatKeyboard failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showChatInput$lambda$0$0$0(EditText editText, GameActivity gameActivity) {
        if (editText.isFocused()) {
            Window window = gameActivity.getWindow();
            k71 k71Var = new k71(editText);
            int i = Build.VERSION.SDK_INT;
            (i >= 35 ? new pt3(window, k71Var) : i >= 30 ? new ot3(window, k71Var) : new nt3(window, k71Var)).e0();
        } else {
            editText.requestFocus();
            Window window2 = gameActivity.getWindow();
            k71 k71Var2 = new k71(editText);
            int i2 = Build.VERSION.SDK_INT;
            (i2 >= 35 ? new pt3(window2, k71Var2) : i2 >= 30 ? new ot3(window2, k71Var2) : new nt3(window2, k71Var2)).e0();
        }
        if (editText.isFocused()) {
            return;
        }
        ti tiVar = ui.a;
        ui.c(ti.i, "GameActivity", "chat EditText could not gain focus, IME may not show", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showChatInput$lambda$0$1(FrameLayout frameLayout, GameActivity gameActivity) {
        frameLayout.requestApplyInsets();
        updateChatInputImeOffset$default(gameActivity, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCleoBreakpoint$lambda$0(GameActivity gameActivity, String str) {
        gameActivity.removeCleoBreakpointOverlay();
        FrameLayout frameLayout = new FrameLayout(gameActivity);
        frameLayout.setBackgroundColor(-1442840576);
        frameLayout.setClickable(true);
        frameLayout.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(gameActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gameActivity.dp(18.0f), gameActivity.dp(16.0f), gameActivity.dp(18.0f), gameActivity.dp(12.0f));
        linearLayout.setBackground(roundedDrawable$default(gameActivity, -266592469, 10.0f, 0, 0.0f, 12, null));
        linearLayout.setElevation(gameActivity.dp(8.0f));
        TextView textView = new TextView(gameActivity);
        textView.setText(gameActivity.getString(2131623999));
        textView.setTextColor(-1);
        textView.setTextSize(2, gameActivity.getGameFontSize() + 4.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        TextView textView2 = new TextView(gameActivity);
        if (y93.q0(str)) {
            str = gameActivity.getString(2131623997);
            str.getClass();
        }
        textView2.setText(str);
        textView2.setTextColor(-1);
        textView2.setTextSize(2, gameActivity.getGameFontSize() + 1.0f);
        textView2.setPadding(0, gameActivity.dp(12.0f), 0, gameActivity.dp(8.0f));
        textView2.setMaxLines(8);
        Button button = new Button(gameActivity);
        button.setText(gameActivity.getString(2131623998));
        button.setOnClickListener(new cu0(gameActivity, button, 0));
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(button, new LinearLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = gameActivity.dp(28.0f);
        layoutParams.rightMargin = gameActivity.dp(28.0f);
        frameLayout.addView(linearLayout, layoutParams);
        gameActivity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        gameActivity.cleoBreakpointOverlay = frameLayout;
    }

    private static final void showCleoBreakpoint$lambda$0$4$0(GameActivity gameActivity, Button button, View view) {
        gameActivity.removeCleoBreakpointOverlay();
        try {
            gameActivity.nativeCleoBreakpointResumed();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCleoMenuArrow$lambda$0(GameActivity gameActivity) {
        gameActivity.cleoMenuStartupHintShown = true;
        gameActivity.removeCleoMenuArrowOverlay();
        FrameLayout frameLayout = new FrameLayout(gameActivity);
        LinearLayout linearLayout = new LinearLayout(gameActivity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(gameActivity.dp(14.0f), gameActivity.dp(8.0f), gameActivity.dp(14.0f), gameActivity.dp(10.0f));
        linearLayout.setBackground(roundedDrawable$default(gameActivity, -870572245, 12.0f, 0, 0.0f, 12, null));
        linearLayout.setElevation(gameActivity.dp(6.0f));
        linearLayout.setOnClickListener(new kt0(2, gameActivity));
        TextView textView = new TextView(gameActivity);
        textView.setText(gameActivity.getString(2131624004));
        textView.setTextColor(-38037);
        textView.setTextSize(2, gameActivity.getGameFontSize() + 20.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        TextView textView2 = new TextView(gameActivity);
        textView2.setText(gameActivity.getString(2131624005));
        textView2.setTextColor(-1);
        textView2.setTextSize(2, gameActivity.getGameFontSize());
        textView2.setGravity(17);
        textView2.setPadding(0, gameActivity.dp(2.0f), 0, 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(-2, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = gameActivity.dp(20.0f);
        frameLayout.addView(linearLayout, layoutParams);
        gameActivity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        gameActivity.cleoMenuArrowOverlay = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.animate().alpha(1.0f).setDuration(180L).start();
        frameLayout.postDelayed(new iu0(gameActivity, frameLayout), 5000L);
    }

    private static final void showCleoMenuArrow$lambda$0$4(GameActivity gameActivity, FrameLayout frameLayout) {
        if (gameActivity.cleoMenuArrowOverlay == frameLayout) {
            gameActivity.removeCleoMenuArrowOverlay();
        }
    }

    private final void showCleoMenuInternal(final String str, final String str2, final String[] strArr, final int i, final boolean z) {
        runOnUiThread(new Runnable() { // from class: lt0
            @Override // java.lang.Runnable
            public final void run() {
                GameActivity.showCleoMenuInternal$lambda$0(this.f, z, strArr, i, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCleoMenuInternal$lambda$0(final GameActivity gameActivity, boolean z, String[] strArr, int i, String str, String str2) {
        String string;
        String string2;
        gameActivity.removeCleoMenuOverlay();
        gameActivity.cleoMenuQuickLauncher = z;
        final FrameLayout frameLayout = new FrameLayout(gameActivity);
        frameLayout.setBackgroundColor(-2013265920);
        frameLayout.setClickable(true);
        frameLayout.setFocusable(true);
        final LinearLayout linearLayout = new LinearLayout(gameActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gameActivity.dp(14.0f), gameActivity.dp(12.0f), gameActivity.dp(14.0f), gameActivity.dp(12.0f));
        linearLayout.setBackground(roundedDrawable$default(gameActivity, -266592469, 10.0f, 0, 0.0f, 12, null));
        linearLayout.setElevation(gameActivity.dp(8.0f));
        final TextView textView = new TextView(gameActivity);
        if (y93.q0(str)) {
            string = gameActivity.getString(2131624011);
            string.getClass();
        } else {
            string = str;
        }
        textView.setText(string);
        int i2 = -1;
        textView.setTextColor(-1);
        int i3 = 2;
        textView.setTextSize(2, gameActivity.getGameFontSize() + 4.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setPadding(0, 0, 0, gameActivity.dp(8.0f));
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(gameActivity);
        linearLayout2.setOrientation(1);
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i5 < length) {
            String str3 = strArr[i5];
            int i6 = i4 + 1;
            TextView textView2 = new TextView(gameActivity);
            textView2.setText(str3);
            textView2.setTextColor(i2);
            textView2.setTextSize(i3, gameActivity.getGameFontSize() + 1.0f);
            textView2.setGravity(16);
            textView2.setMinHeight(gameActivity.dp(42.0f));
            textView2.setPadding(gameActivity.dp(10.0f), 0, gameActivity.dp(10.0f), 0);
            textView2.setOnClickListener(new ht0(gameActivity, textView2, i4, str3));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = gameActivity.dp(z ? 4.0f : 2.0f);
            linearLayout2.addView(textView2, layoutParams);
            arrayList.add(textView2);
            i5++;
            i4 = i6;
            i3 = 2;
            i2 = -1;
        }
        final ScrollView scrollView = new ScrollView(gameActivity);
        scrollView.setFillViewport(false);
        scrollView.addView(linearLayout2, new ViewGroup.LayoutParams(-1, -2));
        linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, gameActivity.cleoMenuInitialScrollHeight()));
        final TextView textView3 = new TextView(gameActivity);
        if (y93.q0(str2)) {
            string2 = gameActivity.getString(2131624006);
            string2.getClass();
        } else {
            string2 = str2;
        }
        textView3.setText(string2);
        textView3.setTextColor(-4667393);
        textView3.setTextSize(2, gameActivity.getGameFontSize() + 1.0f);
        textView3.setGravity(17);
        textView3.setMinHeight(gameActivity.dp(42.0f));
        textView3.setOnClickListener(new cu0(gameActivity, textView3, 1));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = gameActivity.dp(6.0f);
        linearLayout.addView(textView3, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = gameActivity.dp(28.0f);
        layoutParams3.rightMargin = gameActivity.dp(28.0f);
        frameLayout.addView(linearLayout, layoutParams3);
        gameActivity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.post(new Runnable() { // from class: eu0
            @Override // java.lang.Runnable
            public final void run() {
                GameActivity.showCleoMenuInternal$lambda$0$9(this.f, frameLayout, textView3, linearLayout, textView, scrollView);
            }
        });
        gameActivity.cleoMenuOverlay = frameLayout;
        gameActivity.cleoMenuRows = arrayList;
        gameActivity.cleoMenuSelectedIndex = z ? -1 : i;
        gameActivity.highlightCleoMenuRows();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCleoMenuInternal$lambda$0$4$0$0(GameActivity gameActivity, TextView textView, int i, String str, View view) {
        Object qn2Var;
        if (!gameActivity.cleoMenuQuickLauncher) {
            gameActivity.cleoMenuSelectedIndex = i;
            gameActivity.highlightCleoMenuRows();
            try {
                gameActivity.nativeCleoMenuItemSelected(i);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        try {
            qn2Var = Boolean.valueOf(gameActivity.nativeStartCleoScript(str));
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        Object obj = Boolean.FALSE;
        if (qn2Var instanceof qn2) {
            qn2Var = obj;
        }
        if (((Boolean) qn2Var).booleanValue()) {
            gameActivity.removeCleoMenuOverlay();
        } else {
            Toast.makeText(gameActivity, gameActivity.getString(2131624008), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCleoMenuInternal$lambda$0$6$1(GameActivity gameActivity, TextView textView, View view) {
        boolean z = gameActivity.cleoMenuQuickLauncher;
        gameActivity.removeCleoMenuOverlay();
        if (z) {
            return;
        }
        try {
            gameActivity.nativeCleoMenuClosed();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCleoMenuInternal$lambda$0$9(GameActivity gameActivity, FrameLayout frameLayout, TextView textView, LinearLayout linearLayout, TextView textView2, ScrollView scrollView) {
        if (gameActivity.cleoMenuOverlay != frameLayout) {
            return;
        }
        int height = frameLayout.getHeight() - gameActivity.dp(48.0f);
        if (height < 0) {
            height = 0;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        int height2 = height - ((textView.getHeight() + (textView2.getHeight() + (linearLayout.getPaddingBottom() + linearLayout.getPaddingTop()))) + (layoutParams2 != null ? layoutParams2.topMargin : 0));
        int i = height2 >= 0 ? height2 : 0;
        int iDp = gameActivity.dp(360.0f);
        if (i > iDp) {
            i = iDp;
        }
        ViewGroup.LayoutParams layoutParams3 = scrollView.getLayoutParams();
        layoutParams3.getClass();
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.height = i;
        scrollView.setLayoutParams(layoutParams4);
        scrollView.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCleoToast$lambda$0(GameActivity gameActivity, String str, boolean z) {
        Toast.makeText(gameActivity, y93.F0(255, str), z ? 1 : 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDlModelProgress$lambda$0(final GameActivity gameActivity, long j, int i) {
        if (gameActivity.dlModelProgressRequest.get() != j) {
            return;
        }
        int i2 = 1;
        if (gameActivity.dlModelProgressOverlay != null) {
            if (!gameActivity.dlModelProgressTotalKnown && i > 0) {
                gameActivity.dlModelProgressTotal = i;
                gameActivity.dlModelProgressTotalKnown = true;
            }
            gameActivity.refreshDlModelProgressTitle();
            gameActivity.scrollDlModelProgressToBottom();
            return;
        }
        gameActivity.removeDlModelProgressOverlay();
        gameActivity.dlModelProgressTotal = i < 0 ? 0 : i;
        gameActivity.dlModelProgressTotalKnown = i > 0;
        gameActivity.dlModelProgressValues.clear();
        gameActivity.dlModelProgressRowViews.clear();
        gameActivity.dlModelProgressAutoScroll = true;
        gameActivity.dlModelProgressProgrammaticScroll = false;
        gameActivity.dlModelProgressUserTouching = false;
        gameActivity.dlModelProgressContentHeight = 0;
        FrameLayout frameLayout = new FrameLayout(gameActivity);
        frameLayout.setBackgroundColor(-1728053248);
        frameLayout.setClickable(true);
        frameLayout.setFocusable(true);
        frameLayout.setVisibility(gameActivity.isPaused() ? 8 : 0);
        LinearLayout linearLayout = new LinearLayout(gameActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gameActivity.dp(14.0f), gameActivity.dp(12.0f), gameActivity.dp(14.0f), gameActivity.dp(12.0f));
        linearLayout.setBackgroundColor(-300936684);
        TextView textView = new TextView(gameActivity);
        textView.setTextColor(-1);
        textView.setTextSize(17.0f);
        gameActivity.dlModelProgressTitle = textView;
        ProgressBar progressBar = new ProgressBar(gameActivity, null, R.attr.progressBarStyleHorizontal);
        progressBar.setMax(100);
        gameActivity.dlModelProgressBar = progressBar;
        LinearLayout linearLayout2 = new LinearLayout(gameActivity);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(0, gameActivity.dp(8.0f), 0, gameActivity.dp(4.0f));
        String string = gameActivity.getString(2131624014);
        string.getClass();
        Typeface typeface = Typeface.DEFAULT_BOLD;
        typeface.getClass();
        gameActivity.addDlModelProgressCell(linearLayout2, string, -4667431, typeface);
        String string2 = gameActivity.getString(2131624012);
        string2.getClass();
        gameActivity.addDlModelProgressCell(linearLayout2, string2, -4667431, typeface);
        String string3 = gameActivity.getString(2131624013);
        string3.getClass();
        gameActivity.addDlModelProgressCell(linearLayout2, string3, -4667431, typeface);
        LinearLayout linearLayout3 = new LinearLayout(gameActivity);
        linearLayout3.setOrientation(1);
        gameActivity.dlModelProgressRows = linearLayout3;
        ScrollView scrollView = new ScrollView(gameActivity);
        scrollView.setVerticalScrollBarEnabled(true);
        scrollView.setOnTouchListener(new ut0(gameActivity, i2));
        scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: vt0
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i3, int i4, int i5, int i6) {
                GameActivity.showDlModelProgress$lambda$0$6$1(this.a, view, i3, i4, i5, i6);
            }
        });
        scrollView.addView(gameActivity.dlModelProgressRows, new ViewGroup.LayoutParams(-1, -2));
        gameActivity.dlModelProgressScroll = scrollView;
        linearLayout.addView(gameActivity.dlModelProgressTitle);
        ProgressBar progressBar2 = gameActivity.dlModelProgressBar;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, gameActivity.dp(8.0f));
        layoutParams.topMargin = gameActivity.dp(8.0f);
        linearLayout.addView(progressBar2, layoutParams);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams((int) (gameActivity.getResources().getDisplayMetrics().widthPixels * 0.72f), (int) (gameActivity.getResources().getDisplayMetrics().heightPixels * 0.52f), 17));
        gameActivity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        gameActivity.dlModelProgressOverlay = frameLayout;
        gameActivity.refreshDlModelProgressTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDlModelProgress$lambda$0$6$0(GameActivity gameActivity, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        boolean z = true;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                view.performClick();
            } else if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = gameActivity.dlModelProgressUserTouching;
                }
            }
            z = false;
        }
        gameActivity.dlModelProgressUserTouching = z;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDlModelProgress$lambda$0$6$1(GameActivity gameActivity, View view, int i, int i2, int i3, int i4) {
        if (gameActivity.dlModelProgressProgrammaticScroll) {
            return;
        }
        view.getClass();
        ScrollView scrollView = (ScrollView) view;
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return;
        }
        if (childAt.getHeight() <= gameActivity.dlModelProgressContentHeight || !gameActivity.dlModelProgressAutoScroll || gameActivity.dlModelProgressUserTouching) {
            gameActivity.dlModelProgressAutoScroll = scrollView.getHeight() + i2 >= childAt.getHeight() - gameActivity.dp(8.0f);
        }
        gameActivity.dlModelProgressContentHeight = childAt.getHeight();
    }

    private static final void showEditObject$lambda$0(GameActivity gameActivity) {
        FrameLayout frameLayout = gameActivity.editObjectOverlay;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    private final void showNativeChatOverlayIfNeeded() {
        if (this.nativeChatHiddenByPause || this.nativeChatLines.isEmpty()) {
            return;
        }
        readAndLockChatPosition();
        TextView textView = this.nativeChatText;
        if (textView != null) {
            textView.setVisibility(0);
        }
        updateNativeChatScrollBar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showNativeDialog(int r18, int r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, byte[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.th1nk.samp.feature.game.GameActivity.showNativeDialog(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public static /* synthetic */ void showNativeDialog$default(GameActivity gameActivity, int i, int i2, String str, String str2, String str3, String str4, byte[] bArr, int i3, Object obj) throws Throwable {
        gameActivity.showNativeDialog(i, i2, str, str2, str3, str4, (i3 & 64) != 0 ? new byte[0] : bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dm3 showNativeDialog$lambda$10(GameActivity gameActivity) {
        Editable text;
        EditText editText = gameActivity.activeDialogInput;
        String string = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
        if (string == null) {
            string = "";
        }
        gameActivity.sendActiveDialogResponse(0, string);
        return dm3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showNativeDialog$lambda$12(EditText editText, GameActivity gameActivity) {
        editText.requestFocus();
        Object systemService = gameActivity.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showNativeDialog$lambda$5$0(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            frameLayout.performClick();
        }
        return motionEvent.getAction() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dm3 showNativeDialog$lambda$9(GameActivity gameActivity) {
        Editable text;
        EditText editText = gameActivity.activeDialogInput;
        String string = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
        if (string == null) {
            string = "";
        }
        gameActivity.sendActiveDialogResponse(1, string);
        return dm3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showNativeTextDraw$lambda$0(GameActivity gameActivity, int i, String str, float f, float f2, float f3, float f4, int i2, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        if (gameActivity.isFinishing() || gameActivity.isDestroyed()) {
            return;
        }
        nt1 nt1Var = gameActivity.nativeTextDrawView;
        if (nt1Var != null) {
            gt1 gt1Var = new gt1(i, str, f, f2, f3, f4, Color.argb((i2 >>> 24) & 255, i2 & 255, (i2 >>> 8) & 255, (i2 >>> 16) & 255), Color.argb((i3 >>> 24) & 255, i3 & 255, (i3 >>> 8) & 255, (i3 >>> 16) & 255), i4, i5, i6, i7);
            LinkedHashMap linkedHashMap = nt1Var.f;
            linkedHashMap.remove(Integer.valueOf(i));
            nt1Var.g.remove(Integer.valueOf(i));
            nt1Var.h.remove(Integer.valueOf(i));
            if (i6 >= 0 && i6 < 4 && str.length() > 0) {
                linkedHashMap.put(Integer.valueOf(i), gt1Var);
            }
            nt1Var.invalidate();
        }
        gameActivity.syncNativeTextDrawRuns(i);
    }

    private final void showSettingsMenu() {
        String strNativeGetServerAddress;
        try {
            strNativeGetServerAddress = nativeGetServerAddress();
        } catch (UnsatisfiedLinkError unused) {
            strNativeGetServerAddress = "";
        }
        sz2 sz2Var = this.settingsMenu;
        if (sz2Var == null) {
            s51.F("settingsMenu");
            throw null;
        }
        strNativeGetServerAddress.getClass();
        sz2Var.y = strNativeGetServerAddress;
        sz2Var.t.setValue(initializePluginRuntimeAndSamp$lambda$10(sz2Var.k.g));
        sz2Var.u = ((Number) sz2Var.l.a()).longValue();
        sz2Var.v.setValue(initializePluginRuntimeAndSamp$lambda$12(sz2Var.m.g));
        sz2Var.w.setValue(initializePluginRuntimeAndSamp$lambda$7(sz2Var.h.g));
        sz2Var.d(j22.a);
        sz2Var.r.setValue(Boolean.TRUE);
        new Handler(Looper.getMainLooper()).post(new rz2(sz2Var, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTab$lambda$0(GameActivity gameActivity) {
        FrameLayout frameLayout = gameActivity.nativeTabOverlay;
        if (frameLayout == null) {
            return;
        }
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        FrameLayout frameLayout2 = gameActivity.nativeTabOverlay;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        gameActivity.setTabVisible(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWithoutReset$lambda$0(GameActivity gameActivity) {
        nt1 nt1Var = gameActivity.nativeTextDrawView;
        if (nt1Var != null) {
            nt1Var.setVisibility(0);
        }
        gameActivity.nativeChatHiddenByPause = false;
        gameActivity.showNativeChatOverlayIfNeeded();
    }

    private final void startDisconnectWatcher() {
        this.disconnectWatchRunnable = new ft0(4, this);
        if (this.showServerNotificationEnabled) {
            getWindow().getDecorView().postDelayed(this.disconnectWatchRunnable, 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startDisconnectWatcher$lambda$0(GameActivity gameActivity) {
        if (gameActivity.showServerNotificationEnabled) {
            gameActivity.updateServerNotification(0);
            gameActivity.getWindow().getDecorView().postDelayed(gameActivity.disconnectWatchRunnable, 5000L);
        }
    }

    private static final void stopCleoVibration$lambda$0(GameActivity gameActivity) {
        Vibrator cleoVibrator = gameActivity.getCleoVibrator();
        if (cleoVibrator != null) {
            cleoVibrator.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void syncNativeTextDrawRuns(int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.th1nk.samp.feature.game.GameActivity.syncNativeTextDrawRuns(int):void");
    }

    private final void unregisterPluginClipboardListener() {
        Object systemService = getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.removePrimaryClipChangedListener(this.pluginClipboardListener);
    }

    private final void updateChatInputImeOffset(WindowInsets windowInsets) {
        FrameLayout frameLayout;
        Insets insets;
        if (Build.VERSION.SDK_INT >= 30 && (frameLayout = this.chatInputOverlay) != null) {
            if (frameLayout.getVisibility() != 0) {
                frameLayout.setTranslationY(0.0f);
                return;
            }
            if (windowInsets == null && (windowInsets = frameLayout.getRootWindowInsets()) == null) {
                windowInsets = getWindow().getDecorView().getRootWindowInsets();
            }
            frameLayout.setTranslationY(-((windowInsets == null || (insets = windowInsets.getInsets(WindowInsets.Type.ime())) == null) ? 0 : insets.bottom));
        }
    }

    public static /* synthetic */ void updateChatInputImeOffset$default(GameActivity gameActivity, WindowInsets windowInsets, int i, Object obj) {
        if ((i & 1) != 0) {
            windowInsets = null;
        }
        gameActivity.updateChatInputImeOffset(windowInsets);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDlModelProgress$lambda$0(GameActivity gameActivity, long j, int i, int i2) {
        if (gameActivity.dlModelProgressOverlay == null) {
            return;
        }
        long j2 = j & 4294967295L;
        long j3 = (((long) i) << 32) | j2;
        int iH = y02.h(i2, 0, 100);
        LinkedHashMap<Long, Integer> linkedHashMap = gameActivity.dlModelProgressValues;
        Long lValueOf = Long.valueOf(j3);
        Integer num = gameActivity.dlModelProgressValues.get(Long.valueOf(j3));
        linkedHashMap.put(lValueOf, Integer.valueOf(Math.max(num != null ? num.intValue() : 0, iH)));
        HashMap<Long, mu0> map = gameActivity.dlModelProgressRowViews;
        Long lValueOf2 = Long.valueOf(j3);
        mu0 mu0VarCreateDlModelProgressRow = map.get(lValueOf2);
        if (mu0VarCreateDlModelProgressRow == null) {
            mu0VarCreateDlModelProgressRow = gameActivity.createDlModelProgressRow();
            map.put(lValueOf2, mu0VarCreateDlModelProgressRow);
        }
        mu0 mu0Var = mu0VarCreateDlModelProgressRow;
        String string = gameActivity.getString(i == 2 ? 2131624017 : 2131624015);
        string.getClass();
        mu0Var.a.setText(string);
        TextView textView = mu0Var.b;
        Locale locale = Locale.US;
        textView.setText(String.format(locale, "0x%08X", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)));
        mu0Var.c.setText(String.format(locale, "%3d%%", Arrays.copyOf(new Object[]{gameActivity.dlModelProgressValues.get(Long.valueOf(j3))}, 1)));
        gameActivity.refreshDlModelProgressTitle();
        gameActivity.scrollDlModelProgressToBottom();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateIniSection(java.io.File r19, java.lang.String r20, java.util.LinkedHashMap<java.lang.String, java.lang.String> r21) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.th1nk.samp.feature.game.GameActivity.updateIniSection(java.io.File, java.lang.String, java.util.LinkedHashMap):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNativeChatScrollBar() {
        ft1 ft1Var = this.nativeChatScrollBar;
        if (ft1Var == null) {
            return;
        }
        int iMaxNativeChatScrollOffset = maxNativeChatScrollOffset();
        if (this.nativeChatHiddenByPause || this.nativeChatScrollOffset <= 0 || iMaxNativeChatScrollOffset <= 0) {
            ft1Var.setVisibility(8);
            return;
        }
        int size = this.nativeChatLines.size();
        if (size < 0) {
            size = 0;
        }
        ft1Var.h = size;
        ft1Var.invalidate();
        ft1Var.i = 9;
        ft1Var.invalidate();
        int i = this.nativeChatScrollOffset;
        if (i < 0) {
            i = 0;
        }
        ft1Var.j = i;
        ft1Var.invalidate();
        TextView textView = this.nativeChatText;
        ViewGroup.LayoutParams layoutParams = textView != null ? textView.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        updateNativeChatScrollBarPosition(layoutParams2);
        ft1Var.setVisibility(0);
    }

    private final void updateNativeChatScrollBarPosition(FrameLayout.LayoutParams layoutParams) {
        ft1 ft1Var = this.nativeChatScrollBar;
        if (ft1Var == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = ft1Var.getLayoutParams();
        FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 == null) {
            return;
        }
        int iDp = layoutParams.leftMargin - dp(6.0f);
        if (iDp < 0) {
            iDp = 0;
        }
        layoutParams3.leftMargin = iDp;
        layoutParams3.topMargin = layoutParams.topMargin;
        TextView textView = this.nativeChatText;
        Integer numValueOf = Integer.valueOf(textView != null ? textView.getMeasuredHeight() : 0);
        Integer num = numValueOf.intValue() > 0 ? numValueOf : null;
        layoutParams3.height = num != null ? num.intValue() : chatScrollBarHeight();
        ft1Var.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateNativeTextDrawLayout$lambda$0(GameActivity gameActivity, String[] strArr, int i, float[] fArr, int[] iArr) {
        if (gameActivity.isFinishing() || gameActivity.isDestroyed()) {
            return;
        }
        strArr.getClass();
        l41 l41Var = new l41(0, strArr.length - 1, 1);
        ArrayList arrayList = new ArrayList(rx.d0(l41Var, 10));
        Iterator it = l41Var.iterator();
        while (((k41) it).h) {
            int iNextInt = ((e41) it).nextInt();
            int i2 = iNextInt * 3;
            arrayList.add(new ht1(strArr[iNextInt], fArr[i2], fArr[i2 + 1], fArr[i2 + 2], iArr[iNextInt], true));
        }
        nt1 nt1Var = gameActivity.nativeTextDrawView;
        if (nt1Var == null || !nt1Var.f.containsKey(Integer.valueOf(i))) {
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        HashMap map = nt1Var.h;
        if (zIsEmpty) {
            map.remove(Integer.valueOf(i));
        } else {
            map.put(Integer.valueOf(i), arrayList);
        }
        nt1Var.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateNativeTextDrawText$lambda$0(GameActivity gameActivity, int i, String str) throws Throwable {
        if (gameActivity.isFinishing() || gameActivity.isDestroyed()) {
            return;
        }
        nt1 nt1Var = gameActivity.nativeTextDrawView;
        if (nt1Var != null) {
            str.getClass();
            LinkedHashMap linkedHashMap = nt1Var.f;
            gt1 gt1Var = (gt1) linkedHashMap.get(Integer.valueOf(i));
            if (gt1Var != null) {
                nt1Var.g.remove(Integer.valueOf(i));
                nt1Var.h.remove(Integer.valueOf(i));
                linkedHashMap.put(Integer.valueOf(i), new gt1(gt1Var.a, str, gt1Var.c, gt1Var.d, gt1Var.e, gt1Var.f, gt1Var.g, gt1Var.h, gt1Var.i, gt1Var.j, gt1Var.k, gt1Var.l));
                nt1Var.invalidate();
            }
        }
        gameActivity.syncNativeTextDrawRuns(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateServerNotification(int i) {
        if (this.showServerNotificationEnabled) {
            try {
                if (nativeGetGameState() != 5) {
                    Object systemService = getSystemService("notification");
                    NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                    if (notificationManager == null) {
                        return;
                    }
                    notificationManager.cancel(1001);
                    return;
                }
                String strNativeGetServerAddress = nativeGetServerAddress();
                if (strNativeGetServerAddress != null && !y93.q0(strNativeGetServerAddress)) {
                    this.lastServerAddress = strNativeGetServerAddress;
                    ur.K(this, strNativeGetServerAddress, getLaunchNickname(), lq.p(nativeGetServerName()));
                    return;
                }
                if (i > 0) {
                    getWindow().getDecorView().postDelayed(new au0(i, 2, this), 1000L);
                }
            } catch (UnsatisfiedLinkError unused) {
            }
        }
    }

    public static /* synthetic */ void updateServerNotification$default(GameActivity gameActivity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        gameActivity.updateServerNotification(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vibrateCleo$lambda$0(GameActivity gameActivity, int i) {
        Vibrator cleoVibrator = gameActivity.getCleoVibrator();
        if (cleoVibrator == null) {
            return;
        }
        cleoVibrator.vibrate(VibrationEffect.createOneShot(i, -1));
    }

    public static void w0(GameActivity gameActivity, Button button, View view) {
        gameActivity.removeCleoBreakpointOverlay();
        try {
            gameActivity.nativeCleoBreakpointResumed();
        } catch (Throwable unused) {
        }
    }

    private final void writeLaunchSettings(File file) {
        Object qn2Var;
        ti tiVar = ti.i;
        String stringExtra = getIntent().getStringExtra("server_host");
        String str = null;
        String string = stringExtra != null ? y93.G0(stringExtra).toString() : null;
        if (string == null) {
            string = "";
        }
        int intExtra = getIntent().getIntExtra("server_port", -1);
        String stringExtra2 = getIntent().getStringExtra("nickname");
        String string2 = stringExtra2 != null ? y93.G0(stringExtra2).toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        int intExtra2 = getIntent().getIntExtra("fps_limit", 60);
        String stringExtra3 = getIntent().getStringExtra("gpci");
        String string3 = stringExtra3 != null ? y93.G0(stringExtra3).toString() : null;
        if (string3 == null) {
            string3 = "";
        }
        if (y93.q0(string) || 1 > intExtra || intExtra >= 65536) {
            ti tiVar2 = ui.a;
            ui.c(tiVar, "GameActivity", "Launch server settings missing or invalid", null);
            return;
        }
        File file2 = new File(file, "SAMP");
        if (!file2.exists() && !file2.mkdirs()) {
            ti tiVar3 = ui.a;
            ui.c(tiVar, "GameActivity", "Unable to create SAMP settings directory", null);
            return;
        }
        r32 r32Var = new r32("host", lq.X(string));
        r32 r32Var2 = new r32("port", String.valueOf(intExtra));
        String strX = lq.X(string2);
        if (y93.q0(strX)) {
            strX = "Player";
        }
        r32[] r32VarArr = {r32Var, r32Var2, new r32("name", y93.F0(24, strX)), new r32("version", String.valueOf(y02.h(getIntent().getIntExtra("client_version", 0), 0, 1))), new r32("version_name", lq.X(getLaunchClientVersionName())), new r32("gpci", lq.X(string3))};
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(om1.X(6));
        om1.Z(linkedHashMap, r32VarArr);
        String stringExtra4 = getIntent().getStringExtra("server_password");
        String string4 = stringExtra4 != null ? y93.G0(stringExtra4).toString() : null;
        linkedHashMap.put("password", lq.X(string4 != null ? string4 : ""));
        r32 r32Var3 = new r32("androidkeyboard", String.valueOf(!getNativeKeyboardEnabled()));
        r32 r32Var4 = new r32("KeyboardLayout", resolveNativeKeyboardLayout());
        r32 r32Var5 = new r32("FPSLimit", String.valueOf(intExtra2));
        String stringExtra5 = getIntent().getStringExtra("radar_position");
        if (stringExtra5 != null && !y93.q0(stringExtra5)) {
            str = stringExtra5;
        }
        if (str == null) {
            str = "top_left";
        }
        r32[] r32VarArr2 = {r32Var3, r32Var4, r32Var5, new r32("RadarPosition", str), new r32("EmulatePcClientCheck", String.valueOf(getIntent().getBooleanExtra("emulate_pc_client_check", false)))};
        LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>(om1.X(5));
        om1.Z(linkedHashMap2, r32VarArr2);
        File file3 = new File(file2, "settings.ini");
        try {
            updateIniSection(file3, "client", linkedHashMap);
            updateIniSection(file3, "gui", linkedHashMap2);
            qn2Var = dm3.a;
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        Throwable thA = rn2.a(qn2Var);
        if (thA != null) {
            ti tiVar4 = ui.a;
            ui.c(ti.j, "GameActivity", "Failed to write launch settings", thA);
        }
    }

    public static void y(GameActivity gameActivity) {
        gameActivity.removeCleoBreakpointOverlay();
    }

    @Override // com.wardrumstudios.utils.WarMedia
    public final boolean ServiceAppCommand(String str, String str2) {
        if (!fa3.Z(str, "SetLocale", true)) {
            return false;
        }
        SetLocale(str2);
        return false;
    }

    @Override // com.wardrumstudios.utils.WarMedia
    public final int ServiceAppCommandValue(String str, String str2) {
        if (fa3.Z(str, "GetDownloadBytes", true)) {
            return 0;
        }
        if (fa3.Z(str, "GetDownloadState", true)) {
            return 4;
        }
        return (fa3.Z(str, "GetNetworkState", true) && isNetworkAvailable()) ? 1 : 0;
    }

    public final void UpdateWeaponWheel(String str) {
        str.getClass();
    }

    public final void addNativeChatLine(String str, int i) {
        if (str == null || y93.q0(str)) {
            return;
        }
        if (getShowChatTimestamp()) {
            str = "[" + su0.d.format(new Date()) + "] " + str;
        }
        runOnUiThread(new rt0(this, str, i, 1));
    }

    public final void addNativeChatLineBytes(byte[] bArr, int i) {
        bArr.getClass();
        addNativeChatLine(lq.p(bArr), i);
    }

    @Override // defpackage.wf, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        String string;
        context.getClass();
        Intent intent = getIntent();
        if ((intent == null || (string = intent.getStringExtra("language_tag")) == null) && (string = context.getSharedPreferences("servers", 0).getString("language_tag", null)) == null) {
            string = qi.a();
        }
        super.attachBaseContext(qi.c(context, string));
    }

    public final native void attachEditClick(int i, boolean z);

    public final void clearNativeTextDraws() {
        runOnUiThread(new ft0(16, this));
    }

    public final void clearTab() {
        runOnUiThread(new ft0(17, this));
    }

    public final byte[] decodePluginImage(byte[] bArr) {
        bArr.getClass();
        String strP = lq.p(bArr);
        if (y93.q0(strP)) {
            return new byte[0];
        }
        synchronized (this.pluginImageDecodeLock) {
            byte[] bArrRemove = this.completedPluginImageDecodes.remove(strP);
            if (bArrRemove != null) {
                return bArrRemove;
            }
            if (this.failedPluginImageDecodes.contains(strP)) {
                return su0.c;
            }
            if (this.pendingPluginImageDecodes.contains(strP)) {
                return su0.b;
            }
            if (this.pendingPluginImageDecodes.size() + this.completedPluginImageDecodes.size() >= 8) {
                return su0.c;
            }
            this.pendingPluginImageDecodes.add(strP);
            hf1 hf1VarA = pq.A(this);
            j90 j90Var = ac0.a;
            cl3.t(hf1VarA, x80.h, new rw(this, strP, (p40) null, 3), 2);
            return su0.b;
        }
    }

    @Override // defpackage.wf, defpackage.wz, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 4 && keyCode != 111) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0) {
            handleBackPress();
            return true;
        }
        if (keyEvent.getAction() == 1) {
            hideSystemUI();
        }
        return true;
    }

    @Override // com.nvidia.devtech.NvEventQueueActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        dispatchCleoMenuSwipe(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void downloadDlModel(String str, String str2, long j, int i, int i2, long j2) {
        str.getClass();
        str2.getClass();
        hf1 hf1VarA = pq.A(this);
        j90 j90Var = ac0.a;
        cl3.t(hf1VarA, x80.h, new nu0(this, j, i, str2, j2, str, i2, null), 2);
    }

    public final native void exitEditObject();

    public final void exitGame() {
        if (!this.nativeExitRequested.compareAndSet(false, true)) {
            ti tiVar = ui.a;
            ui.c(ti.i, "GameActivity", "Ignoring duplicate native exit request", null);
            return;
        }
        ti tiVar2 = ui.a;
        ui.a("GameActivity", "exitGame called by native");
        finishPluginSession();
        Object systemService = getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            notificationManager.cancel(1001);
        }
        runOnUiThread(new ft0(11, this));
    }

    public final native void forceEndNativeUserPause();

    public final List<at> getChatLinesSnapshot() {
        List<SpannableString> list = this.nativeChatLines;
        ArrayList arrayList = new ArrayList(rx.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String string = ((SpannableString) it.next()).toString();
            string.getClass();
            arrayList.add(new at(string));
        }
        return arrayList;
    }

    public final byte[] getClipboardTextBytes() {
        return this.pluginClipboardCache;
    }

    public final boolean getDialogVisible() {
        return ((Boolean) this.dialogVisible$delegate.getValue()).booleanValue();
    }

    public final boolean getEditObjectVisible() {
        return ((Boolean) this.editObjectVisible$delegate.getValue()).booleanValue();
    }

    public final boolean getHudVisible() {
        return ((Boolean) this.hudVisible$delegate.getValue()).booleanValue();
    }

    public final boolean getKeyboardVisible() {
        return ((Boolean) this.keyboardVisible$delegate.getValue()).booleanValue();
    }

    public final boolean getLoadingScreenVisible() {
        return ((Boolean) this.loadingScreenVisible$delegate.getValue()).booleanValue();
    }

    public final native int getNativeOverlayState();

    public final boolean getNetworkPacketFilterState(int i, int i2, int i3) {
        try {
            return nativeIsNetworkPacketFilterEnabled(i, i2, i3);
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public final native float[] getPlayerPlacementSnapshot();

    public final native float[] getRadarScreenRect();

    public final boolean getRpcFilterState(int i) {
        try {
            return nativeIsRpcFilterEnabled(i);
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public final boolean getSettingsMenuVisible() {
        sz2 sz2Var = this.settingsMenu;
        if (sz2Var == null) {
            return false;
        }
        if (sz2Var != null) {
            return sz2Var.b();
        }
        s51.F("settingsMenu");
        throw null;
    }

    public final boolean getTabVisible() {
        return ((Boolean) this.tabVisible$delegate.getValue()).booleanValue();
    }

    public final boolean handleSampEscButton() {
        Object qn2Var;
        try {
            qn2Var = Boolean.valueOf(nativeCancelTextDrawSelection());
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        Object obj = Boolean.FALSE;
        if (qn2Var instanceof qn2) {
            qn2Var = obj;
        }
        return ((Boolean) qn2Var).booleanValue();
    }

    public final native void hideChatKeyboard();

    public final void hideCleoBreakpoint() {
        runOnUiThread(new ft0(19, this));
    }

    public final void hideCleoDialogIfId(int i) {
        runOnUiThread(new au0(i, 4, this));
    }

    public final void hideCleoMenu() {
        runOnUiThread(new ft0(1, this));
    }

    public final void hideCleoMenuArrow() {
        runOnUiThread(new ft0(7, this));
    }

    public final void hideDlModelProgress() {
        final long jIncrementAndGet = this.dlModelProgressRequest.incrementAndGet();
        runOnUiThread(new Runnable() { // from class: fu0
            @Override // java.lang.Runnable
            public final void run() {
                GameActivity.hideDlModelProgress$lambda$0(this.f, jIncrementAndGet);
            }
        });
    }

    public final void hideEditObject() {
        ti tiVar = ui.a;
        ui.a("GameActivity", "hideEditObject called");
        setEditObjectVisible(false);
        runOnUiThread(new ft0(0, this));
    }

    public final void hideKeyboard() {
        setKeyboardVisible(false);
    }

    public final void hideLoadingScreen() {
        setLoadingScreenVisible(false);
        updateServerNotification$default(this, 0, 1, null);
    }

    public final void hideNativeTextDraw(int i) {
        runOnUiThread(new au0(i, 1, this));
    }

    public final void hideTab() {
        runOnUiThread(new ft0(10, this));
    }

    public final void hideWithoutReset() {
        runOnUiThread(new ft0(8, this));
    }

    public final void hidehud() {
        setHudVisible(false);
    }

    public native void initializeSAMP();

    public final boolean isPaused() {
        return ((Boolean) this.isPaused$delegate.getValue()).booleanValue();
    }

    public final native boolean nativeCancelTextDrawSelection();

    public final native int nativeGetGameState();

    public final native String[] nativeGetSampButtonsCaptions();

    public final native int[] nativeGetSampButtonsColors();

    public final native float[] nativeGetSampButtonsMetrics();

    public final native String nativeGetServerAddress();

    public final native byte[] nativeGetServerName();

    public final native void nativeImGuiAddButton(int i, float f, float f2, float f3, float f4, int i2, String str);

    public final native void nativeImGuiClearCommands();

    public final native void nativeImGuiRemoveCommand(int i);

    @Override // com.nvidia.devtech.NvEventQueueActivity
    public native void nativeImGuiRenderFrame();

    @Override // com.nvidia.devtech.NvEventQueueActivity
    public native void nativeImGuiTouchEvent(int i, int i2, int i3, int i4);

    public final native boolean nativeIsNetworkPacketFilterEnabled(int i, int i2, int i3);

    public final native boolean nativeIsRpcFilterEnabled(int i);

    public final native void nativeNotifyNativeInput();

    public final native boolean nativeSampButtonsTouch(int i, int i2, int i3, int i4);

    public final native void nativeSendQuickCommand(String str);

    public final native void nativeSetAppForeground(boolean z);

    public final native void nativeSetNetworkPacketFilter(int i, int i2, int i3, boolean z);

    public final native void nativeSetRpcFilter(int i, boolean z);

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    @Override // com.wardrumstudios.utils.WarMedia, defpackage.tr3, com.nvidia.devtech.NvEventQueueActivity, defpackage.lr0, defpackage.xz, defpackage.wz, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.th1nk.samp.feature.game.GameActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.nvidia.devtech.NvEventQueueActivity, defpackage.wf, defpackage.lr0, android.app.Activity
    public final void onDestroy() {
        ti tiVar = ui.a;
        ui.a("GameActivity", "onDestroy");
        Runnable runnable = this.cleoMenuStartupHintRunnable;
        if (runnable != null) {
            getWindow().getDecorView().removeCallbacks(runnable);
        }
        this.cleoMenuStartupHintRunnable = null;
        removeCleoBreakpointOverlay();
        removeCleoMenuArrowOverlay();
        unregisterPluginClipboardListener();
        finishPluginSession();
        Object systemService = getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            notificationManager.cancel(1001);
        }
        super.onDestroy();
    }

    public native void onEventBackPressed();

    public final void onImGuiButtonClick(int i) {
        ti tiVar = ui.a;
        ui.c(ti.g, "GameActivity", by1.e(i, "onImGuiButtonClick: id="), null);
        if (i == 100) {
            showSettingsMenu();
        }
    }

    public native void onInputEnd(byte[] bArr);

    @Override // com.wardrumstudios.utils.WarMedia, com.nvidia.devtech.NvEventQueueActivity, defpackage.lr0, android.app.Activity
    public final void onPause() {
        super.onPause();
        nativeSetAppForeground(false);
        GameAudioPlayer.pause();
        Runnable runnable = this.disconnectWatchRunnable;
        if (runnable != null) {
            getWindow().getDecorView().removeCallbacks(runnable);
        }
        try {
            if (nativeGetGameState() != 5) {
                Object systemService = getSystemService("notification");
                NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                if (notificationManager == null) {
                    return;
                }
                notificationManager.cancel(1001);
            }
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    @Override // com.wardrumstudios.utils.WarMedia, com.nvidia.devtech.NvEventQueueActivity, defpackage.lr0, android.app.Activity
    public final void onResume() {
        super.onResume();
        ti tiVar = ui.a;
        ui.c(ti.g, "GameActivity", "onResume", null);
        nativeSetAppForeground(true);
        GameAudioPlayer.resume();
        hideSystemUI();
        getWindow().getDecorView().postDelayed(new ft0(3, this), 2000L);
        scheduleCleoMenuStartupHint();
        ur.y(this);
        j90 j90Var = ac0.a;
        cl3.t(ur.c(tl1.a), null, new j(this, null, 24), 3);
        startDisconnectWatcher();
    }

    @Override // com.nvidia.devtech.NvEventQueueActivity, defpackage.wf, defpackage.lr0, android.app.Activity
    public final void onStop() {
        super.onStop();
        try {
            if (nativeGetGameState() != 5) {
                Object systemService = getSystemService("notification");
                NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                if (notificationManager == null) {
                    return;
                }
                notificationManager.cancel(1001);
            }
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public final native void onTabPlayerClick(int i);

    @Override // com.nvidia.devtech.NvEventQueueActivity, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            hideSystemUI();
        }
    }

    public final byte[] renderChatBubbleTexture(byte[] bArr, int i, boolean z, int i2) {
        bArr.getClass();
        return renderTextTexture(bArr, i, z, i2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] renderMaterialText(byte[] r6, int r7, int r8, int r9, boolean r10, int r11, int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.th1nk.samp.feature.game.GameActivity.renderMaterialText(byte[], int, int, int, boolean, int, int, int):byte[]");
    }

    public final byte[] renderTextLabelTexture(byte[] bArr, int i, boolean z, int i2) {
        bArr.getClass();
        return renderTextTexture(bArr, i, z, i2, false);
    }

    public final native void saveEditObject();

    public final native void sendDialogResponse(int i, int i2, int i3, byte[] bArr);

    public final native void sendSyntheticNativeTouch(int i, int i2);

    public final native void setAllowNextNativePauseMenu(boolean z);

    public final boolean setCleoDialogInput(byte[] bArr) {
        bArr.getClass();
        return runCleoDialogMutation(new u1(19, this, bArr));
    }

    public final boolean setCleoDialogListItem(int i) {
        return runCleoDialogMutation(new wt0(i, 0, this));
    }

    public final boolean setCleoMenuActiveIndex(int i) {
        boolean z = this.cleoMenuOverlay != null && i >= 0;
        runOnUiThread(new au0(i, this));
        return z;
    }

    public final void setClipboardTextBytes(byte[] bArr) {
        bArr.getClass();
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        this.pluginClipboardCache = bArrCopyOf;
        getWindow().getDecorView().post(new a8(4, this, bArrCopyOf));
    }

    public final native void setDataDir(String str);

    public final native void setLogLevel(int i);

    public final native void setNativeDialogVisible(boolean z);

    public final native void setNativeOverlayState(int i);

    public final void setNetworkPacketFilterState(int i, int i2, int i3, boolean z) {
        try {
            nativeSetNetworkPacketFilter(i, i2, i3, z);
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public final void setPauseState(final boolean z) {
        setPaused(z);
        if (z) {
            GameAudioPlayer.pause();
        } else {
            GameAudioPlayer.resume();
        }
        this.nativeChatHiddenByPause = z;
        runOnUiThread(new Runnable() { // from class: st0
            @Override // java.lang.Runnable
            public final void run() {
                GameActivity.setPauseState$lambda$0(z, this);
            }
        });
    }

    public final void setRpcFilterState(int i, boolean z) {
        try {
            nativeSetRpcFilter(i, z);
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public final void setSampButtonsState(final boolean z, final boolean z2) {
        runOnUiThread(new Runnable() { // from class: gu0
            @Override // java.lang.Runnable
            public final void run() {
                GameActivity.setSampButtonsState$lambda$0(this.f, z, z2);
            }
        });
    }

    public final void setTab(final int i, byte[] bArr, final int i2, final int i3, final int i4) {
        bArr.getClass();
        final String strP = lq.p(bArr);
        runOnUiThread(new Runnable() { // from class: nt0
            @Override // java.lang.Runnable
            public final void run() {
                GameActivity.setTab$lambda$0(this.f, i, strP, i4, i2, i3);
            }
        });
    }

    public final void setTabHeader(byte[] bArr, int i) {
        bArr.getClass();
        String strP = lq.p(bArr);
        if (y93.q0(strP)) {
            strP = "SA-MP Server";
        }
        this.lastServerName = strP;
        this.lastPlayerCount = i;
        runOnUiThread(new rt0(this, strP, i, 0));
        updateServerNotification$default(this, 0, 1, null);
    }

    public final native void showChatKeyboard();

    public final void showCleoBreakpoint(String str) {
        str.getClass();
        runOnUiThread(new a8(3, this, str));
    }

    public final void showCleoMenu(String str, String str2, String[] strArr, int i) {
        str.getClass();
        str2.getClass();
        strArr.getClass();
        showCleoMenuInternal(str, str2, strArr, i, false);
    }

    public final void showCleoMenuArrow() {
        runOnUiThread(new ft0(15, this));
    }

    public final void showCleoToast(final String str, final boolean z) {
        str.getClass();
        runOnUiThread(new Runnable() { // from class: hu0
            @Override // java.lang.Runnable
            public final void run() {
                GameActivity.showCleoToast$lambda$0(this.f, str, z);
            }
        });
    }

    public final void showDialog(final int i, final int i2, byte[] bArr, final byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        bArr.getClass();
        bArr2.getClass();
        bArr3.getClass();
        bArr4.getClass();
        final String strP = lq.p(bArr);
        final String strP2 = lq.p(bArr2);
        String strP3 = lq.p(bArr3);
        if (y93.q0(strP3)) {
            strP3 = "OK";
        }
        final String str = strP3;
        final String strP4 = lq.p(bArr4);
        runOnUiThread(new Runnable() { // from class: jt0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                GameActivity.D0(this.f, i, i2, strP, strP2, str, strP4, bArr2);
            }
        });
    }

    public final void showDlModelProgress(final int i) {
        final long jIncrementAndGet = this.dlModelProgressRequest.incrementAndGet();
        runOnUiThread(new Runnable() { // from class: mt0
            @Override // java.lang.Runnable
            public final void run() {
                GameActivity.showDlModelProgress$lambda$0(this.f, jIncrementAndGet, i);
            }
        });
    }

    public final void showEditObject() {
        ti tiVar = ui.a;
        ui.a("GameActivity", "showEditObject called");
        setEditObjectVisible(true);
        runOnUiThread(new ft0(13, this));
    }

    public final void showKeyboard() {
        setKeyboardVisible(true);
    }

    public final void showLoadingScreen() {
        setLoadingScreenVisible(true);
    }

    public final native boolean showLocalPickupPreview(int i, int i2, float f, float f2, float f3);

    public final void showNativeTextDraw(final int i, byte[] bArr, final float f, final float f2, final float f3, final float f4, float f5, float f6, final int i2, int i3, final int i4, final int i5, final int i6, final int i7, final int i8, boolean z, boolean z2, boolean z3) {
        bArr.getClass();
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        final String str = new String(bArr, charset);
        runOnUiThread(new Runnable() { // from class: ju0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                GameActivity.showNativeTextDraw$lambda$0(this.f, i, str, f, f2, f3, f4, i2, i4, i5, i6, i7, i8);
            }
        });
    }

    public final void showTab() {
        runOnUiThread(new ft0(5, this));
    }

    public final void showWithoutReset() {
        runOnUiThread(new ft0(6, this));
    }

    public final void showhud() {
        setHudVisible(true);
    }

    public final void stopCleoVibration() {
        runOnUiThread(new ft0(9, this));
    }

    public final void updateDlModelProgress(final long j, final int i, final int i2) {
        runOnUiThread(new Runnable() { // from class: xt0
            @Override // java.lang.Runnable
            public final void run() {
                GameActivity.updateDlModelProgress$lambda$0(this.f, j, i, i2);
            }
        });
    }

    public final void updateNativeTextDrawLayout(final int i, final String[] strArr, final float[] fArr, final int[] iArr) {
        strArr.getClass();
        fArr.getClass();
        iArr.getClass();
        if (fArr.length == strArr.length * 3 && iArr.length == strArr.length) {
            runOnUiThread(new Runnable() { // from class: tt0
                @Override // java.lang.Runnable
                public final void run() {
                    GameActivity.updateNativeTextDrawLayout$lambda$0(this.f, strArr, i, fArr, iArr);
                }
            });
        }
    }

    public final void updateNativeTextDrawText(int i, byte[] bArr) {
        bArr.getClass();
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        runOnUiThread(new rt0(this, i, new String(bArr, charset)));
    }

    public final void vibrateCleo(int i) {
        if (i <= 0) {
            return;
        }
        runOnUiThread(new au0(i, 3, this));
    }

    private final void setSettingsMenuVisible(boolean z) {
    }

    public final void ShowLogo(boolean z) {
    }

    public final void UpdateHud(int i, int i2, int i3, int i4, int i5, int i6) {
    }
}
