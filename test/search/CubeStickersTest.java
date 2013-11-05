package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class CubeStickersTest {
    CubeStickers cubestickers = new CubeStickers();

    @Test
    public void case1() {
        String[] sticker = { "cyan", "magenta", "yellow", "purple", "black", "white", "purple" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case2() {
        String[] sticker = { "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case3() {
        String[] sticker = { "red", "yellow", "blue", "red", "yellow", "blue", "red", "yellow", "blue" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case4() {
        String[] sticker = { "purple", "orange", "orange", "purple", "black", "orange", "purple" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case5() {
        String[] sticker = { "white", "gray", "green", "blue", "yellow", "red", "target", "admin" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case6() {
        String[] sticker = { "m", "o", "f", "m", "o", "f" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case7() {
        String[] sticker = { "ragf", "znvbkdd", "kojr", "jeoyqvssf", "yrwhfijb", "xzlcgaeye" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case8() {
        String[] sticker = { "unvo", "jfoikgw", "cbbhngfh", "vknk", "zwvsyjnis", "hxwxa", "gdg", "xygqdvo", "kleyavdiid", "ztdzqmv", "dcnqluzi", "nlhbbkwcrl", "fzzw", "gocxri", "gez", "vodqkiif" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case9() {
        String[] sticker = { "ycxykb", "shwfwota", "wxqqgwumqc", "okyyztccqs", "okwecct", "lklzmxay", "bnn", "hmxj", "bfxfa", "vzrwki", "gdatkqibc", "aia", "ucppiytn", "tyaesg", "uuu", "oyvaie", "qzu", "qiyqowkw", "tdrsud", "chzbcplie", "fdrvpzgh", "aggbvnbi", "qooqhlbrl", "olmyk", "bvrsjrj", "nxcmdiq" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case10() {
        String[] sticker = { "vyeifnv", "nbgrsl", "ozkc", "knu", "koih", "wuthqxjdcd", "ybftjdqr", "hgce", "turk", "ktgpi", "ugkhjae", "qlhrgsay", "vbb", "qmbjoyuyjb", "infgqk", "cnex", "wvwncciv", "tucmo", "lfpiou", "abmhzbeocs", "ryl", "rcaq", "qiyfajteco", "mfji", "jdmxqwuqg", "hegyfondo", "xbhxq", "ethokpyd", "ymzzlzxf", "ugpwigk", "zqhtyowj", "ckioofv", "hjwxts", "nmkffpfenj", "pkxcllak", "gxwtzmdmt" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case11() {
        String[] sticker = { "zycaak", "sdtiaodswy", "baiqwwyv", "tcazrc", "uie", "fssasd", "czg", "pay", "tkbbdsde", "djsqs", "exw", "pqqqseby", "abjncmcf", "hkbaszah", "dojbvc", "ofhgdixrpu", "jahvsue", "amqv", "xvfxbjbxim", "wfktkfjef", "xbcm", "onnilkx", "vxiziw", "wnsj", "vil", "eainxinp", "fehmb", "rzteicnu", "vxhjsyt", "hoarz", "vieig", "vvnvqawii", "zjivwvol", "dzwobpbhqm", "uujhbpq", "jml", "lvfd", "ojhha", "vovbweni", "owuzgjppa", "dbrvkum", "zxoloe", "cfkjyulyk", "beziz", "ifsx", "yig", "kdxdd", "jiyq", "cgjcnzmuu", "qxcmreswwu" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case12() {
        String[] sticker = { "eaglkte", "eaglkte", "osx", "rgftwyyg", "jqvzp", "hrkzwnl", "rukqdagoea" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case13() {
        String[] sticker = { "szxees", "szxees", "szxees", "szxees", "szxees", "ira", "szxees", "szxees", "hoip", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "ezdomah", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "ilcwiiog", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "szxees", "uvbitlu", "szxees" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case14() {
        String[] sticker = { "uvr", "behqtnoeeh", "nxosnl", "uvr", "earhhediok", "bsnqebfu", "behqtnoeeh", "vexwd" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case15() {
        String[] sticker = { "toc", "gvh", "rljg", "gvh", "vzvjtxgjs", "yjyraiox", "poizzh", "tbu", "zpaqmihiyp", "jwtrlgi", "toc", "prhchj", "xtet", "bnkmbu", "htlvo", "zpaqmihiyp", "jwtrlgi", "yjyraiox", "jxvcdjb", "htlvo", "rljg", "prhchj", "poizzh", "xtet" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case16() {
        String[] sticker = { "nxovc", "ttani", "gvelxxyy", "sbjlrugt", "rxacprkro", "xqrqj", "paxyxszabt", "celgxvmed", "ttani", "rvnmxv", "zswledsila", "zswledsila", "iuufrwbir", "rjk", "rjk", "hccyd", "fvmfrkka", "hccyd", "xoflxz", "xoflxz", "qkocsqi", "gqkjj", "rvnmxv", "jfg", "wwdvbpf", "gvelxxyy", "vfiqzznewk", "qyx", "tsivo", "taq", "fvmfrkka", "wwdvbpf", "sbjlrugt", "tsivo", "qkocsqi", "rxacprkro", "mmli", "taq", "ilyk", "gvkpji", "zgmfgr", "ilyk", "gqkjj", "nxovc", "paxyxszabt", "zgmfgr", "qyx", "xqrqj", "iuufrwbir", "celgxvmed" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case17() {
        String[] sticker = { "auoxoaapap", "dpqiybjj", "dpqiybjj", "pyfivhreo", "dpqiybjj", "xhbbhwmlkh", "qwfgtux" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case18() {
        String[] sticker = { "ajmnz", "wyelp", "ajmnz", "hwqdfybfp", "vguigg", "ajmnz", "hvb", "ajmnz", "hwqdfybfp", "hwqdfybfp", "ajmnz", "etwlvvslvd", "hwqdfybfp", "ajmnz", "hwqdfybfp" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case19() {
        String[] sticker = { "qjc", "epu", "pgxpna", "wvbaduvi", "qjc", "wvbaduvi", "lprigh", "inmtnvmx", "pmujd", "wvbaduvi", "lprigh", "wvbaduvi", "lprigh", "lprigh", "lprigh", "wvbaduvi", "wvbaduvi", "wvbaduvi", "lprigh", "qjc", "lprigh", "qjc", "qjc" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case20() {
        String[] sticker = { "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "ujgwomo", "lmz", "lmz", "lmz", "lmz", "xrk", "lmz", "edsvlupg", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "hxu", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz", "lmz" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case21() {
        String[] sticker = { "pzolpl", "ptwjaimu", "hwzvopbsq", "pzolpl", "hwzvopbsq", "occ", "aaoyia" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case22() {
        String[] sticker = { "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "okoutrorlm", "qmg", "qmg", "qmg", "qmg", "qmg", "ufrvrkhil", "rqvov", "okoutrorlm", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "khfhspbqmr", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg", "qmg" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case23() {
        String[] sticker = { "mnjyaju", "tmxkpxdkv", "hlfbef", "cbecgrto", "hlfbef", "tmxkpxdkv", "lqjx", "cbecgrto" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case24() {
        String[] sticker = { "tvspacfqif", "jlyxqpnj", "krgdc", "vefynlsahf", "vefynlsahf", "tvspacfqif", "jlyxqpnj", "krgdc", "vucswtu", "lhsqwij", "yvdcmur", "yxadsv", "llvku", "vucswtu", "jhpfssjvm", "jhpfssjvm", "bggb", "yxadsv", "yvdcmur", "lhsqwij" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case25() {
        String[] sticker = { "yeidcfr", "rxgzjpsx", "zggxcnr", "yeidcfr", "lnytz", "bsgtdr", "xjr", "qib", "ltixjpjga", "zggxcnr", "gtafo", "jkpu", "xjr", "jkpu", "gtafo", "lnytz", "ado", "mpl", "lrghs", "ekgtwf", "mpl", "ado", "qib", "ltixjpjga", "jnfokpxti", "vghlkxzeei", "jnfokpxti", "lrghs", "rxgzjpsx", "bsgtdr", "wmmpst", "vghlkxzeei" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case26() {
        String[] sticker = { "kszojpmw", "vfrhizgtf", "vfrhizgtf", "kszojpmw", "kszojpmw", "vfrhizgtf", "kszojpmw", "kszojpmw", "vfrhizgtf", "kszojpmw", "vfrhizgtf", "vfrhizgtf", "kszojpmw", "kszojpmw", "vfrhizgtf", "vfrhizgtf", "kszojpmw", "vfrhizgtf", "kszojpmw", "kszojpmw", "kszojpmw", "vfrhizgtf", "kszojpmw", "kszojpmw", "vfrhizgtf", "kszojpmw", "vfrhizgtf", "kszojpmw", "kszojpmw", "kszojpmw", "kszojpmw", "vfrhizgtf", "vfrhizgtf", "kszojpmw", "hmcg", "vfrhizgtf", "vfrhizgtf", "vfrhizgtf", "vfrhizgtf", "vfrhizgtf", "kszojpmw", "vfrhizgtf", "dirn", "kszojpmw", "kszojpmw", "kszojpmw", "kszojpmw", "vfrhizgtf", "vfrhizgtf", "vfrhizgtf" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case27() {
        String[] sticker = { "lfupmrg", "keivcbazs", "lfupmrg", "keivcbazs", "lfupmrg", "lfupmrg", "lfupmrg", "keivcbazs", "ynvq", "lfupmrg", "keivcbazs", "keivcbazs", "lfupmrg", "lfupmrg", "lfupmrg", "keivcbazs", "keivcbazs", "lfupmrg", "keivcbazs", "viyq", "keivcbazs", "lfupmrg", "keivcbazs", "lfupmrg", "keivcbazs", "lfupmrg", "keivcbazs", "lfupmrg", "lfupmrg", "lfupmrg", "lfupmrg", "lfupmrg", "keivcbazs", "lfupmrg", "lfupmrg", "keivcbazs", "lfupmrg", "keivcbazs", "keivcbazs", "keivcbazs", "lfupmrg", "keivcbazs", "lfupmrg", "keivcbazs", "keivcbazs", "lfupmrg", "lfupmrg", "lfupmrg", "lfupmrg", "keivcbazs" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case28() {
        String[] sticker = { "kthqzqais", "dyfgsg", "kthqzqais", "dyfgsg", "dyfgsg", "kthqzqais", "kthqzqais", "kthqzqais", "kthqzqais", "dyfgsg", "kthqzqais", "dyfgsg", "kthqzqais", "luicvp", "dyfgsg", "kthqzqais", "luicvp", "kthqzqais", "kthqzqais", "dyfgsg", "kthqzqais", "dyfgsg", "kthqzqais", "dyfgsg", "kthqzqais", "dyfgsg", "dyfgsg", "kthqzqais", "kthqzqais", "dyfgsg", "kthqzqais", "dyfgsg", "rqxp", "dyfgsg", "kthqzqais", "kthqzqais", "dyfgsg", "kthqzqais", "kthqzqais", "kthqzqais", "kthqzqais", "kthqzqais", "kthqzqais", "kthqzqais", "dyfgsg", "kthqzqais", "dyfgsg", "kthqzqais", "dyfgsg", "kthqzqais" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case29() {
        String[] sticker = { "qubfmky", "jbtjcdmg", "fvqscdqii", "oyrjdds", "swofpmmc", "qubfmky", "gizyebzhjj", "tnvpacttd", "xowgsygz", "iiuavviwyl", "gizyebzhjj", "cwfed", "vmshcofgu", "bzgyjzrhk", "swofpmmc", "cmfsmaopwq", "oyrjdds", "cdel", "xejfx", "ogqs", "csgohgjr", "cstvpguef", "gcugzvlcuk", "gcugzvlcuk", "ync", "ilqpyvzpv", "sbkxkn", "ics", "ics", "sbkxkn", "xejfx", "ync", "csgohgjr", "iiuavviwyl", "vmshcofgu", "ogqs", "xowgsygz", "bzgyjzrhk", "fvqscdqii", "xvgua", "tnvpacttd", "cwfed", "cdel", "cmfsmaopwq", "jbtjcdmg", "ixcfby", "xvgua", "ixcfby", "ilqpyvzpv", "cstvpguef" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case30() {
        String[] sticker = { "kufaniokp", "kufaniokp", "kufaniokp", "lsjiy", "lsjiy", "lsjiy", "kufaniokp", "kufaniokp", "lsjiy", "lsjiy", "lsjiy", "lsjiy", "kufaniokp", "lsjiy", "lsjiy", "lsjiy", "kufaniokp", "lsjiy", "lsjiy", "kufaniokp", "lsjiy", "lsjiy", "kufaniokp", "lsjiy", "kufaniokp", "kufaniokp", "lsjiy", "lsjiy", "kufaniokp", "kufaniokp", "lsjiy", "kufaniokp", "kufaniokp", "lsjiy", "lsjiy", "lsjiy", "lsjiy", "lsjiy", "lsjiy", "lsjiy", "lsjiy", "kufaniokp", "kufaniokp", "kufaniokp", "lsjiy", "kufaniokp", "lsjiy", "lsjiy", "lsjiy", "lsjiy" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case31() {
        String[] sticker = { "bzl", "bzl", "bzl", "bzl", "bzl", "tva", "bzl", "bzl", "bzl", "tva", "bzl", "bzl", "bzl", "bzl", "tva", "bzl", "tva", "bzl", "bzl", "tva", "tva", "bzl", "bzl", "tva", "tva", "tva", "bzl", "bzl", "bzl", "bzl", "bzl", "tva", "tva", "bzl", "bzl", "bzl", "tva", "bzl", "bzl", "tva", "tva", "tva", "bzl", "bzl", "tva", "bzl", "tva", "tva", "bzl", "tva" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case32() {
        String[] sticker = { "mmrwxrsd", "mmrwxrsd", "mmrwxrsd", "mmrwxrsd", "mmrwxrsd", "qnnjijitas", "mmrwxrsd", "mmrwxrsd", "qnnjijitas", "mmrwxrsd", "mmrwxrsd", "mmrwxrsd", "mmrwxrsd", "qnnjijitas", "mmrwxrsd", "mmrwxrsd", "mmrwxrsd", "mmrwxrsd", "mmrwxrsd", "mmrwxrsd", "qnnjijitas", "qnnjijitas", "mmrwxrsd", "mmrwxrsd", "mmrwxrsd", "mmrwxrsd", "mmrwxrsd", "qnnjijitas", "mmrwxrsd", "mmrwxrsd", "qnnjijitas", "qnnjijitas", "qnnjijitas", "mmrwxrsd", "qnnjijitas", "mmrwxrsd", "qnnjijitas", "qnnjijitas", "qnnjijitas", "qnnjijitas", "qnnjijitas", "qnnjijitas", "qnnjijitas", "mmrwxrsd", "mmrwxrsd", "qnnjijitas", "mmrwxrsd", "qnnjijitas", "qnnjijitas", "qnnjijitas" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case33() {
        String[] sticker = { "lvbpl", "vosicodm", "lvbpl", "vosicodm", "vosicodm", "lvbpl", "lvbpl", "lvbpl", "lvbpl", "vosicodm", "vosicodm", "lvbpl", "lvbpl", "lvbpl", "lvbpl", "lvbpl", "vosicodm", "lvbpl", "lvbpl", "lvbpl", "lvbpl", "vosicodm", "vosicodm", "lvbpl", "vosicodm", "vosicodm", "vosicodm", "vosicodm", "vosicodm", "vosicodm", "vosicodm", "vosicodm", "vosicodm", "vosicodm", "vosicodm", "vosicodm", "lvbpl", "vosicodm", "vosicodm", "vosicodm", "vosicodm", "vosicodm", "lvbpl", "lvbpl", "vosicodm", "lvbpl", "lvbpl", "lvbpl", "lvbpl", "vosicodm" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case34() {
        String[] sticker = { "ypdviherlr", "azwltuif", "ypdviherlr", "qqvktedvvc", "ypdviherlr", "jyrwtayla" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case35() {
        String[] sticker = { "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "lylrrbny", "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "djpkko", "xiyhg", "hgigaipi" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case36() {
        String[] sticker = { "deeijcuso", "zzb", "deeijcuso", "deeijcuso", "okbqiloy", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "svtoeb", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso", "deeijcuso" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case37() {
        String[] sticker = { "vitkdxwdq", "lhazphrey", "afpsga", "afpsga", "afpsga", "afpsga" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case38() {
        String[] sticker = { "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "fospppvgf", "jogroayjmr", "jogroayjmr", "jogroayjmr", "agkott", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr", "jogroayjmr" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case39() {
        String[] sticker = { "ajjiybgzm", "ishj", "ajjiybgzm", "ajjiybgzm", "ajjiybgzm", "ajjiybgzm" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case40() {
        String[] sticker = { "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "ytmrnhikb", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu", "mkubmu" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case41() {
        String[] sticker = { "qbnka", "gjg", "qbnka", "ject", "gjg", "qbnka", "qbnka" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case42() {
        String[] sticker = { "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "vte", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "izalfds", "pbhijyph", "vte", "izalfds" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case43() {
        String[] sticker = { "vdphg", "tad", "tad", "vdphg", "tad", "tad" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case44() {
        String[] sticker = { "ciityv", "ciityv", "ciityv", "ciityv", "ciityv", "ciityv", "ciityv", "ciityv", "ciityv", "ciityv", "ciityv", "ciityv", "ciityv", "ciityv", "ciityv", "ciityv", "ciityv", "ciityv", "ciityv", "lvxjljh", "ciityv", "ciityv", "lvxjljh", "ciityv", "ciityv", "ciityv", "ciityv", "ciityv" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case45() {
        String[] sticker = { "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "iwwfoxljz", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "smxxdjezqn", "iwwfoxljz", "smxxdjezqn" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case46() {
        String[] sticker = { "elujvjv", "vnx", "vnx", "elujvjv", "elujvjv", "elujvjv", "elujvjv", "vnx" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case47() {
        String[] sticker = { "rnmpth", "hyeruqwi", "rnmpth", "rnmpth", "hyeruqwi", "hyeruqwi", "rnmpth", "rnmpth", "rnmpth", "hyeruqwi", "hyeruqwi", "rnmpth", "rnmpth", "rnmpth", "hyeruqwi", "hyeruqwi", "rnmpth", "hyeruqwi", "hyeruqwi", "rnmpth", "hyeruqwi", "hyeruqwi", "hyeruqwi", "rnmpth", "rnmpth", "hyeruqwi", "rnmpth", "hyeruqwi", "hyeruqwi" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case48() {
        String[] sticker = { "ovkxphu", "uzo", "ovkxphu", "uzo", "ovkxphu", "uzo", "uzo", "uzo", "uzo", "ovkxphu", "ovkxphu", "ovkxphu", "uzo", "uzo", "ovkxphu", "uzo", "uzo", "uzo", "ovkxphu", "uzo", "ovkxphu", "ovkxphu", "ovkxphu", "ovkxphu", "uzo", "uzo", "uzo", "ovkxphu", "ovkxphu", "uzo", "uzo", "ovkxphu", "ovkxphu", "ovkxphu", "uzo", "ovkxphu", "uzo", "uzo", "ovkxphu", "ovkxphu", "uzo", "uzo", "ovkxphu", "uzo", "uzo", "uzo", "uzo", "ovkxphu", "ovkxphu", "ovkxphu" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case49() {
        String[] sticker = { "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta", "iyfwwgdtta" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case50() {
        String[] sticker = { "rqqzsjshqb", "rqqzsjshqb", "rqqzsjshqa", "rqqzsjshqa", "rqqzsjshqb", "rqqzsjshqb", "rqqzsjshqa", "rqqzsjshqa", "rqqzsjshqa", "rqqzsjshqa", "rqqzsjshqa", "rqqzsjshqa", "rqqzsjshqb", "rqqzsjshqb", "rqqzsjshqa", "rqqzsjshqb", "rqqzsjshqa", "rqqzsjshqa", "rqqzsjshqb", "rqqzsjshqb", "rqqzsjshqa", "rqqzsjshqb", "rqqzsjshqb", "rqqzsjshqb", "rqqzsjshqb", "rqqzsjshqb", "rqqzsjshqa", "rqqzsjshqa", "rqqzsjshqa", "rqqzsjshqb", "rqqzsjshqa", "rqqzsjshqb", "rqqzsjshqb", "rqqzsjshqa", "rqqzsjshqa", "rqqzsjshqb", "rqqzsjshqa", "rqqzsjshqa", "rqqzsjshqb", "rqqzsjshqb", "rqqzsjshqa", "rqqzsjshqa", "rqqzsjshqb", "rqqzsjshqa", "rqqzsjshqb", "rqqzsjshqb", "rqqzsjshqb", "rqqzsjshqb", "rqqzsjshqa", "rqqzsjshqa" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case51() {
        String[] sticker = { "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdb", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhda", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc", "kapfmrzhdc" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case52() {
        String[] sticker = { "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpa", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpb", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpb", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc", "jdapguwgpc" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case53() {
        String[] sticker = { "rznzkckhpb", "rznzkckhpb", "rznzkckhpb", "rznzkckhpb", "rznzkckhpb", "rznzkckhpb", "rznzkckhpc", "rznzkckhpb", "rznzkckhpc", "rznzkckhpc", "rznzkckhpc", "rznzkckhpb", "rznzkckhpc", "rznzkckhpc", "rznzkckhpc", "rznzkckhpb", "rznzkckhpa", "rznzkckhpc", "rznzkckhpc", "rznzkckhpc", "rznzkckhpb", "rznzkckhpb", "rznzkckhpc", "rznzkckhpb", "rznzkckhpb", "rznzkckhpc", "rznzkckhpb", "rznzkckhpb", "rznzkckhpb", "rznzkckhpb", "rznzkckhpc", "rznzkckhpb", "rznzkckhpc", "rznzkckhpb", "rznzkckhpb", "rznzkckhpc", "rznzkckhpc", "rznzkckhpb", "rznzkckhpc", "rznzkckhpc", "rznzkckhpc", "rznzkckhpb", "rznzkckhpc", "rznzkckhpc", "rznzkckhpb", "rznzkckhpc", "rznzkckhpc", "rznzkckhpc", "rznzkckhpb", "rznzkckhpc" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case54() {
        String[] sticker = { "bbmmultoxb", "bbmmultoxa", "bbmmultoxc", "bbmmultoxb", "bbmmultoxb", "bbmmultoxa", "bbmmultoxc", "bbmmultoxb", "bbmmultoxb", "bbmmultoxa", "bbmmultoxc", "bbmmultoxb", "bbmmultoxc", "bbmmultoxb", "bbmmultoxc", "bbmmultoxc", "bbmmultoxc", "bbmmultoxa", "bbmmultoxc", "bbmmultoxa", "bbmmultoxb", "bbmmultoxc", "bbmmultoxa", "bbmmultoxb", "bbmmultoxa", "bbmmultoxa", "bbmmultoxa", "bbmmultoxb", "bbmmultoxb", "bbmmultoxb", "bbmmultoxc", "bbmmultoxa", "bbmmultoxb", "bbmmultoxb", "bbmmultoxa", "bbmmultoxc", "bbmmultoxc", "bbmmultoxa", "bbmmultoxa", "bbmmultoxc", "bbmmultoxa", "bbmmultoxb", "bbmmultoxb", "bbmmultoxc", "bbmmultoxa", "bbmmultoxb", "bbmmultoxa", "bbmmultoxa", "bbmmultoxc", "bbmmultoxc" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case55() {
        String[] sticker = { "a", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case56() {
        String[] sticker = { "xxxxxxxxxc", "xxxxxxxxxa", "xxxxxxxxxa", "xxxxxxxxxa", "xxxxxxxxxb", "xxxxxxxxxb", "xxxxxxxxxb", "xxxxxxxxxa", "xxxxxxxxxa", "xxxxxxxxxa", "xxxxxxxxxb", "xxxxxxxxxb", "xxxxxxxxxb", "xxxxxxxxxa", "xxxxxxxxxa", "xxxxxxxxxa", "xxxxxxxxxb", "xxxxxxxxxb", "xxxxxxxxxb", "xxxxxxxxxa", "xxxxxxxxxa", "xxxxxxxxxa", "xxxxxxxxxb", "xxxxxxxxxb", "xxxxxxxxxb", "xxxxxxxxxa", "xxxxxxxxxa", "xxxxxxxxxa", "xxxxxxxxxb", "xxxxxxxxxb", "xxxxxxxxxb", "xxxxxxxxxa", "xxxxxxxxxa", "xxxxxxxxxa", "xxxxxxxxxb", "xxxxxxxxxb", "xxxxxxxxxb", "xxxxxxxxxa", "xxxxxxxxxa", "xxxxxxxxxa", "xxxxxxxxxb", "xxxxxxxxxb", "xxxxxxxxxb", "xxxxxxxxxa", "xxxxxxxxxa", "xxxxxxxxxa", "xxxxxxxxxb", "xxxxxxxxxb", "xxxxxxxxxa", "xxxxxxxxxa" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case57() {
        String[] sticker = { "cyan", "magenta", "yellow", "blue", "black", "black", "black", "black", "black", "black", "black", "black", "black", "black", "black", "black", "black", "black" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case58() {
        String[] sticker = { "a", "a", "b", "b", "c", "c" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case59() {
        String[] sticker = { "q", "w", "e", "r", "q", "q" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case60() {
        String[] sticker = { "a", "a", "b", "c", "d", "e" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case61() {
        String[] sticker = { "red", "red", "red", "green", "blue", "yellow", "red" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case62() {
        String[] sticker = { "purple", "orange", "orange", "purple", "black", "orange", "purple" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case63() {
        String[] sticker = { "a", "a", "a", "a", "a", "a", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "aa", "ba", "ca", "da", "ea", "fa", "ga", "ha", "ia", "ja", "ka", "la", "ma", "na", "oa", "pa", "qa", "ra", "sa", "ta", "ua", "va", "wa", "xa" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case64() {
        String[] sticker = { "a", "a", "a", "b", "c", "d" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case65() {
        String[] sticker = { "red", "red", "yellow", "yellow", "blue", "blue" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case66() {
        String[] sticker = { "red", "blue", "red", "red", "red", "blue", "green" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case67() {
        String[] sticker = { "cyan", "magenta", "yellow", "black", "black", "black", "black", "black", "black", "black", "black", "black", "black", "black", "black", "black", "black", "black" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case68() {
        String[] sticker = { "a", "b", "c", "b", "b", "b" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case69() {
        String[] sticker = { "a", "b", "c", "d", "d", "d" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case70() {
        String[] sticker = { "a", "a", "a", "a", "a", "a", "a", "a", "q", "w", "e", "r", "t", "y" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case71() {
        String[] sticker = { "a", "b", "c", "d", "e", "e" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case72() {
        String[] sticker = { "red", "red", "green", "green", "blue", "blue" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case73() {
        String[] sticker = { "a", "a", "a", "a", "b", "c", "d" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case74() {
        String[] sticker = { "blue", "red", "green", "red", "red", "red" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case75() {
        String[] sticker = { "r", "r", "r", "r", "b", "y", "g" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case76() {
        String[] sticker = { "a", "a", "a", "a", "b", "b", "b", "b", "c", "c", "c", "c", "d", "d", "d", "d" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case77() {
        String[] sticker = { "a", "b", "c", "c", "d", "d" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case78() {
        String[] sticker = { "r", "r", "g", "g", "b", "y" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case79() {
        String[] sticker = { "blue", "red", "yellow", "blue", "red", "yellow" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case80() {
        String[] sticker = { "a", "a", "a", "b", "c", "d", "a", "a", "a", "a" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case81() {
        String[] sticker = { "black", "black", "black", "black", "black", "black", "white", "white", "white", "white", "green" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case82() {
        String[] sticker = { "a", "a", "b", "b", "c", "d" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case83() {
        String[] sticker = { "j", "j", "b", "h", "f", "f", "k", "b" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case84() {
        String[] sticker = { "r", "g", "b", "b", "b", "b", "b" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case85() {
        String[] sticker = { "a", "b", "c", "d", "a", "a" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case86() {
        String[] sticker = { "red", "red", "red", "blue", "green", "yellow" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case87() {
        String[] sticker = { "r", "g", "b", "y", "y", "y" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case88() {
        String[] sticker = { "red", "red", "blue", "blue", "green", "yellow" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case89() {
        String[] sticker = { "red", "red", "yellow", "yellow", "blue", "black" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case90() {
        String[] sticker = { "a", "b", "b", "c", "c", "c" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case91() {
        String[] sticker = { "p", "p", "p", "q", "q", "r" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case92() {
        String[] sticker = { "red", "yellow", "blue", "red", "yellow", "blue", "red", "yellow", "blue" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case93() {
        String[] sticker = { "a", "a", "b", "c", "b", "c" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case94() {
        String[] sticker = { "b", "b", "b", "b", "b", "b", "b", "b", "b", "a", "c", "g", "h", "j", "k", "l", "o" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case95() {
        String[] sticker = { "b", "b", "b", "a", "c", "d" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case96() {
        String[] sticker = { "blue", "blue", "blue", "black", "white", "green" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case97() {
        String[] sticker = { "x", "x", "y", "y", "z", "z" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case98() {
        String[] sticker = { "a", "b", "c", "d", "a", "b" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case99() {
        String[] sticker = { "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case100() {
        String[] sticker = { "a", "b", "c", "a", "b", "c" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case101() {
        String[] sticker = { "y", "y", "s", "s", "z", "t" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case102() {
        String[] sticker = { "cyan", "cyan", "cyan", "yellow", "yellow", "red" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case103() {
        String[] sticker = { "red", "green", "green", "green", "yellow", "blue" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case104() {
        String[] sticker = { "r", "r", "r", "r", "r", "r", "r", "r", "r", "r", "r", "r", "r" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case105() {
        String[] sticker = { "green", "green", "white", "white", "black", "black" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case106() {
        String[] sticker = { "red", "red", "green", "green", "blue", "blue", "white" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case107() {
        String[] sticker = { "a", "a", "b", "c", "c", "d" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case108() {
        String[] sticker = { "b", "b", "b", "c", "c", "c", "a", "d", "d" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case109() {
        String[] sticker = { "a", "a", "a", "b", "b", "b", "c", "c", "c", "d", "d", "d" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case110() {
        String[] sticker = { "r", "g", "b", "bl", "bl", "bl" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case111() {
        String[] sticker = { "red", "red", "yellow", "black", "blue", "white" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case112() {
        String[] sticker = { "purple", "yellow", "purple", "orange", "black", "purple" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case113() {
        String[] sticker = { "red", "blue", "yellow", "green", "green", "green" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case114() {
        String[] sticker = { "blue", "blue", "blue", "red", "yellow", "green" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case115() {
        String[] sticker = { "red", "red", "red", "green", "white", "black" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case116() {
        String[] sticker = { "yellow", "red", "green", "blue", "blue", "blue" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case117() {
        String[] sticker = { "a", "b", "c", "d", "d", "d", "d", "d", "d" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case118() {
        String[] sticker = { "a", "a", "a", "b", "c", "d", "a", "a", "a", "a", "b", "c", "d" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case119() {
        String[] sticker = { "red", "orange", "orange", "green", "black", "blue" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case120() {
        String[] sticker = { "red", "red", "red", "black", "blue", "purple" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case121() {
        String[] sticker = { "red", "white", "blue", "yellow", "red", "red" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case122() {
        String[] sticker = { "red", "red", "red", "blue", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "red", "blue", "red", "red", "red", "red", "red", "red", "orange", "red", "red", "red", "red", "red", "red", "red", "red", "red", "orange" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case123() {
        String[] sticker = { "red", "red", "purple", "purple", "green", "white" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case124() {
        String[] sticker = { "red", "red", "blue", "blue", "yellow", "green" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case125() {
        String[] sticker = { "red", "green", "red", "red", "green", "green", "yellow", "blue" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case126() {
        String[] sticker = { "white", "gray", "green", "blue", "yellow", "red", "target", "admin" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case127() {
        String[] sticker = { "a", "b", "c", "d", "e", "f" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case128() {
        String[] sticker = { "b", "b", "c", "c", "d", "a", "a" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case129() {
        String[] sticker = { "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "ellow", "ellow", "ellow", "ellow", "ellow", "ellow", "ellow", "ellow", "ellow", "red" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case130() {
        String[] sticker = { "one", "one", "one", "two", "two", "two", "three", "three", "three", "four" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case131() {
        String[] sticker = { "b", "b", "b", "r", "g", "w" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case132() {
        String[] sticker = { "a", "a", "a", "b", "b", "c" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case133() {
        String[] sticker = { "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case134() {
        String[] sticker = { "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case135() {
        String[] sticker = { "a", "a", "a", "a", "b", "b", "b", "b", "c", "c", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "f", "f", "f", "f" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case136() {
        String[] sticker = { "r", "r", "g", "g", "b", "b" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case137() {
        String[] sticker = { "a", "a", "a", "a", "a", "a", "a", "b", "c", "d" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case138() {
        String[] sticker = { "red", "blue", "green", "yellow", "red", "red", "red" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case139() {
        String[] sticker = { "a", "a", "b", "b", "c", "c", "d", "d", "d", "d", "d", "d" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case140() {
        String[] sticker = { "a", "b", "c", "g", "g", "g" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case141() {
        String[] sticker = { "red", "yellow", "blue", "red", "green", "red" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case142() {
        String[] sticker = { "a", "a", "a", "a", "b", "c" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case143() {
        String[] sticker = { "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case144() {
        String[] sticker = { "yellow", "red", "blue", "purple", "yellow", "yellow" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case145() {
        String[] sticker = { "cyan", "magenta", "yellow", "purple", "yellow", "purple" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case146() {
        String[] sticker = { "blue", "blue", "red", "red", "green", "yellow" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case147() {
        String[] sticker = { "a", "b", "a", "b", "a", "b" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case148() {
        String[] sticker = { "a", "b", "c", "c", "d", "d", "d" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case149() {
        String[] sticker = { "a", "a", "a", "b", "r", "y" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case150() {
        String[] sticker = { "a", "a", "a", "d", "b", "c" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case151() {
        String[] sticker = { "cyan", "cyan", "green", "purple", "red", "blue" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case152() {
        String[] sticker = { "a", "b", "c", "d", "e", "e", "e" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case153() {
        String[] sticker = { "a", "b", "a", "b", "a", "b", "a", "b", "a" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case154() {
        String[] sticker = { "purple", "orange", "orange", "purple", "black", "orange", "purple", "black", "black", "purple", "orange", "black" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case155() {
        String[] sticker = { "w", "b", "b", "y", "y", "y" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case156() {
        String[] sticker = { "red", "yellow", "blue", "green", "black", "purple", "blue", "blue" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case157() {
        String[] sticker = { "red", "yellow", "blue", "red", "yellow", "blue" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case158() {
        String[] sticker = { "pink", "blue", "orange", "orange", "blue", "black", "orange", "white", "orange", "orange", "green" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case159() {
        String[] sticker = { "a", "b", "c", "d", "e", "f", "g", "h" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case160() {
        String[] sticker = { "a", "b", "c", "d", "d", "c" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case161() {
        String[] sticker = { "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case162() {
        String[] sticker = { "white", "white", "green", "blue", "yellow", "yellow" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case163() {
        String[] sticker = { "black", "black", "black", "red", "red", "red" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case164() {
        String[] sticker = { "purple", "orange", "purple", "purple", "black", "red", "purple" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case165() {
        String[] sticker = { "red", "red", "blue", "blue", "yellow", "purple" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case166() {
        String[] sticker = { "orange", "orange", "purple", "black", "orange", "fldjfdlfs" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case167() {
        String[] sticker = { "d", "b", "a", "a", "c", "c" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case168() {
        String[] sticker = { "red", "red", "blue", "red", "yellow", "black" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case169() {
        String[] sticker = { "red", "blue", "yellow", "green", "red", "red" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case170() {
        String[] sticker = { "red", "red", "yellow", "yellow", "white", "black", "black" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case171() {
        String[] sticker = { "blue", "blue", "blue", "red", "bl", "gr" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case172() {
        String[] sticker = { "aa", "bb", "aa", "bb", "cc", "dd" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case173() {
        String[] sticker = { "a", "a", "b", "c", "c", "d", "d" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case174() {
        String[] sticker = { "a", "b", "c", "d", "a", "a", "a" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case175() {
        String[] sticker = { "a", "a", "b", "b", "c", "c", "d" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case176() {
        String[] sticker = { "aaa", "aaa", "bbb", "bbb", "c", "d" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case177() {
        String[] sticker = { "red", "red", "yellow", "yellow", "blue", "blue", "green" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case178() {
        String[] sticker = { "black", "black", "black", "blue", "green", "yellow" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case179() {
        String[] sticker = { "a", "b", "c", "d", "e", "a" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case180() {
        String[] sticker = { "red", "red", "blue", "blue", "black", "black" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case181() {
        String[] sticker = { "a", "a", "b", "b", "c", "d", "d", "d", "d" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case182() {
        String[] sticker = { "red", "yellow", "blue", "green", "black", "purple" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case183() {
        String[] sticker = { "red", "red", "blue", "blue", "cyan", "cyan" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case184() {
        String[] sticker = { "purple", "orange", "blue", "black", "purple", "purple", "purple" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case185() {
        String[] sticker = { "a", "b", "c", "d", "e", "f", "g", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case186() {
        String[] sticker = { "c", "m", "y", "k", "b", "b" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case187() {
        String[] sticker = { "a", "a", "a", "v", "c", "r" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case188() {
        String[] sticker = { "a", "b", "c", "d", "d", "d", "d", "d", "d", "d" };
        assertEquals("NO", cubestickers.isPossible(sticker));
    }

    @Test
    public void case189() {
        String[] sticker = { "a", "a", "a", "b", "c", "d", "b", "c", "d" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case190() {
        String[] sticker = { "cyan", "cyan", "cyan", "yellow", "yellow", "red", "blue" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case191() {
        String[] sticker = { "cyan", "magenta", "blue", "blue", "purple", "purple" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case192() {
        String[] sticker = { "a", "a", "b", "b", "b", "c", "d" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

    @Test
    public void case193() {
        String[] sticker = { "a", "b", "c", "d", "e", "d" };
        assertEquals("YES", cubestickers.isPossible(sticker));
    }

}
