package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Trace;
import android.view.accessibility.AccessibilityManager;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class s51 {
    public static final gy A;
    public static final pl3 B;
    public static final h01 C;
    public static final ar2 D;
    public static final ar2 E;
    public static final ar2 F;
    public static final ar2 G;
    public static final ar2 H;
    public static final gy I;
    public static final b23 J;
    public static final gy K;
    public static final float L;
    public static final float M;
    public static final float N;
    public static final ai0 O;
    public static final ai0 P;
    public static final om0 Q;
    public static w01 R;
    public static final d00 b;
    public static final d00 d;
    public static final d00 g;
    public static final ai0 h;
    public static final ai0 i;
    public static final ai0 m;
    public static final ai0 n;
    public static final ai0 o;
    public static final ai0 p;
    public static final ai0 q;
    public static final b23 w;
    public static final x91 x;
    public static final gy y;
    public static final b23 z;
    public static final float[] a = new float[91];
    public static final d00 c = new d00(2057551325, new z1(26), false);
    public static final d00 e = new d00(1092803054, new k00(18), false);
    public static final d00 f = new d00(1655169209, new p00(23), false);
    public static final float[] j = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] k = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final ya l = new ya(2);
    public static final ii0 r = new ii0(false);
    public static final ii0 s = new ii0(true);
    public static final ya t = new ya(3);
    public static final gy u = gy.v;
    public static final float v = 3.0f;

    static {
        int i2 = 10;
        byte b2 = 0;
        b = new d00(-1131826196, new wc(i2), false);
        int i3 = 22;
        d = new d00(906736656, new p00(i3), false);
        int i4 = 6;
        g = new d00(641200809, new z00(i4, b2), false);
        int i5 = 1;
        h = new ai0(i5, "UNDEFINED");
        i = new ai0(i5, "REUSABLE_CLAIMED");
        m = new ai0(i5, "COMPLETING_ALREADY");
        n = new ai0(i5, "COMPLETING_WAITING_CHILDREN");
        o = new ai0(i5, "COMPLETING_RETRY");
        p = new ai0(i5, "TOO_LATE_TO_CANCEL");
        q = new ai0(i5, "SEALED");
        b23 b23Var = b23.h;
        w = b23Var;
        x = new x91(27);
        y = gy.i;
        z = b23Var;
        A = gy.g;
        B = pl3.h;
        C = new h01(i3);
        int i6 = 9;
        D = new ar2(b2, new br2(i6), new cr2(5));
        E = new ar2(b2, new br2(i2), new cr2(i4));
        F = new ar2(b2, new br2(11), new cr2(7));
        G = new ar2(b2, new br2(12), new cr2(8));
        H = new ar2(b2, new br2(13), new cr2(i6));
        I = gy.y;
        J = b23.g;
        K = gy.n;
        L = 4.0f;
        M = 32.0f;
        N = 1.0f;
        O = new ai0(i5, "NONE");
        P = new ai0(i5, "PENDING");
        Q = new om0(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(defpackage.p40 r9, java.lang.Object r10) throws defpackage.vb0 {
        /*
            boolean r0 = r9 instanceof defpackage.wb0
            if (r0 == 0) goto Lae
            wb0 r9 = (defpackage.wb0) r9
            q50 r0 = r9.i
            q40 r1 = r9.j
            java.lang.Throwable r2 = defpackage.rn2.a(r10)
            if (r2 != 0) goto L12
            r3 = r10
            goto L18
        L12:
            jz r3 = new jz
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            o50 r2 = r1.i()
            boolean r2 = C(r0, r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r9.k = r3
            r9.h = r4
            o50 r10 = r1.i()
            B(r0, r10, r9)
            return
        L2f:
            qj0 r0 = defpackage.qh3.a()
            long r5 = r0.h
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r9.k = r3
            r9.h = r4
            r0.G(r9)
            goto La8
        L46:
            r0.H(r4)
            o50 r2 = r1.i()     // Catch: java.lang.Throwable -> L69
            f5 r3 = defpackage.f5.b0     // Catch: java.lang.Throwable -> L69
            m50 r2 = r2.m(r3)     // Catch: java.lang.Throwable -> L69
            j61 r2 = (defpackage.j61) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.b()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r10 = r2.o()     // Catch: java.lang.Throwable -> L69
            qn2 r10 = defpackage.y02.l(r10)     // Catch: java.lang.Throwable -> L69
            r9.t(r10)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r10 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r9.l     // Catch: java.lang.Throwable -> L69
            o50 r3 = r1.i()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = defpackage.cl3.F(r3, r2)     // Catch: java.lang.Throwable -> L69
            ai0 r5 = defpackage.cl3.v0     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            xl3 r5 = defpackage.uq.P(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.t(r10)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r10 = r5.t0()     // Catch: java.lang.Throwable -> L69
            if (r10 == 0) goto L8d
        L8a:
            defpackage.cl3.A(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r10 = r0.J()     // Catch: java.lang.Throwable -> L69
            if (r10 != 0) goto L8d
        L93:
            r0.F(r4)
            goto La8
        L97:
            r10 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.t0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            defpackage.cl3.A(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r10     // Catch: java.lang.Throwable -> L69
        La4:
            r9.g(r10)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.F(r4)
            throw r9
        Lae:
            r9.t(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s51.A(p40, java.lang.Object):void");
    }

    public static final void B(q50 q50Var, o50 o50Var, Runnable runnable) throws vb0 {
        try {
            q50Var.B(o50Var, runnable);
        } catch (Throwable th) {
            throw new vb0(th, q50Var, o50Var);
        }
    }

    public static final boolean C(q50 q50Var, o50 o50Var) throws vb0 {
        try {
            return q50Var.D(o50Var);
        } catch (Throwable th) {
            throw new vb0(th, q50Var, o50Var);
        }
    }

    public static void D(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static final bq1 E(bq1 bq1Var, af afVar, gh3 gh3Var, ns0 ns0Var, int i2, boolean z2, int i3, int i4, zp0 zp0Var, List list, ns0 ns0Var2, ns0 ns0Var3) {
        return bq1Var.d(yp1.a).d(new od3(afVar, gh3Var, zp0Var, ns0Var, i2, z2, i3, i4, list, ns0Var2, ns0Var3));
    }

    public static void F(String str) {
        kz kzVar = new kz(nc2.i("lateinit property ", str, " has not been initialized"));
        D(kzVar, s51.class.getName());
        throw kzVar;
    }

    public static final Bitmap.Config G(int i2) {
        return i2 == 0 ? Bitmap.Config.ARGB_8888 : i2 == 1 ? Bitmap.Config.ALPHA_8 : i2 == 2 ? Bitmap.Config.RGB_565 : i2 == 3 ? Bitmap.Config.RGBA_F16 : i2 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final long H(long j2) {
        long j3 = 63 & j2;
        int i2 = (int) j3;
        return i2 <= 15 ? j2 : i2 == ky.u.c ? vp.T(j2) : ((i2 == ky.v.c || i2 == ky.w.c) && Build.VERSION.SDK_INT < 34) ? vp.T(j2) : (i2 != ky.x.c || Build.VERSION.SDK_INT >= 36) ? (j2 & (-64)) | (j3 - 1) : vp.T(j2);
    }

    public static final long I(long j2) {
        int i2 = (int) (63 & j2);
        return (i2 == ky.x.c || i2 == ky.s.c || i2 == ky.t.c) ? H(wx.a(j2, ky.e)) : H(j2);
    }

    public static final void J(long j2, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j2);
        }
    }

    public static final Object K(Object obj) {
        g11 g11Var;
        h11 h11Var = obj instanceof h11 ? (h11) obj : null;
        return (h11Var == null || (g11Var = h11Var.a) == null) ? obj : g11Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Type inference failed for: r0v71, types: [eb0[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void L(android.content.Context r18, java.util.concurrent.Executor r19, defpackage.md2 r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s51.L(android.content.Context, java.util.concurrent.Executor, md2, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.af r19, final defpackage.bq1 r20, final defpackage.gh3 r21, final defpackage.ns0 r22, final int r23, final boolean r24, final int r25, final int r26, final java.util.Map r27, defpackage.nv0 r28, final int r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s51.a(af, bq1, gh3, ns0, int, boolean, int, int, java.util.Map, nv0, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r19, final defpackage.bq1 r20, final defpackage.gh3 r21, int r22, boolean r23, final int r24, int r25, defpackage.nv0 r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s51.b(java.lang.String, bq1, gh3, int, boolean, int, int, nv0, int, int):void");
    }

    public static final void c(bq1 bq1Var, h5 h5Var, d00 d00Var, nv0 nv0Var, int i2, int i3) {
        int i4;
        nv0Var.b0(380139498);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i4 = (nv0Var.f(bq1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= nv0Var.f(h5Var) ? 32 : 16;
        }
        int i7 = i4 | 384;
        if ((i2 & 3072) == 0) {
            i7 |= nv0Var.h(d00Var) ? 2048 : 1024;
        }
        if (nv0Var.R(i7 & 1, (i7 & 1171) != 1170)) {
            if (i6 != 0) {
                h5Var = f5.g;
            }
            cn1 cn1VarD = eo.d(h5Var, false);
            boolean zF = nv0Var.f(cn1VarD) | ((i7 & 7168) == 2048);
            Object objO = nv0Var.O();
            if (zF || objO == c20.a) {
                objO = new y7(i5, cn1VarD, d00Var);
                nv0Var.j0(objO);
            }
            n92.b(bq1Var, (rs0) objO, nv0Var, i7 & 14, 0);
        } else {
            nv0Var.U();
        }
        h5 h5Var2 = h5Var;
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ko(bq1Var, h5Var2, d00Var, i2, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0200  */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r39v0, types: [nv0] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, os1] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.bq1 r27, defpackage.af r28, final defpackage.ns0 r29, final boolean r30, final java.util.Map r31, final defpackage.gh3 r32, final int r33, final boolean r34, final int r35, final int r36, final defpackage.zp0 r37, final defpackage.ns0 r38, defpackage.nv0 r39, final int r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 1123
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s51.d(bq1, af, ns0, boolean, java.util.Map, gh3, int, boolean, int, int, zp0, ns0, nv0, int, int):void");
    }

    public static final i93 e(Object obj) {
        if (obj == null) {
            obj = vm1.b0;
        }
        return new i93(obj);
    }

    public static final void f(of1 of1Var, ns0 ns0Var, cs0 cs0Var, nv0 nv0Var, int i2) {
        nv0Var.b0(-1868327245);
        int i3 = (nv0Var.h(of1Var) ? 4 : 2) | i2 | (nv0Var.h(ns0Var) ? 32 : 16) | (nv0Var.h(cs0Var) ? 256 : 128);
        int i4 = 0;
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            boolean zH = ((i3 & 112) == 32) | nv0Var.h(of1Var) | ((i3 & 896) == 256);
            Object objO = nv0Var.O();
            if (zH || objO == c20.a) {
                objO = new v1(of1Var, ns0Var, cs0Var, i4);
                nv0Var.j0(objO);
            }
            rn.g(of1Var, (ns0) objO, nv0Var);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w1((Object) of1Var, (Object) ns0Var, (Object) cs0Var, i2, 0);
        }
    }

    public static final void g(final int i2, final int i3, nv0 nv0Var, final int i4) {
        nv0 nv0Var2 = nv0Var;
        nv0Var2.b0(-325507409);
        int i5 = i4 & 1;
        if (nv0Var2.R(i5, i5 != 0)) {
            yp1 yp1Var = yp1.a;
            bq1 bq1VarK = f80.K(j43.c(yp1Var, 1.0f), 8.0f, 6.0f);
            dp2 dp2VarA = cp2.a(n92.b, f5.q, nv0Var2, 48);
            int iHashCode = Long.hashCode(nv0Var2.T);
            n52 n52VarL = nv0Var2.l();
            bq1 bq1VarM = lr.M(nv0Var2, bq1VarK);
            w10.c.getClass();
            nv0Var2.d0();
            if (nv0Var2.S) {
                nv0Var2.k(tb1.Y);
            } else {
                nv0Var2.m0();
            }
            y02.F(f5.E, nv0Var2, dp2VarA);
            y02.F(f5.D, nv0Var2, n52VarL);
            y02.F(f5.F, nv0Var2, Integer.valueOf(iHashCode));
            y02.C(nv0Var2);
            y02.F(f5.C, nv0Var2, bq1VarM);
            String strM = oz2.M(2131624587, nv0Var2);
            r93 r93Var = ql3.a;
            gh3 gh3Var = ((ol3) nv0Var2.j(r93Var)).o;
            xq0 xq0Var = xq0.k;
            bq1 bq1VarO = j43.o(yp1Var, 36.0f);
            zv0 zv0Var = zb3.c;
            mg3.b(strM, bq1VarO, 0L, 0L, xq0Var, zv0Var, 0L, null, 0L, 0, false, 0, 0, gh3Var, nv0Var, 1572912, 0, 130876);
            mg3.b(oz2.M(2131624588, nv0Var), new jc1(1.0f, true), 0L, 0L, xq0Var, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(r93Var)).o, nv0Var, 1572864, 0, 131004);
            mg3.b(oz2.M(2131624590, nv0Var), j43.o(yp1Var, 52.0f), 0L, 0L, xq0Var, zv0Var, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(r93Var)).o, nv0Var, 1572912, 0, 130876);
            mg3.b(oz2.M(2131624589, nv0Var), j43.o(yp1Var, 44.0f), 0L, 0L, xq0Var, zv0Var, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(r93Var)).o, nv0Var, 1572912, 0, 130876);
            nv0Var2 = nv0Var;
            nv0Var2.p(true);
        } else {
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: vh2
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iY = jo3.y(i4 | 1);
                    s51.g(i2, i3, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void h(final n72 n72Var, final int i2, final boolean z2, final ns0 ns0Var, final ns0 ns0Var2, nv0 nv0Var, final int i3) {
        int i4;
        Object obj;
        long j2;
        yp1 yp1Var;
        long j3;
        long j4;
        nv0 nv0Var2 = nv0Var;
        nv0Var2.b0(198513104);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? nv0Var2.f(n72Var) : nv0Var2.h(n72Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 384) == 0) {
            i4 |= nv0Var2.g(z2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            obj = ns0Var;
            i4 |= nv0Var2.h(obj) ? 2048 : 1024;
        } else {
            obj = ns0Var;
        }
        if ((i3 & 24576) == 0) {
            i4 |= nv0Var2.h(ns0Var2) ? 16384 : 8192;
        }
        if (nv0Var2.R(i4 & 1, (i4 & 9347) != 9346)) {
            Object objO = nv0Var2.O();
            zj zjVar = c20.a;
            if (objO == zjVar) {
                objO = new a42(-1);
                nv0Var2.j0(objO);
            }
            a42 a42Var = (a42) objO;
            Object objO2 = nv0Var2.O();
            if (objO2 == zjVar) {
                objO2 = new b42(0L);
                nv0Var2.j0(objO2);
            }
            b42 b42Var = (b42) objO2;
            if (z2) {
                nv0Var2.a0(1792542656);
                j2 = ((fy) nv0Var2.j(hy.a)).c;
                nv0Var2.p(false);
            } else {
                nv0Var2.a0(1792543547);
                nv0Var2.p(false);
                j2 = wx.f;
            }
            yp1 yp1Var2 = yp1.a;
            bq1 bq1VarV = gv3.v(j43.c(yp1Var2, 1.0f), j2, cl3.q0);
            boolean z3 = ((i4 & 7168) == 2048) | ((i4 & 14) == 4 || ((i4 & 8) != 0 && nv0Var2.h(n72Var))) | ((57344 & i4) == 16384);
            Object objO3 = nv0Var2.O();
            if (z3 || objO3 == zjVar) {
                yp1Var = yp1Var2;
                qa qaVar = new qa(n72Var, ns0Var2, obj, a42Var, b42Var, 1);
                nv0Var2.j0(qaVar);
                objO3 = qaVar;
            } else {
                yp1Var = yp1Var2;
            }
            bq1 bq1VarK = f80.K(rn.y(bq1VarV, false, null, (cs0) objO3, 15), 8.0f, 8.0f);
            dp2 dp2VarA = cp2.a(n92.b, f5.q, nv0Var2, 48);
            int iHashCode = Long.hashCode(nv0Var2.T);
            n52 n52VarL = nv0Var2.l();
            bq1 bq1VarM = lr.M(nv0Var2, bq1VarK);
            w10.c.getClass();
            nv0Var2.d0();
            if (nv0Var2.S) {
                nv0Var2.k(tb1.Y);
            } else {
                nv0Var2.m0();
            }
            y02.F(f5.E, nv0Var2, dp2VarA);
            y02.F(f5.D, nv0Var2, n52VarL);
            y02.F(f5.F, nv0Var2, Integer.valueOf(iHashCode));
            y02.C(nv0Var2);
            y02.F(f5.C, nv0Var2, bq1VarM);
            int i5 = n72Var.a;
            int i6 = n72Var.d;
            boolean z4 = n72Var.e;
            String strValueOf = String.valueOf(i5);
            gh3 gh3Var = gq.H(nv0Var2).l;
            bq1 bq1VarO = j43.o(yp1Var, 36.0f);
            if (z4) {
                nv0Var2.a0(1155418611);
                j3 = gq.B(nv0Var2).a;
                nv0Var2.p(false);
            } else {
                nv0Var2.a0(1155420245);
                j3 = gq.B(nv0Var2).q;
                nv0Var2.p(false);
            }
            zv0 zv0Var = zb3.c;
            long j5 = j3;
            yp1 yp1Var3 = yp1Var;
            mg3.b(strValueOf, bq1VarO, j5, 0L, null, zv0Var, 0L, null, 0L, 0, false, 0, 0, gh3Var, nv0Var2, 48, 0, 130936);
            mg3.b(n72Var.b, new jc1(1.0f, true), 0L, 0L, z4 ? xq0.k : xq0.h, null, 0L, null, 0L, 2, false, 1, 0, gq.H(nv0Var).l, nv0Var, 0, 24960, 110524);
            mg3.b(String.valueOf(n72Var.c), j43.o(yp1Var3, 52.0f), 0L, 0L, null, zv0Var, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var).l, nv0Var, 48, 0, 130940);
            String strValueOf2 = String.valueOf(i6);
            gh3 gh3Var2 = gq.H(nv0Var).l;
            bq1 bq1VarO2 = j43.o(yp1Var3, 44.0f);
            if (i6 < 100) {
                nv0Var.a0(1155447347);
                j4 = gq.B(nv0Var).a;
                nv0Var.p(false);
            } else if (i6 < 200) {
                nv0Var.a0(1155449620);
                j4 = gq.B(nv0Var).j;
                nv0Var.p(false);
            } else {
                nv0Var.a0(1155451505);
                j4 = gq.B(nv0Var).w;
                nv0Var.p(false);
            }
            mg3.b(strValueOf2, bq1VarO2, j4, 0L, null, zv0Var, 0L, null, 0L, 0, false, 0, 0, gh3Var2, nv0Var, 48, 0, 130936);
            nv0Var2 = nv0Var;
            nv0Var2.p(true);
        } else {
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: wh2
                @Override // defpackage.rs0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    s51.h(n72Var, i2, z2, ns0Var, ns0Var2, (nv0) obj2, jo3.y(i3 | 1));
                    return dm3.a;
                }
            };
        }
    }

    public static final void i(final List list, final int i2, final int i3, final ns0 ns0Var, bq1 bq1Var, nv0 nv0Var, final int i4) {
        List list2;
        int i5;
        ns0 ns0Var2;
        final bq1 bq1Var2;
        xj2 xj2VarT;
        rs0 rs0Var;
        z00 z00Var = f5.C;
        z00 z00Var2 = f5.F;
        z00 z00Var3 = f5.D;
        z00 z00Var4 = f5.E;
        list.getClass();
        ns0Var.getClass();
        nv0Var.b0(2121641676);
        int i6 = i4 | (nv0Var.f(list) ? 4 : 2) | (nv0Var.d(i3) ? 256 : 128) | (nv0Var.h(ns0Var) ? 2048 : 1024) | 24576;
        if (nv0Var.R(i6 & 1, (i6 & 9347) != 9346)) {
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (objO == zjVar) {
                objO = new a42(-1);
                nv0Var.j0(objO);
            }
            a42 a42Var = (a42) objO;
            boolean zIsEmpty = list.isEmpty();
            x91 x91Var = tb1.Y;
            final yp1 yp1Var = yp1.a;
            if (zIsEmpty) {
                nv0Var.a0(1088715605);
                gm0 gm0Var = j43.c;
                cn1 cn1VarD = eo.d(f5.k, false);
                int iHashCode = Long.hashCode(nv0Var.T);
                n52 n52VarL = nv0Var.l();
                bq1 bq1VarM = lr.M(nv0Var, gm0Var);
                w10.c.getClass();
                nv0Var.d0();
                if (nv0Var.S) {
                    nv0Var.k(x91Var);
                } else {
                    nv0Var.m0();
                }
                y02.F(z00Var4, nv0Var, cn1VarD);
                y02.F(z00Var3, nv0Var, n52VarL);
                y02.F(z00Var2, nv0Var, Integer.valueOf(iHashCode));
                y02.C(nv0Var);
                y02.F(z00Var, nv0Var, bq1VarM);
                mg3.b(oz2.M(2131624592, nv0Var), null, ((fy) nv0Var.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(ql3.a)).k, nv0Var, 0, 0, 131066);
                nv0Var.p(true);
                nv0Var.p(false);
                xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    final int i7 = 0;
                    rs0Var = new rs0(list, i2, i3, ns0Var, yp1Var, i4, i7) { // from class: uh2
                        public final /* synthetic */ int f;
                        public final /* synthetic */ List g;
                        public final /* synthetic */ int h;
                        public final /* synthetic */ int i;
                        public final /* synthetic */ ns0 j;
                        public final /* synthetic */ bq1 k;

                        {
                            this.f = i7;
                        }

                        @Override // defpackage.rs0
                        public final Object f(Object obj, Object obj2) {
                            int i8 = this.f;
                            dm3 dm3Var = dm3.a;
                            switch (i8) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iY = jo3.y(1);
                                    s51.i(this.g, this.h, this.i, this.j, this.k, (nv0) obj, iY);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iY2 = jo3.y(1);
                                    s51.i(this.g, this.h, this.i, this.j, this.k, (nv0) obj, iY2);
                                    break;
                            }
                            return dm3Var;
                        }
                    };
                    xj2VarT.d = rs0Var;
                }
                return;
            }
            list2 = list;
            i5 = i3;
            nv0Var.a0(1089085590);
            nv0Var.p(false);
            gm0 gm0Var2 = j43.c;
            qy qyVarA = oy.a(n92.d, f5.s, nv0Var, 0);
            int iHashCode2 = Long.hashCode(nv0Var.T);
            n52 n52VarL2 = nv0Var.l();
            bq1 bq1VarM2 = lr.M(nv0Var, gm0Var2);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            y02.F(z00Var4, nv0Var, qyVarA);
            y02.F(z00Var3, nv0Var, n52VarL2);
            y02.F(z00Var2, nv0Var, Integer.valueOf(iHashCode2));
            y02.C(nv0Var);
            y02.F(z00Var, nv0Var, bq1VarM2);
            g(list2.size(), i5, nv0Var, (i6 >> 3) & 112);
            ns0Var2 = ns0Var;
            gq.g(null, 0.0f, 0L, nv0Var, 0, 7);
            boolean z2 = ((i6 & 14) == 4) | ((i6 & 7168) == 2048);
            Object objO2 = nv0Var.O();
            if (z2 || objO2 == zjVar) {
                objO2 = new v1(list2, ns0Var2, a42Var, 21);
                nv0Var.j0(objO2);
            }
            lr.g(6, 510, null, null, null, null, (ns0) objO2, nv0Var, null, gm0Var2, null, false);
            nv0Var.p(true);
            bq1Var2 = yp1Var;
        } else {
            list2 = list;
            i5 = i3;
            ns0Var2 = ns0Var;
            nv0Var.U();
            bq1Var2 = bq1Var;
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            final int i8 = 1;
            final List list3 = list2;
            final ns0 ns0Var3 = ns0Var2;
            final int i9 = i5;
            rs0Var = new rs0(list3, i2, i9, ns0Var3, bq1Var2, i4, i8) { // from class: uh2
                public final /* synthetic */ int f;
                public final /* synthetic */ List g;
                public final /* synthetic */ int h;
                public final /* synthetic */ int i;
                public final /* synthetic */ ns0 j;
                public final /* synthetic */ bq1 k;

                {
                    this.f = i8;
                }

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    int i82 = this.f;
                    dm3 dm3Var = dm3.a;
                    switch (i82) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iY = jo3.y(1);
                            s51.i(this.g, this.h, this.i, this.j, this.k, (nv0) obj, iY);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iY2 = jo3.y(1);
                            s51.i(this.g, this.h, this.i, this.j, this.k, (nv0) obj, iY2);
                            break;
                    }
                    return dm3Var;
                }
            };
            xj2VarT.d = rs0Var;
        }
    }

    public static final ArrayList j(List list, cs0 cs0Var) {
        j01 j01Var;
        if (!((Boolean) cs0Var.a()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            xm1 xm1Var = (xm1) list.get(i3);
            Object objE = xm1Var.E();
            objE.getClass();
            pc2 pc2Var = ((zg3) objE).a;
            tg3 tg3Var = (tg3) pc2Var.f;
            ze zeVar = (ze) pc2Var.g;
            pg3 pg3Var = (pg3) tg3Var.a.getValue();
            if (pg3Var == null) {
                j01Var = new j01(0, 0, new f62(20));
            } else {
                ze zeVarC = tg3.c(zeVar, pg3Var);
                if (zeVarC == null) {
                    j01Var = new j01(0, 0, new f62(21));
                } else {
                    m41 m41VarL = br.L(pg3Var.i(zeVarC.b, zeVarC.c).d());
                    j01Var = new j01(m41VarL.d(), m41VarL.b(), new sg3(i2, m41VarL));
                }
            }
            int i4 = j01Var.f;
            int i5 = j01Var.g;
            arrayList.add(new r32(xm1Var.t(lq.y(i4, i4, i5, i5)), (cs0) j01Var.h));
        }
        return arrayList;
    }

    public static final void k(List list, int i2, int i3) {
        int iU = u(i2, list);
        if (iU < 0) {
            iU = -(iU + 1);
        }
        while (iU < list.size() && ((b61) list.get(iU)).b < i3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.cs0 r4, defpackage.rs0 r5, defpackage.q40 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.s5
            if (r0 == 0) goto L13
            r0 = r6
            s5 r0 = (defpackage.s5) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            s5 r0 = new s5
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.i
            int r1 = r0.j
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r6)     // Catch: defpackage.p5 -> L40
            goto L40
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r6)
            l r6 = new l     // Catch: defpackage.p5 -> L40
            r1 = 2
            r6.<init>(r4, r5, r2, r1)     // Catch: defpackage.p5 -> L40
            r0.j = r3     // Catch: defpackage.p5 -> L40
            java.lang.Object r4 = defpackage.ur.w(r6, r0)     // Catch: defpackage.p5 -> L40
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L40
            return r5
        L40:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s51.l(cs0, rs0, q40):java.lang.Object");
    }

    public static boolean m(float f2, Float f3) {
        return f3 != null && f2 == f3.floatValue();
    }

    public static boolean n(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final Bitmap o(g9 g9Var) {
        if (g9Var instanceof g9) {
            return g9Var.a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final bq1 p(bq1 bq1Var, so soVar) {
        return bq1Var.d(new qo(soVar));
    }

    public static final void q(i53 i53Var, ArrayList arrayList, int i2) {
        boolean zL = i53Var.l(i2);
        int[] iArr = i53Var.b;
        if (zL) {
            arrayList.add(i53Var.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            q(i53Var, arrayList, i4);
        }
    }

    public static int r(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int s(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static final bq1 t(bq1 bq1Var, d6 d6Var, rs0 rs0Var) {
        return bq1Var.d(new we0(d6Var, rs0Var));
    }

    public static final int u(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iR = r(((b61) list.get(i4)).b, i2);
            if (iR < 0) {
                i3 = i4 + 1;
            } else {
                if (iR <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final w01 v() {
        w01 w01Var = R;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(20.0f, 11.0f);
        tx0Var.f(7.83f);
        tx0Var.i(5.59f, -5.59f);
        tx0Var.h(12.0f, 4.0f);
        tx0Var.i(-8.0f, 8.0f);
        tx0Var.i(8.0f, 8.0f);
        tx0Var.i(1.41f, -1.41f);
        tx0Var.h(7.83f, 13.0f);
        tx0Var.f(20.0f);
        tx0Var.o(-2.0f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        R = w01VarB;
        return w01VarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long w(int r32, int r33, java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s51.w(int, int, java.lang.String):long");
    }

    public static void x(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static final cj1 y(int i2, int i3, nv0 nv0Var) {
        int i4 = 0;
        int i5 = 1;
        boolean z2 = (i3 & 4) != 0;
        Object systemService = ((Context) nv0Var.j(x7.b)).getSystemService("accessibility");
        systemService.getClass();
        Object obj = (AccessibilityManager) systemService;
        boolean z3 = ((((i2 & 896) ^ 384) > 256 && nv0Var.g(z2)) || (i2 & 384) == 256) | ((((i2 & 14) ^ 6) > 4 && nv0Var.g(true)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && nv0Var.g(true)) || (i2 & 48) == 32);
        Object objO = nv0Var.O();
        Object obj2 = c20.a;
        if (z3 || objO == obj2) {
            objO = new cj1(true, true, z2);
            nv0Var.j0(objO);
        }
        cj1 cj1Var = (cj1) objO;
        of1 of1Var = (of1) nv0Var.j(ij1.a);
        boolean zF = nv0Var.f(cj1Var) | nv0Var.h(obj);
        Object objO2 = nv0Var.O();
        if (zF || objO2 == obj2) {
            objO2 = new i(i5, cj1Var, obj);
            nv0Var.j0(objO2);
        }
        ns0 ns0Var = (ns0) objO2;
        boolean zF2 = nv0Var.f(cj1Var) | nv0Var.h(obj);
        Object objO3 = nv0Var.O();
        if (zF2 || objO3 == obj2) {
            objO3 = new u1(i4, cj1Var, obj);
            nv0Var.j0(objO3);
        }
        f(of1Var, ns0Var, (cs0) objO3, nv0Var, 0);
        return cj1Var;
    }

    public static final void z(m53 m53Var, int i2, Object obj) {
        int iH = m53Var.h(i2);
        Object[] objArr = m53Var.c;
        Object obj2 = objArr[iH];
        objArr[iH] = c20.a;
        if (obj == obj2) {
            return;
        }
        e20.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ")");
    }
}
