package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class PowerAdaptersTest {
    PowerAdapters poweradapters = new PowerAdapters();

    @Test 
    public void case1() {
        String[] adapters = {"CMCUG MEIACWT","CMCUG QLLUJCMB","MEIACWT UKINFV"
            ,"ODK QLLUJCMB","MEIACWT SXGBGF","CWW TUQ","YUAYI MEIACWT"
                ,"MEIACWT ODK","QLLUJCMB AGNAE","AGNAE GACPM","QLLUJCMB MAO"
                ,"KNCUTEW NNA","ODK MEIACWT","QJQUY ODK","AGNAE MEIACWT"};
        String[] itinerary = {"AGNAE","ODK","TUQ","YUAYI"};
        String homeCountry = "AGNAE";

        assertEquals(2, poweradapters.needed(adapters, itinerary, homeCountry));
    }
    
    @Test 
    public void case2() {
        String[] adapters = {"LALJ DMZEQ","ANKNMMUQ YINE","MAYNYVOM KQWCGASA"
            ,"YWEU DMZEQ","MAO YAE","CWNFS IAWGRCX","KQWCGASA CNUL"
                ,"CWNFS DMZEQ","QBHQCU EPMAKOI","CNUL KQWCGASA"
                ,"ANKNMMUQ YOXOQVO","YAE MAYNYVOM","IAWGRCX DMZEQ"};
        String[] itinerary = {"CWNFS","DMZEQ","ISO","YOKKMK"};
        String homeCountry = "YINE";
        
        assertEquals(3, poweradapters.needed(adapters, itinerary, homeCountry));
    }
    
}
