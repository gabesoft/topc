package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class TurtleSpyTest {
    double DELTA = 1.0e-09;
    TurtleSpy turtlespy = new TurtleSpy();

    @Test
    public void case1() {
        String[] commands = { "forward 100", "backward 100", "left 90" };
        assertEquals(141.4213562373095, turtlespy.maxDistance(commands), DELTA * 141.4213562373095);
    }

    @Test
    public void case2() {
        String[] commands = { "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000" };
        assertEquals(0.0, turtlespy.maxDistance(commands), DELTA);
    }

    @Test
    public void case3() {
        String[] commands = { "left 45", "forward 100", "right 45", "forward 100" };
        assertEquals(200.0, turtlespy.maxDistance(commands), DELTA * 200.0);
    }

    @Test
    public void case4() {
        String[] commands = { "left 10", "forward 40", "right 30", "left 10", "backward 4", "forward 4" };
        assertEquals(40.58520737741619, turtlespy.maxDistance(commands), DELTA * 40.58520737741619);
    }

    @Test
    public void case5() {
        String[] commands = { "left 1", "right 2", "left 3", "right 4", "left 5", "right 6", "left 7", "left 8", "right 9", "right 10", "left 11", "right 12", "left 13", "right 14", "left 15", "right 16", "left 17", "right 18", "left 19", "right 20", "left 21", "right 22", "left 23", "right 24", "left 25", "right 26", "left 27", "right 28", "left 29", "right 30", "left 31", "right 32", "left 33", "right 34", "left 35", "right 36", "left 37", "right 38", "left 39", "right 40", "left 41", "right 42", "left 43", "right 44", "left 45", "right 46", "left 47", "forward 1000", "backward 500" };
        assertEquals(1500.0, turtlespy.maxDistance(commands), DELTA * 1500.0);
    }

    @Test
    public void case6() {
        String[] commands = { "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "right 180" };
        assertEquals(49000.0, turtlespy.maxDistance(commands), DELTA * 49000.0);
    }

    @Test
    public void case7() {
        String[] commands = { "forward 1", "backward 1", "left 2", "left 3", "left 5", "left 7" };
        assertEquals(0.29561882225922065, turtlespy.maxDistance(commands), DELTA * 0.29561882225922065);
    }

    @Test
    public void case8() {
        String[] commands = { "backward 933", "left 28" };
        assertEquals(933.0, turtlespy.maxDistance(commands), DELTA * 933.0);
    }

    @Test
    public void case9() {
        String[] commands = { "backward 167", "backward 556", "backward 378", "right 212", "backward 83", "backward 313", "backward 967", "forward 103", "right 87", "backward 576", "backward 43", "forward 899", "right 141", "left 156", "right 320", "left 30", "right 253", "backward 514", "right 203", "forward 244", "backward 519", "backward 207", "forward 771", "left 44", "backward 214", "forward 830", "right 16", "left 126", "right 166", "right 94", "forward 244", "left 333", "left 249", "backward 75", "left 189", "backward 692", "backward 730", "forward 252", "right 295", "backward 729", "left 298", "left 70" };
        assertEquals(10106.0, turtlespy.maxDistance(commands), DELTA * 10106.0);
    }

    @Test
    public void case10() {
        String[] commands = { "left 266", "forward 173", "right 220", "right 306", "forward 350", "forward 765", "forward 407", "left 224", "left 309", "left 316", "left 322", "right 16", "left 146", "left 96", "right 186", "backward 460", "left 49", "backward 820", "backward 890", "forward 139", "backward 66", "forward 73", "left 10", "forward 683", "backward 246", "left 155", "backward 555", "right 136", "backward 120", "left 42", "left 84", "left 125", "forward 344", "backward 89", "forward 993", "right 210", "left 204", "backward 551", "left 300", "left 198", "right 302", "forward 364", "backward 198", "backward 321", "forward 470", "left 55", "right 26", "forward 29" };
        assertEquals(9106.0, turtlespy.maxDistance(commands), DELTA * 9106.0);
    }

    @Test
    public void case11() {
        String[] commands = { "forward 793", "forward 204", "left 321", "left 100", "backward 30", "forward 732", "right 46", "left 42", "right 254", "backward 317", "left 271" };
        assertEquals(2074.4162262722666, turtlespy.maxDistance(commands), DELTA * 2074.4162262722666);
    }

    @Test
    public void case12() {
        String[] commands = { "backward 35", "right 113", "right 239", "backward 441", "right 157", "backward 143", "right 315", "left 119", "backward 613", "forward 915", "backward 6", "right 57", "backward 977", "backward 668", "forward 852", "right 31", "left 14", "backward 411", "backward 289", "right 180", "right 352", "forward 744", "right 179", "backward 855", "backward 300", "right 293", "left 304", "forward 711", "backward 829", "right 67", "backward 495", "forward 519", "right 122", "forward 146", "right 358", "forward 887", "backward 748", "right 294", "forward 738", "right 112", "right 115", "right 138", "left 338" };
        assertEquals(12322.0, turtlespy.maxDistance(commands), DELTA * 12322.0);
    }

    @Test
    public void case13() {
        String[] commands = { "right 16", "right 145", "left 204", "left 125", "left 146", "forward 674", "forward 363", "right 127", "backward 924", "backward 705", "backward 701", "right 8", "backward 630", "left 98", "right 101", "left 152", "right 75", "left 193", "right 215", "right 66", "left 111", "left 341", "forward 309", "right 30", "forward 97", "forward 748", "forward 475", "backward 443", "left 291", "right 331", "backward 961", "left 270", "forward 167", "right 165", "backward 59", "backward 186", "left 322", "right 171", "forward 338", "left 243", "right 318", "backward 800", "backward 14", "forward 923", "backward 716", "forward 514", "backward 977", "left 50", "right 182", "right 327" };
        assertEquals(11724.0, turtlespy.maxDistance(commands), DELTA * 11724.0);
    }

    @Test
    public void case14() {
        String[] commands = { "left 149", "backward 901", "backward 736", "backward 942", "left 321", "left 284", "forward 745", "left 200", "backward 115", "left 163", "forward 817", "forward 313", "right 216", "backward 87", "forward 126", "forward 194", "left 326" };
        assertEquals(4975.813156923134, turtlespy.maxDistance(commands), DELTA * 4975.813156923134);
    }

    @Test
    public void case15() {
        String[] commands = { "backward 490", "right 60", "right 269", "forward 43", "forward 381", "backward 903", "left 223", "left 215", "left 129", "backward 3", "right 23", "forward 723", "forward 275", "backward 695", "left 256", "left 310", "right 133", "backward 782", "left 43", "backward 571", "right 141", "forward 139", "forward 3", "backward 902", "right 201", "right 256", "forward 400", "right 337", "right 181", "right 26", "right 169", "forward 846", "left 113", "backward 294", "left 352", "right 225", "forward 655", "left 107" };
        assertEquals(8105.0, turtlespy.maxDistance(commands), DELTA * 8105.0);
    }

    @Test
    public void case16() {
        String[] commands = { "backward 384", "right 199", "left 208", "backward 642", "right 227", "forward 102", "backward 627", "right 284", "forward 723", "left 2", "right 266", "right 339", "left 318", "backward 968", "forward 530" };
        assertEquals(3975.8639554697143, turtlespy.maxDistance(commands), DELTA * 3975.8639554697143);
    }

    @Test
    public void case17() {
        String[] commands = { "left 155", "forward 8", "forward 14", "forward 484", "right 218", "forward 384", "backward 164", "forward 656", "forward 386", "forward 180", "left 115", "backward 205", "forward 197", "backward 738", "forward 352", "right 325", "left 336", "right 229", "right 102", "right 229", "left 135", "backward 557", "left 53", "right 201", "right 277", "right 291", "right 302", "backward 586", "right 204", "left 39", "forward 968", "right 275" };
        assertEquals(5879.0, turtlespy.maxDistance(commands), DELTA * 5879.0);
    }

    @Test
    public void case18() {
        String[] commands = { "right 324", "left 128", "forward 236", "forward 831", "right 140", "forward 687", "forward 434", "right 334", "forward 135", "forward 91", "right 278", "forward 811", "left 249", "forward 970", "right 138", "backward 168", "backward 844", "forward 353", "forward 57", "left 317", "right 349", "forward 119", "left 175", "forward 899", "forward 315", "forward 875", "left 145", "backward 403", "forward 911", "backward 539", "left 283", "backward 472", "left 278", "left 252", "backward 442" };
        assertEquals(10592.0, turtlespy.maxDistance(commands), DELTA * 10592.0);
    }

    @Test
    public void case19() {
        String[] commands = { "right 115", "left 209", "backward 668", "left 59", "forward 614", "right 297", "right 267", "backward 315", "backward 546", "backward 621", "left 47", "backward 842", "left 139", "left 27", "left 141", "forward 449", "left 358", "left 103", "right 270", "forward 925" };
        assertEquals(4980.0, turtlespy.maxDistance(commands), DELTA * 4980.0);
    }

    @Test
    public void case20() {
        String[] commands = { "forward 753", "left 159" };
        assertEquals(753.0, turtlespy.maxDistance(commands), DELTA * 753.0);
    }

    @Test
    public void case21() {
        String[] commands = { "forward 974", "left 302", "left 60", "right 278", "backward 989", "right 246", "left 299", "left 290", "right 146", "right 236", "forward 332", "forward 412", "backward 209", "left 144", "backward 525", "backward 200", "left 168", "left 284", "forward 935", "left 230", "backward 345", "forward 479", "right 311", "forward 874", "forward 488", "backward 555", "forward 75", "backward 70", "right 144", "backward 413", "right 299", "right 333", "backward 11", "backward 145", "right 187", "backward 706", "right 157", "backward 20", "forward 778", "forward 796", "right 204", "right 197", "backward 486", "backward 690", "forward 950", "right 199", "forward 173", "right 30", "left 321", "right 254" };
        assertEquals(12630.0, turtlespy.maxDistance(commands), DELTA * 12630.0);
    }

    @Test
    public void case22() {
        String[] commands = { "left 160", "backward 651", "left 230", "backward 322", "forward 74", "forward 16", "forward 430", "forward 971", "right 2", "forward 163", "backward 463", "right 115", "left 251", "right 328", "right 126", "left 122", "right 80", "forward 507", "forward 369", "left 271", "left 53", "left 143", "backward 936", "forward 871", "backward 839", "backward 348", "left 212", "forward 864", "right 218", "left 303" };
        assertEquals(7824.0, turtlespy.maxDistance(commands), DELTA * 7824.0);
    }

    @Test
    public void case23() {
        String[] commands = { "backward 957", "backward 400", "right 179", "left 219", "right 194", "forward 853", "backward 861", "right 106", "right 286", "left 130", "right 247", "right 108", "left 13", "backward 174", "forward 816", "backward 116", "right 205", "backward 60", "forward 632", "right 157", "left 148", "backward 433", "right 223", "backward 52", "forward 480", "right 328", "left 321", "left 320", "left 70", "forward 991", "forward 655", "backward 88" };
        assertEquals(7568.0, turtlespy.maxDistance(commands), DELTA * 7568.0);
    }

    @Test
    public void case24() {
        String[] commands = { "forward 926", "left 149", "right 267", "left 319", "forward 3", "backward 200", "right 31", "forward 948", "backward 924", "forward 228", "backward 157", "forward 327", "left 51", "right 174", "right 134", "right 75", "left 88", "forward 303", "right 127", "forward 318", "forward 368", "right 53", "backward 781", "left 168", "forward 571", "left 277", "backward 656", "backward 416", "right 168", "backward 750", "left 135", "left 359", "right 62", "left 29", "backward 412", "forward 966", "left 198", "forward 706", "right 336", "backward 245", "backward 312", "backward 59" };
        assertEquals(10576.0, turtlespy.maxDistance(commands), DELTA * 10576.0);
    }

    @Test
    public void case25() {
        String[] commands = { "forward 484", "forward 17", "right 216", "right 260", "backward 823", "forward 983", "forward 244", "left 288", "right 185", "right 304", "left 115", "right 21", "forward 125", "backward 611", "right 189", "backward 779", "forward 865", "forward 567", "right 250", "backward 921", "backward 721", "left 258", "left 231", "right 88", "forward 564", "left 303", "backward 84", "right 262", "forward 956", "backward 256", "left 261", "right 333", "forward 520", "left 8", "left 61", "forward 50", "forward 223", "right 151", "forward 553", "left 284", "right 147", "left 4", "right 116", "forward 128", "forward 213", "right 276", "left 186", "right 345", "left 212", "left 337" };
        assertEquals(10687.0, turtlespy.maxDistance(commands), DELTA * 10687.0);
    }

    @Test
    public void case26() {
        String[] commands = { "forward 43", "backward 369", "left 178", "forward 71", "forward 714", "left 39", "backward 958", "left 173", "backward 214", "forward 184", "backward 559", "left 252", "forward 563", "forward 562", "right 271", "forward 915", "right 184", "forward 787", "forward 377", "forward 558", "left 127", "right 106", "right 5", "forward 613", "backward 583", "backward 282", "backward 463", "right 14", "forward 261", "backward 559", "left 87", "backward 440", "left 303" };
        assertEquals(10075.0, turtlespy.maxDistance(commands), DELTA * 10075.0);
    }

    @Test
    public void case27() {
        String[] commands = { "right 22", "left 227", "left 83", "right 54", "forward 952", "right 105", "backward 523", "left 214", "left 99", "right 204", "right 101", "forward 249", "backward 708", "backward 590", "backward 409", "left 134", "left 288", "backward 737", "right 91", "backward 806" };
        assertEquals(4974.0, turtlespy.maxDistance(commands), DELTA * 4974.0);
    }

    @Test
    public void case28() {
        String[] commands = { "forward 485", "left 22", "left 54", "forward 767", "backward 506", "forward 430" };
        assertEquals(1635.0426355482525, turtlespy.maxDistance(commands), DELTA * 1635.0426355482525);
    }

    @Test
    public void case29() {
        String[] commands = { "forward 204", "left 315", "left 120", "forward 569", "forward 719", "right 148", "backward 344", "backward 446", "left 82", "backward 34", "backward 655", "left 154", "backward 588", "forward 688", "forward 889", "forward 865", "backward 521", "backward 299", "right 39", "right 237", "forward 756", "forward 788", "left 58", "forward 130", "right 145", "backward 805", "backward 349", "left 67", "left 207", "backward 342", "right 252", "right 345", "backward 215", "left 129" };
        assertEquals(10206.0, turtlespy.maxDistance(commands), DELTA * 10206.0);
    }

    @Test
    public void case30() {
        String[] commands = { "backward 797", "backward 822", "backward 990", "right 27", "right 267", "right 262", "left 288", "backward 741", "left 13", "right 265", "right 11", "backward 694", "left 312", "left 333", "forward 568", "forward 749", "backward 324", "right 231", "forward 750", "right 313", "backward 144", "right 229", "backward 6", "backward 203", "right 9", "left 59", "forward 709", "forward 298", "backward 317", "forward 596", "right 119", "left 37", "backward 494", "backward 96", "left 266", "right 257", "right 71", "right 301", "backward 837", "left 78", "backward 136" };
        assertEquals(10271.0, turtlespy.maxDistance(commands), DELTA * 10271.0);
    }

    @Test
    public void case31() {
        String[] commands = { "backward 90", "backward 951", "left 286", "backward 617", "left 172", "left 159", "backward 466", "left 180", "left 84", "forward 583", "backward 79", "right 200", "backward 690", "forward 359", "right 181", "backward 900", "forward 857", "right 307", "left 3", "right 60", "backward 677", "forward 54", "left 102", "backward 672", "left 277", "right 24", "left 105", "right 128", "forward 351", "left 281", "backward 271", "forward 645", "left 10", "forward 418", "backward 719", "right 3", "left 241", "forward 506" };
        assertEquals(9905.0, turtlespy.maxDistance(commands), DELTA * 9905.0);
    }

    @Test
    public void case32() {
        String[] commands = { "right 219", "left 96", "left 71", "left 199", "left 110", "left 32", "right 148", "left 165", "left 185", "right 242", "right 144", "right 339", "right 250", "left 177", "right 334", "left 106", "right 276", "right 336", "right 300", "right 43", "right 243", "left 165", "left 136", "right 197", "left 118", "left 49", "backward 837", "forward 958", "left 152", "left 320", "right 93", "right 243" };
        assertEquals(1795.0, turtlespy.maxDistance(commands), DELTA * 1795.0);
    }

    @Test
    public void case33() {
        String[] commands = { "left 357", "forward 65", "left 44", "left 323", "backward 46", "right 12", "right 306", "left 131", "right 9", "right 41", "right 309", "left 56", "left 263", "left 73", "left 304", "right 262", "left 126", "forward 568", "right 205", "right 137", "right 285", "left 323", "backward 55", "left 121", "left 119" };
        assertEquals(734.0, turtlespy.maxDistance(commands), DELTA * 734.0);
    }

    @Test
    public void case34() {
        String[] commands = { "right 204", "right 83", "left 68", "right 298", "left 259", "backward 301", "right 85", "right 105", "left 300", "right 270", "right 302", "left 119", "forward 339" };
        assertEquals(640.0, turtlespy.maxDistance(commands), DELTA * 640.0);
    }

    @Test
    public void case35() {
        String[] commands = { "left 55", "right 332", "right 38", "right 221", "right 52", "right 60", "left 130", "right 164", "right 263", "left 9", "left 136", "left 319", "left 33", "right 45", "left 30", "right 176", "left 49", "right 228", "forward 773", "right 191", "left 264", "forward 775", "left 208", "right 290", "left 245", "right 261", "right 278", "left 336", "left 165", "right 176", "right 150", "right 273", "right 39", "right 136", "right 148", "right 176", "right 334", "left 282", "left 124", "left 120", "left 185", "left 43", "forward 770", "left 250" };
        assertEquals(2318.0, turtlespy.maxDistance(commands), DELTA * 2318.0);
    }

    @Test
    public void case36() {
        String[] commands = { "left 335", "right 295", "right 84", "left 32", "right 73", "right 29", "right 232", "right 237", "left 318", "right 174", "forward 84", "left 350", "left 339", "right 126", "left 37", "right 338", "left 317", "left 149", "right 170", "left 115", "left 262" };
        assertEquals(84.0, turtlespy.maxDistance(commands), DELTA * 84.0);
    }

    @Test
    public void case37() {
        String[] commands = { "left 25", "right 78", "left 61", "right 199", "right 346", "right 151", "left 350", "left 251", "right 165", "left 275", "left 60", "right 287", "right 118", "right 117", "right 339", "right 98", "right 241", "left 236", "left 131", "left 192", "right 197", "left 195", "left 243", "left 258", "right 325", "right 298", "right 177", "left 149", "right 300", "left 227", "left 349", "left 186", "left 38", "right 129", "right 284", "right 104", "left 89", "right 178", "left 74", "right 302", "left 259", "left 287", "right 258", "right 342", "right 63" };
        assertEquals(0.0, turtlespy.maxDistance(commands), DELTA);
    }

    @Test
    public void case38() {
        String[] commands = { "forward 703", "left 327", "left 135", "right 280", "right 225", "left 32", "backward 347", "left 119", "right 238", "left 133", "left 358", "left 6", "right 194", "left 288", "right 15", "left 224", "left 24", "right 3", "left 307", "right 292", "right 329" };
        assertEquals(1050.0, turtlespy.maxDistance(commands), DELTA * 1050.0);
    }

    @Test
    public void case39() {
        String[] commands = { "right 38", "forward 15", "backward 163", "left 11", "left 257" };
        assertEquals(174.91210293037068, turtlespy.maxDistance(commands), DELTA * 174.91210293037068);
    }

    @Test
    public void case40() {
        String[] commands = { "left 307", "right 69", "left 96", "left 57", "backward 905", "right 164", "left 293", "left 164", "forward 7", "right 262", "right 80", "left 41", "right 261", "left 215", "left 202", "left 277", "right 142", "left 25", "right 137", "right 354", "left 71", "left 227", "right 140" };
        assertEquals(912.0, turtlespy.maxDistance(commands), DELTA * 912.0);
    }

    @Test
    public void case41() {
        String[] commands = { "right 211", "left 224", "right 283", "left 1", "right 79", "left 131", "right 228", "left 263", "right 15", "left 218", "right 170", "right 166", "right 9", "left 295", "right 29", "right 207", "left 202", "left 332", "right 212", "left 341", "right 308", "left 260", "left 46", "left 212", "backward 177", "right 169", "left 213", "right 340", "left 348", "right 135", "right 3", "left 247", "right 246", "right 98", "left 206", "right 258", "right 328", "right 36", "right 21", "left 103", "left 250", "left 174", "left 145", "left 95", "right 40", "right 164", "right 243", "forward 802", "left 271" };
        assertEquals(979.0, turtlespy.maxDistance(commands), DELTA * 979.0);
    }

    @Test
    public void case42() {
        String[] commands = { "left 13", "right 277", "left 257", "right 174", "right 9", "right 127", "right 8", "forward 684", "backward 692" };
        assertEquals(1375.9476079073536, turtlespy.maxDistance(commands), DELTA * 1375.9476079073536);
    }

    @Test
    public void case43() {
        String[] commands = { "left 228", "left 199", "right 321", "right 81", "right 183", "right 61", "left 51", "right 334", "right 103", "right 293", "left 58", "forward 161", "left 235", "right 118", "right 50", "left 112", "left 251", "right 294", "left 60", "right 240", "left 16", "left 146", "right 225", "left 236", "left 118", "right 20", "left 120", "right 170", "right 178", "backward 244", "right 280", "left 202" };
        assertEquals(405.0, turtlespy.maxDistance(commands), DELTA * 405.0);
    }

    @Test
    public void case44() {
        String[] commands = { "left 135", "left 327", "right 94", "left 17", "right 126", "left 347", "right 118", "right 215", "right 203", "left 92", "right 123", "right 280", "right 341", "right 32", "right 123", "right 195", "forward 318", "left 53", "left 3", "right 353", "left 92", "right 185", "left 298", "right 255", "right 307", "right 322", "left 169", "left 2", "left 307", "right 257", "right 157", "backward 467", "left 234", "left 350", "right 63", "right 4" };
        assertEquals(785.0, turtlespy.maxDistance(commands), DELTA * 785.0);
    }

    @Test
    public void case45() {
        String[] commands = { "right 69", "left 40", "right 164", "left 202", "left 4", "backward 73", "left 35", "left 64", "right 288", "left 140", "left 200", "left 172", "left 149", "right 37", "right 123", "left 13", "left 113", "right 219", "left 345", "forward 524", "right 13", "right 334", "left 94", "right 306", "right 128" };
        assertEquals(597.0, turtlespy.maxDistance(commands), DELTA * 597.0);
    }

    @Test
    public void case46() {
        String[] commands = { "left 126", "left 116", "left 347", "backward 130", "right 322", "right 319", "left 130", "left 299", "left 267", "right 313", "right 24", "left 24", "right 200", "right 84", "right 15", "right 17", "right 130", "left 207", "left 118", "right 231", "left 203", "left 287", "left 286", "left 183", "right 253", "left 88", "left 299", "right 53", "right 348", "right 245", "right 137", "right 93", "right 108", "right 24", "forward 1000", "right 347", "right 60", "left 247", "right 19", "right 188", "right 297" };
        assertEquals(1130.0, turtlespy.maxDistance(commands), DELTA * 1130.0);
    }

    @Test
    public void case47() {
        String[] commands = { "right 50", "left 341", "backward 554", "left 322", "right 75", "right 146", "right 271", "right 298", "right 112", "left 215", "left 298", "right 253", "forward 679" };
        assertEquals(1233.0, turtlespy.maxDistance(commands), DELTA * 1233.0);
    }

    @Test
    public void case48() {
        String[] commands = { "left 14", "right 345", "left 117", "left 255", "right 154", "left 329", "left 183", "right 289", "right 251", "left 162", "right 82", "left 154", "right 345", "backward 346", "right 12", "right 260", "right 282", "left 117", "left 170", "left 146", "right 15", "right 294", "left 323", "left 114", "right 303", "left 170", "forward 947", "left 267" };
        assertEquals(1293.0, turtlespy.maxDistance(commands), DELTA * 1293.0);
    }

    @Test
    public void case49() {
        String[] commands = { "right 74", "backward 704", "right 82", "right 255", "left 181", "left 196", "left 247", "left 247", "right 269", "right 43", "right 180", "left 326", "left 332", "right 144", "right 96", "left 216", "right 195", "left 67", "right 288", "left 132", "left 10", "right 169", "left 359", "right 73", "left 284", "forward 933" };
        assertEquals(1637.0, turtlespy.maxDistance(commands), DELTA * 1637.0);
    }

    @Test
    public void case50() {
        String[] commands = { "forward 206", "backward 207", "right 190", "right 160", "right 12" };
        assertEquals(411.99395866269214, turtlespy.maxDistance(commands), DELTA * 411.99395866269214);
    }

    @Test
    public void case51() {
        String[] commands = { "left 2", "left 141", "right 221", "backward 143", "left 329", "left 235", "right 177", "left 162", "right 269", "forward 806", "left 154", "left 43", "right 242", "left 208", "right 35", "left 218", "left 239", "right 324", "left 187", "left 126", "left 350", "right 40", "left 62", "right 90", "right 44", "right 191", "right 332", "right 123", "right 320", "right 220", "left 339", "left 325", "left 70", "left 178", "right 16", "left 106", "right 16", "right 303", "left 78", "right 187", "right 298", "left 6", "right 298", "right 254", "right 46", "left 268", "right 217", "right 15" };
        assertEquals(949.0, turtlespy.maxDistance(commands), DELTA * 949.0);
    }

    @Test
    public void case52() {
        String[] commands = { "left 94", "left 4", "left 331", "right 342", "backward 954", "right 231", "forward 222", "right 39", "right 206", "left 153" };
        assertEquals(1176.0, turtlespy.maxDistance(commands), DELTA * 1176.0);
    }

    @Test
    public void case53() {
        String[] commands = { "right 224", "left 193", "right 184", "right 234", "right 196", "left 270", "right 325", "right 73", "right 102", "right 258", "right 247", "right 307", "right 126", "left 270", "right 160", "right 194", "right 215", "right 131", "left 308", "right 109", "right 87", "left 30", "right 327", "right 79", "right 63", "left 337", "left 156", "left 207", "right 306", "right 299", "right 9", "left 305", "right 64", "left 21", "backward 975", "left 278", "right 219", "right 308", "right 46", "right 26", "right 311", "left 332", "right 301", "forward 510", "right 80", "right 261", "left 59", "right 307", "left 270" };
        assertEquals(1485.0, turtlespy.maxDistance(commands), DELTA * 1485.0);
    }

    @Test
    public void case54() {
        String[] commands = { "left 6", "right 256", "forward 994", "left 298", "left 136", "right 335", "left 40", "left 356", "left 197", "left 340", "backward 327", "left 345", "left 277", "left 174", "right 181", "left 13", "right 59", "right 153" };
        assertEquals(1321.0, turtlespy.maxDistance(commands), DELTA * 1321.0);
    }

    @Test
    public void case55() {
        String[] commands = { "right 234", "right 178", "right 216", "right 330", "right 112", "right 354", "right 128", "left 124", "forward 35", "right 302", "left 78", "right 273", "right 240", "left 106", "right 130", "left 213", "left 310", "left 81", "left 159", "right 117", "left 268", "right 31", "left 76", "right 116", "left 269", "backward 800", "left 15", "right 310", "right 114", "left 126", "left 84", "right 167", "right 93", "left 98", "right 161", "left 213", "right 234", "right 47", "left 45", "right 71", "right 342" };
        assertEquals(835.0, turtlespy.maxDistance(commands), DELTA * 835.0);
    }

    @Test
    public void case56() {
        String[] commands = { "forward 526" };
        assertEquals(526.0, turtlespy.maxDistance(commands), DELTA * 526.0);
    }

    @Test
    public void case57() {
        String[] commands = { "right 219", "left 307", "forward 723", "left 107", "left 287", "left 39", "left 208", "backward 837" };
        assertEquals(1560.0, turtlespy.maxDistance(commands), DELTA * 1560.0);
    }

    @Test
    public void case58() {
        String[] commands = { "right 179", "left 249", "forward 574", "left 325", "right 33", "left 357", "left 211", "left 350", "right 281", "right 182", "right 349", "left 169", "backward 180", "right 355", "right 315", "left 247", "left 98", "left 315", "left 66", "left 194", "left 87", "left 294", "right 31", "left 159", "right 79", "left 122", "left 119" };
        assertEquals(754.0, turtlespy.maxDistance(commands), DELTA * 754.0);
    }

    @Test
    public void case59() {
        String[] commands = { "left 112", "right 20", "right 257", "left 26", "right 231", "right 199", "left 287", "right 308", "left 319", "right 189", "right 159", "right 153", "right 241", "left 258", "left 144", "right 155", "right 69", "left 143", "backward 912", "right 275", "right 61", "left 239", "right 238", "left 82", "left 337", "right 309", "right 306", "left 345", "left 355", "right 93", "left 9", "left 323", "left 26", "right 106", "right 248", "left 283", "left 230", "left 327", "left 220", "right 196", "left 282", "right 160", "forward 400", "right 19", "left 158", "left 9" };
        assertEquals(1312.0, turtlespy.maxDistance(commands), DELTA * 1312.0);
    }

    @Test
    public void case60() {
        String[] commands = { "forward 362", "right 153", "left 348", "backward 333", "left 1" };
        assertEquals(689.0645755745132, turtlespy.maxDistance(commands), DELTA * 689.0645755745132);
    }

    @Test
    public void case61() {
        String[] commands = { "left 25", "forward 440", "left 51", "backward 13", "left 137" };
        assertEquals(452.8770988981487, turtlespy.maxDistance(commands), DELTA * 452.8770988981487);
    }

    @Test
    public void case62() {
        String[] commands = { "left 61", "left 33", "forward 524", "left 237", "right 13", "right 129", "right 203", "right 261", "left 16", "right 197", "left 328", "right 59", "backward 108", "left 19", "right 111", "right 54", "right 292", "left 313" };
        assertEquals(632.0, turtlespy.maxDistance(commands), DELTA * 632.0);
    }

    @Test
    public void case63() {
        String[] commands = { "right 3", "right 3", "right 3", "left 2", "right 3", "left 3", "left 2", "left 3", "left 1", "right 1", "right 1", "right 1", "backward 586", "left 2", "left 1", "left 1", "right 2", "left 3", "left 3", "left 1", "right 2", "right 3", "left 3", "left 2", "right 2", "right 2", "right 2", "left 3", "forward 75", "right 3" };
        assertEquals(523.1405110181053, turtlespy.maxDistance(commands), DELTA * 523.1405110181053);
    }

    @Test
    public void case64() {
        String[] commands = { "right 3", "right 1", "right 3", "left 3", "right 1", "right 2", "left 1", "left 3", "left 3", "left 1", "backward 286", "right 1", "forward 285", "left 3", "right 2", "right 3", "right 3", "right 1", "right 1", "right 3", "right 2", "left 3", "right 1", "left 2", "left 1", "right 3", "right 3", "left 2", "left 3", "right 3", "right 3", "left 2", "right 1" };
        assertEquals(195.29576258266383, turtlespy.maxDistance(commands), DELTA * 195.29576258266383);
    }

    @Test
    public void case65() {
        String[] commands = { "right 3", "left 1", "forward 170", "left 1", "backward 599", "right 2", "left 2" };
        assertEquals(429.90230028069766, turtlespy.maxDistance(commands), DELTA * 429.90230028069766);
    }

    @Test
    public void case66() {
        String[] commands = { "right 2", "right 2", "right 2", "left 2", "left 1", "left 3", "right 3", "forward 567", "left 3", "right 3", "right 2", "left 2", "right 1", "right 2", "left 3", "left 1", "right 1", "right 3", "right 2", "left 1", "right 3", "left 1", "right 2", "right 2", "right 3", "right 2", "right 3", "right 1", "right 3", "right 2", "left 1", "right 2", "left 1", "left 3", "right 3", "right 3", "right 2", "right 3", "left 1", "right 2", "right 3", "backward 788" };
        assertEquals(723.1299795106204, turtlespy.maxDistance(commands), DELTA * 723.1299795106204);
    }

    @Test
    public void case67() {
        String[] commands = { "left 3", "right 3", "left 2", "right 2", "left 2", "left 1", "forward 289", "backward 786", "right 3", "right 2", "left 2", "right 3", "left 1", "right 3", "left 3", "right 3", "right 3", "left 2", "right 2" };
        assertEquals(535.056997178156, turtlespy.maxDistance(commands), DELTA * 535.056997178156);
    }

    @Test
    public void case68() {
        String[] commands = { "left 1", "backward 583", "right 3", "right 2", "left 1", "right 3", "right 3", "left 2", "left 2", "right 3", "right 2", "right 1", "left 3", "right 2", "left 3", "left 3", "left 2", "right 2", "right 2", "right 1", "left 3", "right 1", "left 2", "left 2", "right 2", "left 1", "left 3", "left 1", "right 2", "left 2", "right 1", "right 1", "left 1", "left 2", "left 3", "right 3", "left 1", "right 3", "right 1", "left 1", "left 3", "right 1", "left 2", "left 2", "right 1", "forward 810" };
        assertEquals(583.0196870057615, turtlespy.maxDistance(commands), DELTA * 583.0196870057615);
    }

    @Test
    public void case69() {
        String[] commands = { "forward 366", "left 3", "right 1", "backward 583" };
        assertEquals(218.34343192841206, turtlespy.maxDistance(commands), DELTA * 218.34343192841206);
    }

    @Test
    public void case70() {
        String[] commands = { "right 1", "right 1", "left 1", "right 1", "left 1", "right 3", "forward 710", "left 1", "left 1", "left 1", "backward 817", "left 2" };
        assertEquals(141.76215163024548, turtlespy.maxDistance(commands), DELTA * 141.76215163024548);
    }

    @Test
    public void case71() {
        String[] commands = { "backward 977", "right 3", "left 3", "right 1", "left 2", "left 1", "forward 84", "right 3", "right 2", "right 1", "left 3", "left 3" };
        assertEquals(895.0060141730647, turtlespy.maxDistance(commands), DELTA * 895.0060141730647);
    }

    @Test
    public void case72() {
        String[] commands = { "left 3", "right 2", "backward 268", "left 2", "right 3", "right 3", "forward 773", "right 2" };
        assertEquals(511.19426181243256, turtlespy.maxDistance(commands), DELTA * 511.19426181243256);
    }

    @Test
    public void case73() {
        String[] commands = { "forward 976", "left 2", "right 3", "right 1", "left 1", "left 2", "right 1", "right 3", "right 3", "right 3", "left 1", "right 2", "right 3", "left 1", "left 3", "right 3", "backward 474" };
        assertEquals(565.1344910105815, turtlespy.maxDistance(commands), DELTA * 565.1344910105815);
    }

    @Test
    public void case74() {
        String[] commands = { "left 1", "left 3", "right 3", "right 3", "right 1", "left 2", "left 3", "backward 404", "right 3", "left 2", "right 3", "left 3", "forward 757", "right 3", "right 1", "right 3", "left 3", "left 2", "left 1", "right 2", "right 3", "left 1", "left 2", "left 3", "right 3", "left 3", "right 3", "left 1", "right 2", "right 1", "left 1", "right 1", "right 3", "left 3", "left 3", "left 3", "right 3", "left 1", "right 2", "right 3", "right 2", "left 2", "left 3", "right 3" };
        assertEquals(592.7372157136926, turtlespy.maxDistance(commands), DELTA * 592.7372157136926);
    }

    @Test
    public void case75() {
        String[] commands = { "right 2", "left 1", "right 1", "left 2", "right 2", "right 3", "left 2", "right 1", "left 2", "left 2", "left 2", "right 2", "right 2", "left 2", "right 3", "left 1", "right 2", "right 2", "left 1", "left 1", "right 3", "left 3", "right 3", "left 2", "right 2", "right 3", "right 2", "right 1", "right 1", "forward 526", "right 1", "left 3", "right 2", "right 1", "right 3", "left 3", "backward 176", "left 1", "right 2", "right 3", "left 2", "left 3", "left 2", "left 3", "left 3", "left 2", "left 2" };
        assertEquals(425.88571194360145, turtlespy.maxDistance(commands), DELTA * 425.88571194360145);
    }

    @Test
    public void case76() {
        String[] commands = { "left 2", "left 2", "left 1", "right 2", "right 1", "left 2", "left 3", "left 1", "left 3", "right 1", "left 1", "right 2", "right 3", "left 1", "right 3", "left 1", "right 2", "right 3", "right 3", "right 2", "right 1", "right 2", "right 3", "forward 604", "right 2", "right 2", "left 2", "right 3", "backward 782", "left 2", "right 2", "right 1", "left 3", "left 1", "left 3", "right 1", "right 2", "left 2", "right 2" };
        assertEquals(534.286756005837, turtlespy.maxDistance(commands), DELTA * 534.286756005837);
    }

    @Test
    public void case77() {
        String[] commands = { "right 1", "right 1", "right 3", "left 3", "left 1", "left 1", "right 1", "backward 369", "left 1", "left 1", "left 1", "left 1", "left 1", "forward 764", "right 1", "right 3", "left 1", "right 1", "right 1", "right 2", "right 2", "right 2" };
        assertEquals(428.5100959187205, turtlespy.maxDistance(commands), DELTA * 428.5100959187205);
    }

    @Test
    public void case78() {
        String[] commands = { "right 1", "left 3", "forward 385", "right 1", "left 1", "right 1", "left 1", "right 3", "right 1", "left 3", "left 1", "left 1", "left 1", "left 1", "left 1", "right 3", "left 2", "right 1", "backward 437", "right 3", "right 1", "right 2", "left 2", "left 3", "left 3" };
        assertEquals(171.61970126354524, turtlespy.maxDistance(commands), DELTA * 171.61970126354524);
    }

    @Test
    public void case79() {
        String[] commands = { "backward 244", "left 2", "left 2", "left 2", "right 1", "forward 813", "left 1", "right 1", "right 3", "left 3", "right 2", "left 2", "left 1" };
        assertEquals(577.866353940811, turtlespy.maxDistance(commands), DELTA * 577.866353940811);
    }

    @Test
    public void case80() {
        String[] commands = { "right 3", "left 1", "backward 893", "right 2", "right 3", "right 1", "right 3", "left 1", "forward 868", "left 3", "right 1" };
        assertEquals(200.89239857898707, turtlespy.maxDistance(commands), DELTA * 200.89239857898707);
    }

    @Test
    public void case81() {
        String[] commands = { "left 3", "left 1", "left 3", "left 1", "forward 172", "left 3", "right 2", "right 2", "right 3", "backward 43", "left 2" };
        assertEquals(130.46117430751877, turtlespy.maxDistance(commands), DELTA * 130.46117430751877);
    }

    @Test
    public void case82() {
        String[] commands = { "right 3", "left 1", "left 1", "left 2", "right 1", "left 1", "left 1", "right 1", "left 3", "backward 31", "right 1", "right 1", "left 3", "left 2", "right 2", "right 3", "left 3", "right 3", "right 3", "right 2", "right 2", "right 2", "forward 1", "right 3", "left 3", "left 3", "left 1", "left 1", "right 3", "left 2", "left 1", "left 3" };
        assertEquals(30.147232499127828, turtlespy.maxDistance(commands), DELTA * 30.147232499127828);
    }

    @Test
    public void case83() {
        String[] commands = { "right 3", "right 2", "right 3", "left 1", "right 2", "right 3", "left 3", "right 3", "right 3", "left 3", "left 1", "right 3", "left 2", "left 1", "left 2", "right 1", "right 1", "right 3", "left 1", "right 1", "right 3", "right 2", "left 1", "left 3", "left 2", "left 2", "forward 189", "left 1", "right 2", "left 1", "right 3", "left 2", "left 3", "right 2", "right 3", "right 1", "right 2", "backward 703", "right 1", "left 2", "left 1", "left 3", "left 3", "left 2", "left 3", "right 1", "left 3", "left 3" };
        assertEquals(596.3160319748553, turtlespy.maxDistance(commands), DELTA * 596.3160319748553);
    }

    @Test
    public void case84() {
        String[] commands = { "forward 938", "left 1", "left 2", "backward 390", "left 1", "left 3", "right 1" };
        assertEquals(552.9534642383056, turtlespy.maxDistance(commands), DELTA * 552.9534642383056);
    }

    @Test
    public void case85() {
        String[] commands = { "left 3", "left 3", "right 2", "right 1", "left 1", "left 2", "left 3", "left 3", "right 3", "backward 60", "left 1", "right 1", "left 3", "right 3", "forward 951", "left 3", "left 2", "left 3", "left 3", "right 2", "left 2", "right 2", "left 2", "left 2", "left 2", "right 2", "right 1", "right 2", "left 3", "left 3", "left 3", "left 1" };
        assertEquals(911.9428793528283, turtlespy.maxDistance(commands), DELTA * 911.9428793528283);
    }

    @Test
    public void case86() {
        String[] commands = { "left 2", "right 3", "backward 286", "left 2", "right 3", "left 1", "left 2", "right 1", "right 3", "left 3", "left 3", "left 2", "forward 663", "left 2", "right 2", "right 1", "left 1", "right 1" };
        assertEquals(400.8617354977788, turtlespy.maxDistance(commands), DELTA * 400.8617354977788);
    }

    @Test
    public void case87() {
        String[] commands = { "right 1", "left 1", "right 1", "right 3", "left 3", "left 1", "backward 277", "forward 616", "right 3", "left 1", "left 1", "right 1", "right 3", "left 1", "right 2", "right 1", "right 2", "left 2", "right 3", "left 1", "right 1", "right 2", "left 2" };
        assertEquals(376.8949876177798, turtlespy.maxDistance(commands), DELTA * 376.8949876177798);
    }

    @Test
    public void case88() {
        String[] commands = { "left 4", "right 6", "left 7", "right 6", "left 7", "right 3", "left 6", "backward 359", "right 5", "forward 893", "left 5", "right 7", "left 7", "left 7", "right 6", "left 4", "left 5", "right 3" };
        assertEquals(729.0979832776567, turtlespy.maxDistance(commands), DELTA * 729.0979832776567);
    }

    @Test
    public void case89() {
        String[] commands = { "left 4", "forward 257", "left 4", "left 3", "right 6", "left 7", "left 4", "left 3", "left 3", "right 7", "left 6", "left 6", "left 6", "left 7", "left 7", "right 7", "left 5", "right 5", "right 6", "right 4", "left 5", "right 7", "left 4", "left 6", "right 3", "left 5", "right 5", "left 4", "left 7", "left 3", "right 6", "left 6", "left 3", "left 3", "left 5", "right 6", "right 3", "backward 536", "left 3", "right 7", "left 6", "right 4", "left 6", "left 7", "left 5", "right 7", "left 5", "right 5", "left 3" };
        assertEquals(770.9125941348552, turtlespy.maxDistance(commands), DELTA * 770.9125941348552);
    }

    @Test
    public void case90() {
        String[] commands = { "right 3", "left 4", "right 5", "left 7", "left 6", "left 5", "right 7", "right 7", "right 5", "left 3", "left 6", "left 7", "left 7", "right 7", "right 4", "right 6", "right 7", "left 4", "left 4", "right 5", "right 4", "right 3", "left 3", "left 5", "forward 15", "left 6", "left 6", "right 4", "right 6", "left 4", "right 4", "left 4", "right 6", "left 7", "left 7", "backward 305", "left 3" };
        assertEquals(307.44663581471275, turtlespy.maxDistance(commands), DELTA * 307.44663581471275);
    }

    @Test
    public void case91() {
        String[] commands = { "right 4", "right 5", "left 5", "right 7", "right 6", "right 6", "left 7", "right 6", "left 4", "right 6", "right 6", "right 4", "right 7", "right 5", "left 5", "left 4", "right 7", "forward 838", "right 7", "right 3", "left 7", "backward 770", "right 5", "right 7", "left 5", "left 7", "left 7", "left 5", "left 6", "left 7", "left 4", "left 5", "right 6", "right 5", "right 7", "left 7", "right 3", "right 4", "left 4", "left 7", "right 4" };
        assertEquals(1392.9838477168355, turtlespy.maxDistance(commands), DELTA * 1392.9838477168355);
    }

    @Test
    public void case92() {
        String[] commands = { "right 7", "right 4", "left 7", "left 4", "right 4", "right 4", "forward 30", "left 7", "backward 594" };
        assertEquals(565.7187622535073, turtlespy.maxDistance(commands), DELTA * 565.7187622535073);
    }

    @Test
    public void case93() {
        String[] commands = { "right 7", "right 3", "right 4", "left 6", "right 5", "right 4", "left 6", "right 6", "right 6", "right 6", "forward 744", "right 5", "left 7", "left 3", "left 4", "right 5", "left 6", "left 4", "left 3", "left 5", "left 5", "left 3", "left 6", "right 5", "right 5", "right 3", "right 6", "right 7", "left 3", "backward 641", "left 5", "left 7", "right 6", "left 4", "left 4", "left 7", "right 7", "right 4", "right 4", "right 3", "right 5", "left 7" };
        assertEquals(1107.8457090574934, turtlespy.maxDistance(commands), DELTA * 1107.8457090574934);
    }

    @Test
    public void case94() {
        String[] commands = { "left 6", "left 4", "left 3", "left 3", "right 5", "left 4", "right 5", "left 6", "left 7", "left 4", "left 4", "left 4", "left 4", "right 5", "right 4", "left 3", "backward 14", "right 4", "forward 350" };
        assertEquals(341.55895178110694, turtlespy.maxDistance(commands), DELTA * 341.55895178110694);
    }

    @Test
    public void case95() {
        String[] commands = { "backward 962", "left 3", "left 4", "forward 745", "right 4" };
        assertEquals(240.3605565819022, turtlespy.maxDistance(commands), DELTA * 240.3605565819022);
    }

    @Test
    public void case96() {
        String[] commands = { "backward 632", "right 4", "right 3", "right 6", "right 5", "left 4", "left 5", "right 5", "forward 292", "left 4", "right 4", "right 7" };
        assertEquals(422.7294411568761, turtlespy.maxDistance(commands), DELTA * 422.7294411568761);
    }

    @Test
    public void case97() {
        String[] commands = { "left 5", "right 3", "left 4", "left 6", "left 7", "right 4", "left 5", "right 3", "left 5", "right 6", "right 5", "right 5", "left 3", "right 6", "left 6", "right 7", "left 4", "left 4", "right 4", "right 5", "left 4", "left 5", "right 7", "left 3", "left 3", "right 5", "left 7", "backward 902", "right 6", "left 4", "right 4", "forward 779", "left 3", "left 4", "right 4", "right 7", "right 3" };
        assertEquals(1128.5164943918871, turtlespy.maxDistance(commands), DELTA * 1128.5164943918871);
    }

    @Test
    public void case98() {
        String[] commands = { "right 7", "right 3", "right 3", "right 3", "left 21", "left 7", "left 3", "right 21", "right 3", "right 7", "left 7", "right 21", "left 21", "left 3", "right 49", "left 3", "backward 229", "left 7", "left 3", "left 21", "forward 344", "right 7", "left 49", "right 49", "right 3" };
        assertEquals(572.6650078768004, turtlespy.maxDistance(commands), DELTA * 572.6650078768004);
    }

    @Test
    public void case99() {
        String[] commands = { "backward 937", "left 21", "forward 883", "right 3", "left 3", "left 49", "left 3", "left 7", "left 7", "right 7" };
        assertEquals(1287.5006796114712, turtlespy.maxDistance(commands), DELTA * 1287.5006796114712);
    }

    @Test
    public void case100() {
        String[] commands = { "left 49", "right 49", "left 3", "right 7", "left 49", "right 3", "left 21", "right 49", "left 7", "right 21", "left 21", "right 49", "left 3", "left 3", "right 7", "left 49", "left 49", "right 7", "left 7", "left 7", "right 7", "backward 609", "left 21", "forward 453", "right 3", "right 7", "left 49", "left 21", "right 3" };
        assertEquals(1062.0, turtlespy.maxDistance(commands), DELTA * 1062.0);
    }

    @Test
    public void case101() {
        String[] commands = { "forward 742" };
        assertEquals(742.0, turtlespy.maxDistance(commands), DELTA * 742.0);
    }

    @Test
    public void case102() {
        String[] commands = { "right 49", "right 49", "left 21", "right 7", "right 49", "left 49", "right 49", "right 21", "right 3", "right 49", "backward 785", "right 49", "left 21", "right 7", "left 21", "right 49", "left 3", "right 21", "right 49", "forward 118", "left 21", "left 49", "left 21" };
        assertEquals(902.9843763901306, turtlespy.maxDistance(commands), DELTA * 902.9843763901306);
    }

    @Test
    public void case103() {
        String[] commands = { "left 7", "left 3", "forward 474", "right 49", "right 21", "right 21", "right 3", "backward 429" };
        assertEquals(661.1251014898359, turtlespy.maxDistance(commands), DELTA * 661.1251014898359);
    }

    @Test
    public void case104() {
        String[] commands = { "left 21", "backward 591", "right 7", "right 3", "right 7", "left 21", "right 49", "right 21", "left 3", "left 3", "left 3", "right 49", "left 3", "right 21", "right 21", "right 7", "right 21", "right 21", "left 49", "left 3", "right 21", "right 21", "left 21", "forward 15", "left 3", "left 49" };
        assertEquals(606.0, turtlespy.maxDistance(commands), DELTA * 606.0);
    }

    @Test
    public void case105() {
        String[] commands = { "right 49", "forward 709", "right 7", "left 3", "left 21", "right 21", "left 7", "left 7", "left 7", "left 49", "backward 578", "left 7", "left 3", "left 49", "left 3", "right 21", "right 7", "left 21", "right 3", "right 7", "right 21", "right 49", "left 21", "left 49", "left 49" };
        assertEquals(1286.9515027152186, turtlespy.maxDistance(commands), DELTA * 1286.9515027152186);
    }

    @Test
    public void case106() {
        String[] commands = { "right 7", "right 49", "right 3", "left 21", "backward 661", "left 21", "left 49", "forward 714", "left 7", "left 3", "left 49", "right 7" };
        assertEquals(1328.2188474928978, turtlespy.maxDistance(commands), DELTA * 1328.2188474928978);
    }

    @Test
    public void case107() {
        String[] commands = { "backward 481", "forward 149", "right 49", "left 3", "right 3", "right 3", "right 49", "left 49", "left 49", "left 7", "right 21" };
        assertEquals(579.4629403453565, turtlespy.maxDistance(commands), DELTA * 579.4629403453565);
    }

    @Test
    public void case108() {
        String[] commands = { "left 19", "forward 854", "backward 533" };
        assertEquals(390.69032166551534, turtlespy.maxDistance(commands), DELTA * 390.69032166551534);
    }

    @Test
    public void case109() {
        String[] commands = { "left 190", "right 190", "right 38", "right 19", "left 57", "left 38", "left 57", "left 38", "left 190", "right 38", "right 19", "left 57", "right 190", "left 19", "left 38", "left 38", "left 190", "left 19", "left 38", "left 38", "right 38", "right 190", "right 38", "right 57", "right 57", "right 190", "left 57", "right 57", "right 19", "right 57", "backward 85", "right 57", "right 38", "right 57", "right 38", "left 190", "left 57", "right 38", "forward 300", "right 57", "left 190", "left 19", "left 19", "right 57", "left 19", "left 57", "left 19" };
        assertEquals(384.74787797033923, turtlespy.maxDistance(commands), DELTA * 384.74787797033923);
    }

    @Test
    public void case110() {
        String[] commands = { "left 38", "backward 158", "right 19", "right 19", "right 57", "forward 619", "right 19", "right 190", "left 38" };
        assertEquals(775.4487669561229, turtlespy.maxDistance(commands), DELTA * 775.4487669561229);
    }

    @Test
    public void case111() {
        String[] commands = { "right 38", "left 19", "left 19", "backward 13", "right 19", "right 57", "left 57", "left 57", "right 19", "right 190", "right 38", "right 190", "left 190", "right 57", "right 190", "right 38", "left 190", "left 38", "left 19", "right 19", "forward 101" };
        assertEquals(113.88785689666551, turtlespy.maxDistance(commands), DELTA * 113.88785689666551);
    }

    @Test
    public void case112() {
        String[] commands = { "left 57", "left 190", "right 190", "left 19", "forward 799", "right 57", "right 57", "right 190", "right 19", "backward 294" };
        assertEquals(1090.35078514746, turtlespy.maxDistance(commands), DELTA * 1090.35078514746);
    }

    @Test
    public void case113() {
        String[] commands = { "left 17", "left 51", "left 68", "left 34", "left 68", "left 51", "left 68", "left 85", "left 34", "left 34", "left 17", "left 17", "left 34", "left 51", "left 51", "left 68", "left 51", "left 85", "left 34", "left 68", "left 68", "left 51", "left 51", "backward 576", "left 68", "forward 437" };
        assertEquals(1012.9621543208864, turtlespy.maxDistance(commands), DELTA * 1012.9621543208864);
    }

    @Test
    public void case114() {
        String[] commands = { "left 85", "left 34", "left 51", "left 51", "left 68", "left 68", "left 17", "left 51", "left 68", "left 51", "forward 744", "backward 916", "left 68", "left 51", "left 17", "left 51", "left 34", "left 34", "left 68", "left 34", "left 85", "left 17", "left 85", "left 34", "left 34", "left 51", "left 17" };
        assertEquals(1659.9374708945281, turtlespy.maxDistance(commands), DELTA * 1659.9374708945281);
    }

    @Test
    public void case115() {
        String[] commands = { "forward 817", "backward 143" };
        assertEquals(674.0, turtlespy.maxDistance(commands), DELTA * 674.0);
    }

    @Test
    public void case116() {
        String[] commands = { "left 34", "left 34", "left 51", "left 85", "left 34", "left 68", "left 85", "left 51", "left 68", "left 17", "forward 923", "left 17", "left 34", "left 85", "left 68", "left 68", "left 51", "left 34", "left 85", "left 17", "left 85", "left 85", "left 68", "left 85", "left 17", "left 85", "left 85", "left 51", "left 85", "backward 390" };
        assertEquals(1312.9582436813794, turtlespy.maxDistance(commands), DELTA * 1312.9582436813794);
    }

    @Test
    public void case117() {
        String[] commands = { "left 51", "left 85", "left 85", "left 51", "left 68", "left 51", "left 51", "left 17", "left 17", "left 68", "left 68", "left 85", "left 85", "backward 667", "left 17", "forward 434", "left 34" };
        assertEquals(1100.3593468872916, turtlespy.maxDistance(commands), DELTA * 1100.3593468872916);
    }

    @Test
    public void case118() {
        String[] commands = { "left 34", "left 17", "left 51", "left 68", "left 68", "left 68", "left 68", "left 17", "left 34", "left 34", "left 85", "left 51", "left 68", "forward 768", "backward 345", "left 51", "left 51", "left 17", "left 17" };
        assertEquals(1112.419948361987, turtlespy.maxDistance(commands), DELTA * 1112.419948361987);
    }

    @Test
    public void case119() {
        String[] commands = { "left 51", "left 51", "left 34", "left 34", "left 17", "left 68", "left 85", "left 85", "left 68", "left 68", "backward 350", "left 17", "left 51", "left 85", "left 17", "left 34", "left 34", "left 51", "left 51", "left 51", "left 51", "left 51", "left 85", "left 51", "left 34", "left 17", "left 34", "left 17", "left 34", "forward 158" };
        assertEquals(507.98342008799546, turtlespy.maxDistance(commands), DELTA * 507.98342008799546);
    }

    @Test
    public void case120() {
        String[] commands = { "left 51", "left 34", "left 68", "left 85", "left 68", "left 68", "left 34", "left 68", "left 85", "backward 4", "left 68", "left 68", "left 68", "left 51", "left 17", "left 34", "left 51", "left 85", "left 68", "left 85", "left 85", "left 34", "left 34", "left 17", "left 68", "left 34", "left 51", "left 17", "left 85", "left 34", "left 85", "left 85", "left 34", "forward 967", "left 68", "left 34", "left 34", "left 34", "left 68" };
        assertEquals(970.9993932900936, turtlespy.maxDistance(commands), DELTA * 970.9993932900936);
    }

    @Test
    public void case121() {
        String[] commands = { "left 85", "left 68", "left 34", "left 68", "left 85", "left 68", "left 51", "left 51", "left 34", "left 51", "left 85", "left 34", "left 85", "left 34", "left 34", "left 85", "left 51", "left 34", "left 68", "left 17", "left 68", "left 34", "left 17", "left 51", "left 68", "left 68", "backward 679", "left 34", "left 17", "left 85", "left 85", "forward 134", "left 17" };
        assertEquals(812.9829547924106, turtlespy.maxDistance(commands), DELTA * 812.9829547924106);
    }

    @Test
    public void case122() {
        String[] commands = { "left 68", "left 51", "left 17", "left 34", "left 51", "left 68", "left 85", "left 68", "left 17", "left 51", "left 85", "left 51", "forward 49", "left 17", "left 17", "left 85", "left 85", "left 85", "left 17", "left 85", "left 51", "left 85", "left 68", "backward 905", "left 34", "left 68", "left 51", "left 17", "left 34", "left 17", "left 51", "left 34", "left 34", "left 51", "left 17", "left 17", "left 34", "left 17", "left 85", "left 17", "left 51", "left 85", "left 34", "left 34" };
        assertEquals(953.992920352882, turtlespy.maxDistance(commands), DELTA * 953.992920352882);
    }

    @Test
    public void case123() {
        String[] commands = { "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000" };
        assertEquals(50000.0, turtlespy.maxDistance(commands), DELTA * 50000.0);
    }

    @Test
    public void case124() {
        String[] commands = { "forward 20", "backward 10" };
        assertEquals(10.0, turtlespy.maxDistance(commands), DELTA * 10.0);
    }

    @Test
    public void case125() {
        String[] commands = { "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "backward 1", "left 38" };
        assertEquals(47999.21199319478, turtlespy.maxDistance(commands), DELTA * 47999.21199319478);
    }

    @Test
    public void case126() {
        String[] commands = { "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "right 80", "backward 1000" };
        assertEquals(47836.48999397818, turtlespy.maxDistance(commands), DELTA * 47836.48999397818);
    }

    @Test
    public void case127() {
        String[] commands = { "forward 1", "backward 1", "right 47", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179", "right 179" };
        assertEquals(2.0, turtlespy.maxDistance(commands), DELTA * 2.0);
    }

    @Test
    public void case128() {
        String[] commands = { "forward 992", "backward 292", "right 1", "left 175", "left 175", "left 1", "left 175", "left 175", "right 1", "left 175", "left 175", "left 175", "left 175", "right 1", "left 175", "left 175", "left 175", "left 175", "left 175", "left 175", "right 1", "left 175", "left 175", "left 175", "left 175", "right 1", "left 175", "left 175", "left 175", "right 1", "left 175", "left 175", "left 175", "left 175", "left 175", "left 175", "left 175", "left 175", "left 175", "left 175", "forward 993", "backward 20", "left 175", "left 175", "left 175", "left 175", "left 175", "right 1", "forward 331", "backward 1" };
        assertEquals(2629.0, turtlespy.maxDistance(commands), DELTA * 2629.0);
    }

    @Test
    public void case129() {
        String[] commands = { "forward 100", "backward 100", "left 270" };
        assertEquals(141.4213562373095, turtlespy.maxDistance(commands), DELTA * 141.4213562373095);
    }

    @Test
    public void case130() {
        String[] commands = { "left 190", "right 322", "right 37", "right 318", "left 82", "right 211", "backward 346", "right 323", "forward 286", "backward 45", "backward 311" };
        assertEquals(987.8762018818734, turtlespy.maxDistance(commands), DELTA * 987.8762018818734);
    }

    @Test
    public void case131() {
        String[] commands = { "forward 533", "forward 779", "backward 817", "forward 737", "backward 748", "forward 393", "forward 637", "backward 700", "forward 750", "forward 911", "backward 677", "backward 801", "forward 750", "forward 692", "backward 330", "backward 20", "backward 768", "backward 675", "forward 800", "backward 154", "backward 971", "forward 129", "backward 562", "backward 943", "backward 931", "backward 294", "forward 97", "backward 379", "forward 762", "forward 958", "forward 533", "backward 838", "forward 44", "backward 44", "backward 592", "backward 526", "backward 499", "backward 723", "backward 21", "forward 738", "backward 421", "forward 105", "forward 496", "forward 311", "forward 853", "right 359", "right 359", "left 359", "right 359", "left 359" };
        assertEquals(1573.4136442306071, turtlespy.maxDistance(commands), DELTA * 1573.4136442306071);
    }

    @Test
    public void case132() {
        String[] commands = { "forward 10", "backward 10", "left 300", "right 300" };
        assertEquals(9.999999999999998, turtlespy.maxDistance(commands), DELTA * 9.999999999999998);
    }

    @Test
    public void case133() {
        String[] commands = { "forward 100", "backward 100", "left 210", "right 30", "right 15" };
        assertEquals(200.0, turtlespy.maxDistance(commands), DELTA * 200.0);
    }

    @Test
    public void case134() {
        String[] commands = { "forward 100", "backward 100", "left 90", "right 270" };
        assertEquals(200.0, turtlespy.maxDistance(commands), DELTA * 200.0);
    }

    @Test
    public void case135() {
        String[] commands = { "forward 1", "backward 1000", "left 36", "right 45", "left 36", "right 68", "left 89", "forward 79", "backward 32", "left 99", "right 199", "left 187", "right 99", "forward 996", "left 56", "backward 569", "left 34", "right 359", "forward 23", "right 229", "left 299", "backward 54", "right 58", "right 88", "forward 987", "backward 985", "right 90", "left 211" };
        assertEquals(4726.0, turtlespy.maxDistance(commands), DELTA * 4726.0);
    }

    @Test
    public void case136() {
        String[] commands = { "left 3", "left 6", "left 8", "right 190", "right 185", "right 182", "forward 1000", "backward 40" };
        assertEquals(1040.0, turtlespy.maxDistance(commands), DELTA * 1040.0);
    }

    @Test
    public void case137() {
        String[] commands = { "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "right 90", "backward 1000" };
        assertEquals(48010.41553663122, turtlespy.maxDistance(commands), DELTA * 48010.41553663122);
    }

    @Test
    public void case138() {
        String[] commands = { "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "backward 1000", "left 90" };
        assertEquals(48010.41553663122, turtlespy.maxDistance(commands), DELTA * 48010.41553663122);
    }

    @Test
    public void case139() {
        String[] commands = { "right 3", "left 355", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "right 4", "forward 50", "backward 40", "forward 50", "backward 40" };
        assertEquals(180.0, turtlespy.maxDistance(commands), DELTA * 180.0);
    }

    @Test
    public void case140() {
        String[] commands = { "forward 1000", "left 90", "left 90", "left 90", "backward 1000" };
        assertEquals(2000.0, turtlespy.maxDistance(commands), DELTA * 2000.0);
    }

    @Test
    public void case141() {
        String[] commands = { "right 100", "right 40", "forward 100", "backward 70" };
        assertEquals(160.07692589397664, turtlespy.maxDistance(commands), DELTA * 160.07692589397664);
    }

    @Test
    public void case142() {
        String[] commands = { "right 259", "backward 428", "left 139", "right 204", "left 255", "forward 193", "backward 250" };
        assertEquals(868.7146064302816, turtlespy.maxDistance(commands), DELTA * 868.7146064302816);
    }

    @Test
    public void case143() {
        String[] commands = { "left 270", "left 270", "left 270", "forward 1", "backward 1" };
        assertEquals(2.0, turtlespy.maxDistance(commands), DELTA * 2.0);
    }

    @Test
    public void case144() {
        String[] commands = { "forward 100", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "backward 100" };
        assertEquals(193.18516525781368, turtlespy.maxDistance(commands), DELTA * 193.18516525781368);
    }

    @Test
    public void case145() {
        String[] commands = { "left 50", "right 50", "left 50", "right 50", "left 50", "right 50", "left 50", "right 50", "left 50", "right 60", "left 60", "right 60", "left 60", "right 300", "left 200", "right 200", "left 300", "right 150", "left 150", "right 100", "left 100", "right 100", "left 100", "left 100", "right 50", "left 50", "right 50", "left 50", "right 30", "left 30", "right 30", "left 1", "right 1", "left 1", "right 1", "left 1", "right 1", "left 1", "right 1", "left 1", "right 1" };
        assertEquals(0.0, turtlespy.maxDistance(commands), DELTA);
    }

    @Test
    public void case146() {
        String[] commands = { "forward 1", "left 180", "left 1", "left 2", "backward 1" };
        assertEquals(2.0, turtlespy.maxDistance(commands), DELTA * 2.0);
    }

    @Test
    public void case147() {
        String[] commands = { "right 252", "right 252", "right 252", "right 252", "right 252", "forward 50", "backward 40" };
        assertEquals(90.0, turtlespy.maxDistance(commands), DELTA * 90.0);
    }

    @Test
    public void case148() {
        String[] commands = { "forward 100", "backward 100", "left 90", "right 270", "left 10", "left 10" };
        assertEquals(200.0, turtlespy.maxDistance(commands), DELTA * 200.0);
    }

    @Test
    public void case149() {
        String[] commands = { "forward 2", "backward 1" };
        assertEquals(1.0, turtlespy.maxDistance(commands), DELTA * 1.0);
    }

    @Test
    public void case150() {
        String[] commands = { "backward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000" };
        assertEquals(48000.0, turtlespy.maxDistance(commands), DELTA * 48000.0);
    }

    @Test
    public void case151() {
        String[] commands = { "left 45", "left 45", "right 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "left 45", "forward 1" };
        assertEquals(1.0, turtlespy.maxDistance(commands), DELTA * 1.0);
    }

    @Test
    public void case152() {
        String[] commands = { "forward 100", "backward 200", "left 270", "right 90", "left 45" };
        assertEquals(300.0, turtlespy.maxDistance(commands), DELTA * 300.0);
    }

    @Test
    public void case153() {
        String[] commands = { "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "backward 1000", "right 90" };
        assertEquals(48010.41553663122, turtlespy.maxDistance(commands), DELTA * 48010.41553663122);
    }

    @Test
    public void case154() {
        String[] commands = { "forward 10", "backward 100" };
        assertEquals(90.0, turtlespy.maxDistance(commands), DELTA * 90.0);
    }

    @Test
    public void case155() {
        String[] commands = { "left 270", "right 90", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "right 1", "forward 1000", "backward 1000", "forward 1000", "backward 1000", "forward 1000", "backward 1000", "forward 1000", "backward 1000", "forward 1000", "backward 1000" };
        assertEquals(10000.0, turtlespy.maxDistance(commands), DELTA * 10000.0);
    }

    @Test
    public void case156() {
        String[] commands = { "forward 10", "right 135", "backward 100" };
        assertEquals(107.30430355942438, turtlespy.maxDistance(commands), DELTA * 107.30430355942438);
    }

    @Test
    public void case157() {
        String[] commands = { "forward 100", "backward 100", "right 180", "right 180" };
        assertEquals(200.0, turtlespy.maxDistance(commands), DELTA * 200.0);
    }

    @Test
    public void case158() {
        String[] commands = { "forward 1000", "backward 1000", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350", "left 350" };
        assertEquals(2000.0, turtlespy.maxDistance(commands), DELTA * 2000.0);
    }

    @Test
    public void case159() {
        String[] commands = { "right 300", "left 30", "forward 200", "backward 200" };
        assertEquals(282.842712474619, turtlespy.maxDistance(commands), DELTA * 282.842712474619);
    }

    @Test
    public void case160() {
        String[] commands = { "backward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "left 22", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "right 118", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000" };
        assertEquals(47477.68240870519, turtlespy.maxDistance(commands), DELTA * 47477.68240870519);
    }

    @Test
    public void case161() {
        String[] commands = { "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "forward 1000", "backward 999", "right 27" };
        assertEquals(47112.067576197915, turtlespy.maxDistance(commands), DELTA * 47112.067576197915);
    }

    @Test
    public void case162() {
        String[] commands = { "backward 100" };
        assertEquals(100.0, turtlespy.maxDistance(commands), DELTA * 100.0);
    }

    @Test
    public void case163() {
        String[] commands = { "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000", "backward 1000" };
        assertEquals(50000.0, turtlespy.maxDistance(commands), DELTA * 50000.0);
    }

    @Test
    public void case164() {
        String[] commands = { "forward 5", "backward 8" };
        assertEquals(3.0, turtlespy.maxDistance(commands), DELTA * 3.0);
    }

    @Test
    public void case165() {
        String[] commands = { "forward 50", "backward 50", "left 90", "left 90", "left 90", "left 90" };
        assertEquals(100.0, turtlespy.maxDistance(commands), DELTA * 100.0);
    }

    @Test
    public void case166() {
        String[] commands = { "forward 100", "backward 100", "left 300", "right 30", "right 40", "right 90" };
        assertEquals(200.0, turtlespy.maxDistance(commands), DELTA * 200.0);
    }

    @Test
    public void case167() {
        String[] commands = { "forward 50", "backward 50", "right 60", "right 60" };
        assertEquals(86.60254037844386, turtlespy.maxDistance(commands), DELTA * 86.60254037844386);
    }

    @Test
    public void case168() {
        String[] commands = { "forward 1", "backward 2" };
        assertEquals(1.0, turtlespy.maxDistance(commands), DELTA * 1.0);
    }

    @Test
    public void case169() {
        String[] commands = { "forward 1" };
        assertEquals(1.0, turtlespy.maxDistance(commands), DELTA * 1.0);
    }

    @Test
    public void case170() {
        String[] commands = { "forward 10", "backward 10", "right 270", "right 270" };
        assertEquals(20.0, turtlespy.maxDistance(commands), DELTA * 20.0);
    }

    @Test
    public void case171() {
        String[] commands = { "backward 1", "backward 1", "backward 1", "left 1", "left 1", "right 1", "right 1", "left 1", "left 1", "right 1", "left 1", "forward 1", "forward 5", "forward 4", "forward 4", "forward 5", "left 1", "left 1", "left 1", "left 1", "left 1", "left 1", "left 1", "left 1", "left 1", "forward 10", "forward 10", "backward 10", "backward 10", "backward 10", "forward 10", "forward 10", "left 1", "left 1", "left 1", "forward 1", "forward 10" };
        assertEquals(39.63422797848818, turtlespy.maxDistance(commands), DELTA * 39.63422797848818);
    }

    @Test
    public void case172() {
        String[] commands = { "forward 10", "backward 10", "left 179", "left 1" };
        assertEquals(20.0, turtlespy.maxDistance(commands), DELTA * 20.0);
    }

}
