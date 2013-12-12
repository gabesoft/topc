package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class InequalitiesTest {
    Inequalities inq = new Inequalities();

    @Test
    public void case1() {
        String[] inequalities = { "X <= 12", "X = 13", "X > 9", "X < 10", "X >= 14" };
        assertEquals(3, inq.maximumSubset(inequalities));
    }

    @Test
    public void case2() {
        String[] inequalities = { "X < 0", "X <= 0" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case3() {
        String[] inequalities = { "X = 1", "X = 2", "X = 3", "X > 0" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case4() {
        String[] inequalities = { "X <= 521", "X >= 521", "X = 521", "X > 902", "X > 12", "X <= 1000" };
        assertEquals(5, inq.maximumSubset(inequalities));
    }

    @Test
    public void case5() {
        String[] inequalities = { "X = 0" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case6() {
        String[] inequalities = { "X > 1000", "X > 998", "X > 0" };
        assertEquals(3, inq.maximumSubset(inequalities));
    }

    @Test
    public void case7() {
        String[] inequalities = { "X < 10", "X >= 10" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case8() {
        String[] inequalities = { "X <= 10", "X >= 10" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case9() {
        String[] inequalities = { "X >= 7", "X > 7", "X > 8", "X > 9", "X < 11", "X >= 8" };
        assertEquals(6, inq.maximumSubset(inequalities));
    }

    @Test
    public void case10() {
        String[] inequalities = { "X >= 999", "X < 1000", "X <= 1000", "X <= 51", "X = 49", "X >= 0", "X > 13", "X < 666" };
        assertEquals(7, inq.maximumSubset(inequalities));
    }

    @Test
    public void case11() {
        String[] inequalities = { "X <= 368", "X = 828", "X = 852", "X < 823", "X = 514", "X <= 378", "X <= 939", "X < 87", "X > 655", "X < 851", "X = 101", "X > 483", "X < 350", "X > 447", "X <= 616" };
        assertEquals(8, inq.maximumSubset(inequalities));
    }

    @Test
    public void case12() {
        String[] inequalities = { "X > 532", "X >= 27", "X = 779", "X > 92", "X > 151", "X <= 314", "X <= 73", "X < 290", "X < 172", "X = 374", "X <= 141", "X >= 199" };
        assertEquals(6, inq.maximumSubset(inequalities));
    }

    @Test
    public void case13() {
        String[] inequalities = { "X = 0", "X < 6", "X <= 7", "X > 9", "X >= 4", "X > 8", "X >= 0", "X >= 1", "X < 5", "X = 1", "X < 8", "X = 5", "X < 7", "X > 3", "X >= 7", "X >= 5", "X >= 2", "X < 0", "X <= 3", "X > 2", "X > 0", "X <= 6", "X <= 9", "X >= 6", "X < 4", "X >= 3", "X = 7", "X = 8", "X < 2", "X <= 5" };
        assertEquals(17, inq.maximumSubset(inequalities));
    }

    @Test
    public void case14() {
        String[] inequalities = { "X = 3", "X > 1", "X < 5", "X <= 0", "X > 5", "X = 9", "X <= 6", "X >= 5", "X < 8", "X < 4", "X >= 4", "X <= 1", "X <= 8", "X < 9", "X = 7", "X > 3", "X <= 3", "X > 2", "X <= 7", "X <= 9", "X >= 6", "X >= 0", "X <= 2", "X = 1", "X < 2", "X <= 4", "X < 0", "X > 4", "X <= 5", "X = 4", "X > 0", "X = 5", "X < 7", "X = 0", "X >= 7", "X < 6", "X > 9", "X > 8", "X = 6", "X > 7", "X > 6", "X = 8", "X >= 1", "X >= 3", "X >= 8", "X < 3", "X < 1", "X = 2", "X >= 2", "X >= 9" };
        assertEquals(21, inq.maximumSubset(inequalities));
    }

    @Test
    public void case15() {
        String[] inequalities = { "X <= 613", "X <= 335", "X >= 474", "X < 415", "X < 267", "X < 470", "X = 741", "X >= 230", "X >= 539", "X = 375", "X = 468", "X < 204", "X > 517", "X >= 705", "X = 345", "X >= 372", "X >= 512", "X >= 202", "X < 675", "X < 319" };
        assertEquals(9, inq.maximumSubset(inequalities));
    }

    @Test
    public void case16() {
        String[] inequalities = { "X < 691", "X = 719", "X < 732", "X = 636", "X <= 645", "X > 567", "X = 617", "X = 680", "X > 592", "X <= 611", "X > 615", "X = 614", "X < 724", "X >= 666", "X < 566", "X < 674", "X >= 719", "X <= 664", "X < 696", "X = 688", "X = 650" };
        assertEquals(11, inq.maximumSubset(inequalities));
    }

    @Test
    public void case17() {
        String[] inequalities = { "X <= 850", "X > 207", "X = 612", "X = 338", "X > 785", "X = 267", "X >= 960", "X > 209", "X > 11", "X <= 474", "X <= 276", "X <= 399", "X > 258", "X <= 213", "X = 642", "X = 399", "X <= 872", "X < 211", "X = 649", "X > 546", "X < 75", "X = 691", "X >= 142", "X >= 693", "X < 353", "X >= 887" };
        assertEquals(12, inq.maximumSubset(inequalities));
    }

    @Test
    public void case18() {
        String[] inequalities = { "X <= 412", "X <= 258", "X < 399", "X = 511", "X < 772", "X <= 411", "X > 176", "X = 255", "X < 560", "X < 534", "X = 821", "X < 921", "X <= 618", "X = 595", "X > 359", "X <= 907", "X < 460", "X < 546", "X >= 917", "X = 131", "X < 592", "X >= 634", "X <= 190", "X = 870", "X = 353", "X > 910", "X = 23", "X >= 144", "X < 10", "X < 455", "X >= 65", "X = 635", "X > 255", "X = 609", "X >= 262", "X >= 787" };
        assertEquals(19, inq.maximumSubset(inequalities));
    }

    @Test
    public void case19() {
        String[] inequalities = { "X >= 972", "X >= 5", "X >= 263", "X = 873", "X >= 900", "X < 511", "X >= 863", "X > 717", "X <= 436", "X < 829", "X <= 634", "X < 699", "X >= 193", "X >= 517", "X > 448", "X > 32", "X = 826", "X < 204", "X <= 253", "X < 435", "X < 928", "X = 878", "X > 408", "X > 688", "X >= 541", "X > 426", "X = 802", "X >= 630", "X > 618", "X > 51", "X <= 428", "X < 110", "X < 500", "X <= 527", "X = 950", "X < 430", "X = 191", "X = 325", "X >= 342", "X >= 742", "X <= 341" };
        assertEquals(19, inq.maximumSubset(inequalities));
    }

    @Test
    public void case20() {
        String[] inequalities = { "X < 8", "X > 665", "X < 161", "X = 461", "X > 602", "X > 743", "X > 403", "X < 669", "X <= 799", "X >= 156", "X > 109", "X > 499", "X > 913", "X >= 81", "X < 425", "X <= 35", "X > 65", "X <= 893", "X <= 120", "X < 793", "X >= 275", "X >= 955", "X < 383", "X <= 847", "X > 902", "X <= 933", "X >= 543", "X = 742", "X > 178", "X >= 715", "X > 520", "X <= 66", "X = 580", "X < 232", "X < 5", "X >= 80", "X >= 71", "X > 765", "X > 350", "X >= 203", "X <= 385", "X < 684", "X = 459", "X >= 561", "X < 991", "X > 325", "X >= 812", "X >= 929", "X < 759" };
        assertEquals(27, inq.maximumSubset(inequalities));
    }

    @Test
    public void case21() {
        String[] inequalities = { "X < 920", "X > 916", "X > 961", "X <= 957", "X >= 966", "X = 980", "X >= 932", "X > 990", "X < 977", "X > 912", "X >= 925", "X = 941", "X >= 973", "X < 909", "X = 921", "X < 943", "X >= 934", "X < 914", "X >= 922", "X = 957", "X >= 976", "X > 941", "X = 960", "X <= 960", "X <= 955", "X < 971", "X >= 936", "X = 956", "X > 935", "X < 941", "X >= 996", "X < 957", "X > 931", "X < 968", "X = 939", "X < 997", "X >= 961", "X > 997", "X = 915", "X = 935", "X < 972", "X <= 918", "X <= 961", "X >= 983", "X >= 953", "X < 967", "X >= 915", "X < 958", "X > 959", "X = 914" };
        assertEquals(25, inq.maximumSubset(inequalities));
    }

    @Test
    public void case22() {
        String[] inequalities = { "X <= 98", "X <= 11", "X > 72", "X > 35", "X > 75", "X <= 86", "X < 30", "X < 0", "X > 44", "X > 60", "X = 1", "X > 68", "X > 36", "X < 94", "X > 17", "X <= 97", "X > 89", "X > 58", "X <= 72", "X > 98", "X >= 65", "X > 65", "X >= 55", "X <= 92", "X > 63", "X <= 21", "X < 72", "X <= 14", "X <= 61", "X > 96", "X > 32", "X > 61", "X > 74", "X < 69", "X < 12", "X = 80", "X > 31", "X > 38", "X > 16", "X > 8", "X > 33", "X >= 53", "X >= 1", "X > 52", "X = 75", "X < 75", "X > 73", "X <= 8", "X > 43", "X > 93" };
        assertEquals(32, inq.maximumSubset(inequalities));
    }

    @Test
    public void case23() {
        String[] inequalities = { "X > 728", "X = 869", "X > 310", "X = 682", "X > 812", "X > 319", "X > 268", "X > 590", "X > 727", "X > 132", "X > 490", "X > 112", "X <= 142", "X > 607", "X > 297", "X > 798", "X > 888", "X > 969", "X > 929", "X > 343", "X > 813", "X > 626", "X > 106", "X > 83", "X > 902", "X > 494", "X > 852", "X > 253", "X > 859", "X > 700", "X > 876", "X > 452", "X = 606", "X > 269", "X <= 470", "X > 241", "X > 309", "X > 726", "X > 609", "X > 111", "X > 340", "X > 912", "X > 74", "X > 264", "X <= 739", "X > 212", "X > 697", "X > 766", "X > 835", "X > 725" };
        assertEquals(44, inq.maximumSubset(inequalities));
    }

    @Test
    public void case24() {
        String[] inequalities = { "X <= 849", "X <= 667", "X <= 962", "X <= 481", "X <= 927", "X <= 563", "X <= 171", "X <= 96", "X <= 151", "X <= 223", "X <= 583", "X <= 412", "X <= 77", "X <= 911", "X <= 368", "X <= 431", "X <= 842", "X <= 912", "X <= 798", "X <= 969", "X <= 400", "X <= 914", "X <= 373", "X <= 78", "X <= 90", "X <= 33", "X <= 641", "X <= 432", "X < 636", "X <= 160", "X < 0", "X >= 1" };
        assertEquals(31, inq.maximumSubset(inequalities));
    }

    @Test
    public void case25() {
        String[] inequalities = { "X < 664", "X = 328", "X = 337", "X = 545", "X < 783", "X = 115", "X = 577", "X = 644", "X = 218", "X < 409", "X < 728", "X = 29", "X = 140", "X = 223", "X < 51", "X = 197", "X < 237", "X = 693", "X = 869", "X = 249", "X = 457", "X = 936", "X = 515", "X = 377", "X = 434", "X = 265", "X = 116", "X = 338", "X = 355", "X = 287", "X = 251", "X = 798", "X = 827", "X = 36", "X = 325", "X = 101", "X < 461", "X < 730", "X = 476", "X = 283", "X = 132", "X = 141", "X < 454", "X = 745", "X = 66" };
        assertEquals(10, inq.maximumSubset(inequalities));
    }

    @Test
    public void case26() {
        String[] inequalities = { "X < 111", "X < 149", "X < 130", "X > 4", "X < 198", "X < 23", "X < 66", "X < 176", "X < 16", "X > 120", "X < 75", "X > 28", "X < 157", "X > 6", "X > 148", "X > 186", "X > 88", "X < 96", "X < 89", "X > 191", "X > 101", "X < 169", "X < 62", "X < 142", "X < 54", "X > 21", "X < 10", "X < 100", "X < 52", "X < 137", "X > 143", "X < 172", "X < 569", "X < 117", "X < 12", "X < 59", "X < 171", "X > 53", "X > 197", "X < 20", "X > 119", "X < 42" };
        assertEquals(30, inq.maximumSubset(inequalities));
    }

    @Test
    public void case27() {
        String[] inequalities = { "X < 176", "X = 27", "X < 223", "X < 74", "X = 201", "X >= 106", "X = 182", "X = 62", "X >= 256", "X < 291", "X <= 172", "X > 184", "X > 180", "X >= 122", "X < 155", "X > 27", "X = 248", "X < 75", "X > 37", "X > 45", "X = 106", "X >= 261", "X >= 296", "X < 207", "X > 120", "X > 222", "X = 155", "X > 288", "X >= 96", "X >= 185", "X >= 300", "X <= 39", "X >= 249", "X <= 195", "X < 162", "X > 1", "X > 2", "X > 3", "X <= 402" };
        assertEquals(21, inq.maximumSubset(inequalities));
    }

    @Test
    public void case28() {
        String[] inequalities = { "X > 994", "X > 995", "X > 996", "X > 997", "X > 998", "X > 999", "X > 1000", "X <= 532", "X < 999" };
        assertEquals(7, inq.maximumSubset(inequalities));
    }

    @Test
    public void case29() {
        String[] inequalities = { "X > 5", "X > 6", "X > 7", "X > 8", "X > 9", "X > 10", "X >= 10", "X > 11", "X > 12", "X < 90", "X < 89", "X < 88", "X < 80", "X < 21", "X < 60", "X < 61", "X < 62", "X < 63", "X < 70", "X > 80", "X > 251" };
        assertEquals(19, inq.maximumSubset(inequalities));
    }

    @Test
    public void case30() {
        String[] inequalities = { "X < 50", "X < 49", "X < 51", "X < 52", "X < 53", "X < 54", "X < 55", "X < 56", "X < 57", "X < 58", "X < 59", "X < 60", "X <= 60", "X >= 55", "X > 123", "X > 124", "X > 125", "X > 127", "X > 126", "X > 133", "X > 128", "X > 129", "X = 212", "X = 213", "X = 214", "X <= 666", "X = 0" };
        assertEquals(15, inq.maximumSubset(inequalities));
    }

    @Test
    public void case31() {
        String[] inequalities = { "X < 5", "X < 6", "X < 7", "X < 8", "X < 9", "X < 10", "X <= 10", "X < 11", "X < 12", "X > 90", "X > 89", "X > 88", "X > 80", "X > 21", "X > 60", "X > 61", "X > 62", "X > 63", "X > 70", "X < 80", "X < 251" };
        assertEquals(11, inq.maximumSubset(inequalities));
    }

    @Test
    public void case32() {
        String[] inequalities = { "X <= 242", "X < 27", "X > 80", "X <= 213", "X >= 32", "X < 211", "X >= 237", "X < 171", "X > 23", "X = 43", "X > 200", "X >= 172", "X = 197", "X >= 45", "X >= 112", "X <= 204", "X < 183", "X = 217", "X <= 187", "X <= 29", "X = 152", "X <= 110", "X >= 188", "X <= 157", "X <= 143", "X <= 235", "X >= 150", "X <= 229", "X = 242", "X < 199", "X < 179", "X > 65", "X < 48", "X >= 75", "X <= 230", "X <= 121", "X > 44", "X >= 110", "X < 231", "X > 243", "X < 73", "X = 54", "X > 240", "X = 211", "X > 250", "X = 147", "X >= 54", "X < 139" };
        assertEquals(27, inq.maximumSubset(inequalities));
    }

    @Test
    public void case33() {
        String[] inequalities = { "X < 430", "X = 288", "X > 367", "X >= 371", "X = 152", "X > 318", "X >= 228", "X > 507", "X < 494", "X < 551", "X < 245", "X <= 451", "X > 475", "X = 564", "X > 175", "X <= 438", "X > 394", "X > 482", "X >= 385", "X = 261", "X <= 491", "X <= 430", "X < 404", "X = 216", "X >= 559", "X < 515", "X <= 429", "X >= 368", "X > 409", "X > 256", "X = 310", "X >= 219", "X = 263", "X > 202", "X > 185", "X <= 304", "X < 436", "X < 171", "X > 209", "X > 503", "X < 335", "X > 242", "X >= 367", "X < 439", "X >= 302", "X > 305" };
        assertEquals(29, inq.maximumSubset(inequalities));
    }

    @Test
    public void case34() {
        String[] inequalities = { "X = 213", "X = 383", "X <= 541", "X <= 209", "X <= 566", "X > 295", "X > 335", "X <= 476", "X <= 246", "X > 252", "X >= 158", "X <= 361", "X >= 363", "X < 253", "X >= 505", "X <= 244", "X < 387", "X >= 242", "X = 323", "X <= 425", "X > 336", "X > 182", "X > 457", "X = 234", "X < 427", "X > 143", "X >= 437", "X > 228", "X < 290", "X <= 562", "X <= 523", "X = 150", "X < 461", "X > 330", "X <= 296", "X = 255", "X >= 361", "X <= 223", "X >= 402", "X < 383", "X >= 171", "X < 363", "X = 389", "X > 209", "X = 495", "X < 437", "X > 230", "X <= 159", "X > 329", "X > 288" };
        assertEquals(29, inq.maximumSubset(inequalities));
    }

    @Test
    public void case35() {
        String[] inequalities = { "X <= 691", "X < 744", "X > 700", "X < 759", "X > 735", "X <= 709", "X > 751", "X <= 729", "X <= 700", "X > 771", "X > 727", "X < 768", "X <= 759", "X <= 745", "X > 731", "X <= 717", "X <= 753", "X < 693", "X >= 672", "X >= 761", "X > 729", "X > 767", "X < 716", "X > 770", "X >= 757", "X <= 680", "X <= 724", "X <= 721", "X > 703", "X <= 678", "X >= 744", "X > 746", "X >= 745", "X > 666", "X < 684", "X >= 669", "X <= 718", "X >= 723" };
        assertEquals(22, inq.maximumSubset(inequalities));
    }

    @Test
    public void case36() {
        String[] inequalities = { "X > 722", "X < 695", "X < 741", "X > 683", "X < 769", "X <= 705", "X < 714", "X <= 733", "X <= 671", "X > 730", "X <= 703", "X >= 748", "X > 668", "X <= 676", "X >= 752", "X < 707", "X >= 685", "X > 745", "X < 738", "X < 713", "X <= 752", "X < 701", "X <= 763", "X < 669", "X > 697", "X <= 706", "X <= 774", "X <= 728", "X >= 719", "X >= 670", "X <= 767", "X > 775", "X > 716", "X <= 770", "X < 698", "X > 714", "X < 689", "X <= 693", "X <= 756", "X <= 725", "X >= 743", "X > 767", "X <= 777", "X > 762", "X > 761", "X < 726", "X < 773", "X > 698", "X < 758", "X <= 702" };
        assertEquals(32, inq.maximumSubset(inequalities));
    }

    @Test
    public void case37() {
        String[] inequalities = { "X < 754", "X > 115", "X >= 39", "X <= 619", "X >= 399", "X <= 764", "X <= 432", "X > 498", "X < 246", "X > 850", "X >= 722", "X <= 340", "X >= 997", "X >= 811", "X < 669", "X > 685", "X > 199", "X >= 938", "X >= 529", "X < 123", "X >= 360", "X >= 643", "X >= 290", "X > 417", "X > 178", "X <= 808", "X > 95", "X <= 450", "X > 485", "X > 705", "X > 397", "X >= 62", "X >= 606", "X > 581", "X < 565", "X >= 597", "X < 425", "X <= 708", "X <= 15", "X >= 31", "X < 582", "X < 682", "X >= 213", "X > 925", "X > 595", "X < 920", "X > 980", "X >= 930", "X > 777", "X >= 408" };
        assertEquals(33, inq.maximumSubset(inequalities));
    }

    @Test
    public void case38() {
        String[] inequalities = { "X < 0", "X < 8", "X < 6", "X < 9", "X < 12", "X < 15", "X < 18", "X < 21", "X < 24", "X < 27", "X < 30", "X < 33", "X < 36", "X < 39", "X < 42", "X < 45", "X < 48", "X < 11", "X < 54", "X < 57", "X < 60", "X < 63", "X < 66", "X < 69", "X < 72", "X < 75", "X < 78", "X < 81", "X < 84", "X < 87", "X < 90", "X < 93", "X < 96", "X < 95", "X < 102", "X < 105", "X < 108", "X < 111", "X < 114", "X < 117", "X < 120", "X < 123", "X < 126", "X < 121", "X < 132", "X < 135", "X < 138", "X < 141", "X < 144", "X < 147" };
        assertEquals(50, inq.maximumSubset(inequalities));
    }

    @Test
    public void case39() {
        String[] inequalities = { "X >= 68", "X >= 70", "X > 72", "X >= 74", "X >= 76", "X > 78", "X > 80", "X > 82", "X > 84", "X >= 86", "X > 88", "X >= 90", "X >= 92", "X >= 94", "X >= 96", "X >= 98", "X > 100", "X > 102", "X > 104", "X >= 106", "X >= 108", "X > 110", "X > 112", "X > 114", "X > 116", "X > 118", "X >= 120", "X >= 122", "X >= 124", "X >= 126", "X > 128", "X >= 130", "X >= 132", "X > 134", "X >= 136", "X > 138", "X > 140", "X > 142", "X >= 144", "X >= 146", "X > 148", "X >= 150", "X >= 152", "X >= 154", "X > 156", "X > 158", "X > 160", "X > 162", "X >= 164", "X >= 166" };
        assertEquals(50, inq.maximumSubset(inequalities));
    }

    @Test
    public void case40() {
        String[] inequalities = { "X >= 0", "X < 3", "X < 6", "X < 9", "X < 12", "X < 15", "X < 18", "X < 21", "X < 24", "X > 27", "X <= 30", "X < 33", "X < 36", "X < 39", "X < 42", "X < 45", "X < 48", "X < 51", "X < 54", "X < 57", "X < 60", "X < 63", "X < 66", "X < 69", "X < 72", "X < 75", "X < 78", "X < 81", "X < 84", "X < 87", "X < 90", "X < 93", "X < 96", "X < 99", "X < 102", "X < 105", "X < 108", "X < 111", "X < 114", "X < 117", "X < 120", "X < 123", "X < 126", "X < 129", "X < 132", "X > 535", "X <= 138", "X <= 141", "X < 144", "X < 147" };
        assertEquals(48, inq.maximumSubset(inequalities));
    }

    @Test
    public void case41() {
        String[] inequalities = { "X = 1", "X = 2", "X = 3", "X > 0" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case42() {
        String[] inequalities = { "X > 1000" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case43() {
        String[] inequalities = { "X <= 12", "X = 13", "X > 9", "X < 10", "X >= 14" };
        assertEquals(3, inq.maximumSubset(inequalities));
    }

    @Test
    public void case44() {
        String[] inequalities = { "X <= 521", "X >= 521", "X = 521", "X > 902", "X > 12", "X <= 1000" };
        assertEquals(5, inq.maximumSubset(inequalities));
    }

    @Test
    public void case45() {
        String[] inequalities = { "X < 0", "X < 1", "X < 2", "X < 3", "X > 999", "X < 1000" };
        assertEquals(5, inq.maximumSubset(inequalities));
    }

    @Test
    public void case46() {
        String[] inequalities = { "X < 0", "X <= 0" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case47() {
        String[] inequalities = { "X > 0", "X > 1", "X < 2", "X < 3" };
        assertEquals(4, inq.maximumSubset(inequalities));
    }

    @Test
    public void case48() {
        String[] inequalities = { "X < 1", "X > 0" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case49() {
        String[] inequalities = { "X = 1", "X = 2", "X = 3", "X > 0", "X < 0" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case50() {
        String[] inequalities = { "X > 0", "X < 0" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case51() {
        String[] inequalities = { "X <= 4", "X > 4" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case52() {
        String[] inequalities = { "X > 1", "X < 2" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case53() {
        String[] inequalities = { "X = 1000" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case54() {
        String[] inequalities = { "X <= 521", "X >= 521", "X = 521", "X > 902", "X > 12", "X <= 1000", "X < 0", "X >= 100", "X >= 300", "X < 999", "X < 100" };
        assertEquals(8, inq.maximumSubset(inequalities));
    }

    @Test
    public void case55() {
        String[] inequalities = { "X < 1", "X < 0", "X < 2", "X < 3", "X < 4" };
        assertEquals(5, inq.maximumSubset(inequalities));
    }

    @Test
    public void case56() {
        String[] inequalities = { "X <= 0" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case57() {
        String[] inequalities = { "X > 9", "X < 9" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case58() {
        String[] inequalities = { "X <= 1000", "X = 1000", "X > 1000", "X < 10", "X >= 1000" };
        assertEquals(3, inq.maximumSubset(inequalities));
    }

    @Test
    public void case59() {
        String[] inequalities = { "X > 9", "X < 10" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case60() {
        String[] inequalities = { "X = 784", "X <= 248", "X >= 913", "X < 462", "X > 995", "X > 212", "X > 611", "X > 605", "X < 671", "X = 657", "X >= 883", "X <= 395", "X <= 995", "X = 211", "X = 287", "X > 277", "X = 148", "X >= 305", "X >= 82", "X < 171", "X >= 297" };
        assertEquals(10, inq.maximumSubset(inequalities));
    }

    @Test
    public void case61() {
        String[] inequalities = { "X > 0", "X > 1" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case62() {
        String[] inequalities = { "X > 12", "X < 13" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case63() {
        String[] inequalities = { "X < 5", "X <= 5", "X = 5" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case64() {
        String[] inequalities = { "X > 1000", "X >= 1000" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case65() {
        String[] inequalities = { "X > 1000", "X < 1000" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case66() {
        String[] inequalities = { "X < 10", "X <= 10", "X >= 10" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case67() {
        String[] inequalities = { "X >= 13", "X < 13" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case68() {
        String[] inequalities = { "X < 3", "X > 3" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case69() {
        String[] inequalities = { "X > 5", "X >= 4", "X < 5", "X <= 6" };
        assertEquals(3, inq.maximumSubset(inequalities));
    }

    @Test
    public void case70() {
        String[] inequalities = { "X < 2", "X = 3" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case71() {
        String[] inequalities = { "X > 0", "X < 1" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case72() {
        String[] inequalities = { "X < 1", "X > 1" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case73() {
        String[] inequalities = { "X <= 1", "X >= 2" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case74() {
        String[] inequalities = { "X >= 139", "X <= 279", "X >= 426", "X <= 906", "X >= 160", "X <= 741", "X >= 831", "X <= 744", "X >= 266", "X <= 181", "X >= 886", "X <= 362", "X >= 898", "X <= 423", "X >= 154", "X <= 985", "X >= 251", "X <= 696", "X >= 45", "X <= 287", "X >= 776", "X <= 463", "X >= 677", "X <= 532", "X >= 999", "X <= 115", "X >= 861", "X <= 331", "X >= 555", "X <= 234", "X >= 762", "X <= 965", "X >= 313", "X <= 344", "X >= 224", "X <= 242", "X >= 599", "X <= 791", "X >= 799", "X <= 107", "X >= 181", "X <= 145", "X >= 530", "X <= 647", "X >= 969", "X <= 932", "X >= 177", "X <= 724", "X >= 461", "X <= 579" };
        assertEquals(28, inq.maximumSubset(inequalities));
    }

    @Test
    public void case75() {
        String[] inequalities = { "X < 0" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case76() {
        String[] inequalities = { "X = 10" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case77() {
        String[] inequalities = { "X > 6", "X < 7" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case78() {
        String[] inequalities = { "X < 1", "X >= 1" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case79() {
        String[] inequalities = { "X >= 2", "X < 2" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case80() {
        String[] inequalities = { "X = 151", "X > 474", "X <= 407", "X <= 439", "X <= 960", "X > 22", "X < 27", "X = 901", "X > 279", "X > 147", "X <= 8", "X > 763", "X <= 373", "X > 73", "X > 458", "X > 732", "X >= 466", "X > 831", "X >= 488", "X < 15", "X <= 50", "X > 989", "X >= 907", "X = 162", "X >= 966", "X <= 313", "X <= 107", "X = 276", "X < 677", "X > 761", "X <= 942", "X < 709", "X <= 157", "X = 650", "X = 53", "X >= 462", "X <= 677", "X = 897", "X < 469", "X <= 182", "X = 189", "X >= 985", "X = 320", "X >= 154", "X = 983", "X < 37" };
        assertEquals(18, inq.maximumSubset(inequalities));
    }

    @Test
    public void case81() {
        String[] inequalities = { "X <= 1", "X <= 2", "X <= 3", "X <= 4", "X <= 5", "X <= 6", "X <= 7", "X <= 8", "X <= 9", "X <= 10", "X <= 11", "X <= 12", "X <= 13", "X <= 14", "X <= 15", "X <= 16", "X <= 17", "X <= 18", "X <= 19", "X <= 31", "X <= 32", "X <= 33", "X <= 34", "X <= 35", "X <= 36", "X <= 37", "X <= 38", "X <= 39", "X <= 310", "X <= 311", "X <= 312", "X <= 313", "X <= 314", "X <= 315", "X <= 316", "X <= 317", "X <= 318", "X <= 319", "X <= 419", "X <= 110", "X <= 21", "X <= 22", "X <= 23", "X <= 24", "X <= 25", "X <= 26", "X <= 27", "X <= 28", "X <= 29", "X <= 210" };
        assertEquals(50, inq.maximumSubset(inequalities));
    }

    @Test
    public void case82() {
        String[] inequalities = { "X > 4", "X < 5" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case83() {
        String[] inequalities = { "X = 2", "X > 2" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case84() {
        String[] inequalities = { "X < 2", "X > 1", "X < 3", "X > 2" };
        assertEquals(3, inq.maximumSubset(inequalities));
    }

    @Test
    public void case85() {
        String[] inequalities = { "X <= 521", "X >= 521", "X = 521", "X > 902", "X > 12", "X <= 522" };
        assertEquals(5, inq.maximumSubset(inequalities));
    }

    @Test
    public void case86() {
        String[] inequalities = { "X < 47", "X > 59", "X > 90", "X = 68", "X = 84", "X < 2" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case87() {
        String[] inequalities = { "X <= 1", "X = 2" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case88() {
        String[] inequalities = { "X = 1", "X = 2" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case89() {
        String[] inequalities = { "X >= 1000", "X >= 999", "X >= 998", "X >= 997", "X >= 996", "X >= 995", "X >= 994", "X >= 993", "X >= 992", "X >= 991", "X >= 990", "X >= 989", "X >= 988", "X >= 987", "X >= 986", "X >= 985", "X >= 984", "X >= 983", "X >= 982", "X >= 981", "X >= 980", "X >= 979", "X >= 978", "X >= 977", "X >= 976", "X >= 975", "X >= 974", "X >= 973", "X >= 972", "X >= 971", "X >= 970", "X >= 969", "X >= 968", "X >= 967", "X >= 966", "X >= 965", "X >= 964", "X >= 963", "X >= 962", "X >= 961", "X >= 960", "X >= 959", "X >= 958", "X >= 957", "X >= 956", "X >= 955", "X >= 954", "X >= 953", "X >= 952", "X >= 951" };
        assertEquals(50, inq.maximumSubset(inequalities));
    }

    @Test
    public void case90() {
        String[] inequalities = { "X >= 372", "X <= 372" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case91() {
        String[] inequalities = { "X = 1", "X = 2", "X = 3", "X > 0", "X >= 1000", "X > 1000", "X = 1000", "X <= 999", "X < 999", "X = 999", "X > 998", "X > 999", "X >= 999", "X > 997", "X >= 997", "X = 5", "X = 6", "X = 7", "X > 8", "X >= 990", "X > 990", "X = 990", "X <= 991", "X < 991", "X = 991", "X > 992", "X > 979", "X >= 979", "X > 920", "X >= 920", "X > 890", "X = 890", "X <= 891", "X < 891", "X = 891", "X > 892", "X > 879", "X >= 879", "X > 820", "X >= 820" };
        assertEquals(22, inq.maximumSubset(inequalities));
    }

    @Test
    public void case92() {
        String[] inequalities = { "X >= 500", "X >= 501", "X >= 502", "X >= 503", "X >= 504", "X >= 505", "X >= 506", "X >= 507", "X >= 508", "X >= 509", "X >= 510", "X >= 511", "X >= 512", "X >= 513", "X >= 514", "X >= 515", "X >= 516", "X >= 517", "X >= 518", "X >= 519", "X >= 520", "X >= 521", "X >= 522", "X >= 523", "X >= 524", "X >= 525", "X >= 526", "X >= 527", "X >= 528", "X >= 529", "X >= 530", "X >= 531", "X >= 532", "X >= 533", "X >= 534", "X >= 535", "X >= 536", "X >= 537", "X >= 538", "X >= 539", "X >= 540", "X >= 541", "X >= 542", "X >= 543", "X >= 544", "X >= 545", "X >= 546", "X >= 547", "X >= 548" };
        assertEquals(49, inq.maximumSubset(inequalities));
    }

    @Test
    public void case93() {
        String[] inequalities = { "X > 0", "X = 0" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case94() {
        String[] inequalities = { "X < 1", "X >= 1", "X >= 2" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case95() {
        String[] inequalities = { "X < 1", "X = 1" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case96() {
        String[] inequalities = { "X >= 8", "X < 8" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case97() {
        String[] inequalities = { "X > 5" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case98() {
        String[] inequalities = { "X >= 1000", "X > 1000" };
        assertEquals(2, inq.maximumSubset(inequalities));
    }

    @Test
    public void case99() {
        String[] inequalities = { "X = 0", "X > 0", "X < 0", "X <= 0", "X >= 0" };
        assertEquals(3, inq.maximumSubset(inequalities));
    }

    @Test
    public void case100() {
        String[] inequalities = { "X >= 10" };
        assertEquals(1, inq.maximumSubset(inequalities));
    }

    @Test
    public void case101() {
        String[] inequalities = { "X > 10", "X < 10", "X > 3", "X < 3", "X < 31", "X < 32", "X < 33", "X < 34", "X < 35", "X < 36", "X < 37", "X < 38", "X < 39" };
        assertEquals(11, inq.maximumSubset(inequalities));
    }

}
