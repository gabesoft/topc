package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class QuantumAlchemyTest {
  QuantumAlchemy quantumalchemy = new QuantumAlchemy();

  @Test
  public void case1() {
    String initial = "ABCDE";
    String[] reactions = { "ABC->F", "FE->X" };
    assertEquals(2, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case2() {
    String initial = "AABBB";
    String[] reactions = { "BZ->Y", "ZY->X", "AB->Z" };
    assertEquals(4, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case3() {
    String initial = "AAABB";
    String[] reactions = { "BZ->Y", "ZY->X", "AB->Z" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case4() {
    String initial = "AAXB";
    String[] reactions = { "BZ->Y", "ZY->X", "AB->Z" };
    assertEquals(0, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case5() {
    String initial = "ABCDEFGHIJKLMNOPQRSTUVWYZABCDEFGHIJKLMNOPQRSTUVWYZ";
    String[] reactions = { "ABCE->Z", "RTYUIO->P", "QWER->T", "MN->B" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case6() {
    String initial = "AAAAAAAAAAAAAAAAAAABAAAAA";
    String[] reactions = { "AM->N", "AB->C", "AV->W", "AK->L", "AT->U", "CA->D", "OA->P", "JA->K", "AL->M", "UA->V", "AN->O", "AI->J", "AE->F", "QA->R", "AW->Y", "HA->I", "FA->G", "PA->Q", "AG->H", "ZA->X", "AS->T", "DA->E", "AR->S", "AY->Z" };
    assertEquals(24, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case7() {
    String initial = "AAAAABAAAAAAAAAAAAAAAAAA";
    String[] reactions = { "WA->Y", "IA->J", "AO->P", "BA->C", "KA->L", "FA->G", "AD->E", "AC->D", "AR->S", "SA->T", "AL->M", "AY->Z", "AV->W", "JA->K", "AH->I", "UA->V", "ZA->X", "AP->Q", "TA->U", "EA->F", "AN->O", "GA->H", "QA->R", "AM->N" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case8() {
    String initial = "GJJ";
    String[] reactions = { "IJG->C", "JG->I", "JI->X" };
    assertEquals(2, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case9() {
    String initial = "KGPHUVYHQDLKJDYJHYUNHAG";
    String[] reactions = { "IGJ->C", "GJ->I", "IJ->X" };
    assertEquals(2, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case10() {
    String initial = "BRRBRBR";
    String[] reactions = { "BKR->T", "BR->K", "TKR->X" };
    assertEquals(4, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case11() {
    String initial = "RRBBRB";
    String[] reactions = { "RB->K", "RKT->X", "RBK->T" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case12() {
    String initial = "NNJJ";
    String[] reactions = { "NJ->B", "NBJ->X", "JN->F" };
    assertEquals(2, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case13() {
    String initial = "JMRNMNBJ";
    String[] reactions = { "NJ->F", "NJ->B", "JNB->X" };
    assertEquals(1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case14() {
    String initial = "BSBSBBS";
    String[] reactions = { "BJS->G", "SB->J", "GBJ->X" };
    assertEquals(4, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case15() {
    String initial = "SSBSBB";
    String[] reactions = { "BSJ->G", "GBJ->X", "BS->J" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case16() {
    String initial = "NVNNNNNVVVNNNVVNVNVVVVVNVN";
    String[] reactions = { "VNRH->D", "DR->Y", "RKD->E", "NV->H", "YDA->X", "DANR->K", "NVH->R", "HR->A" };
    assertEquals(16, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case17() {
    String initial = "HHHQQQQHHQHQHQHQQHQQQHHQQH";
    String[] reactions = { "QH->K", "QK->V", "KQHV->E", "KVHQ->O", "EKO->P", "PN->X", "PVO->M", "HKO->N" };
    assertEquals(17, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case18() {
    String initial = "EVOEOCZEOOEOOEVEOEOOEOEOEOEOZOEEOEOECOEEOEOOEOEO";
    String[] reactions = { "OZE->C", "ZOEC->V", "QA->X", "ZV->F", "SFCV->A", "EO->Z", "VOC->S", "CSVF->Q" };
    assertEquals(27, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case19() {
    String initial = "EOEOOOOEEEOOZOOOEOEOEEEEOEEOEVOVOEEOZOCEEZOOCOEOEO";
    String[] reactions = { "OEZ->C", "OCV->S", "CSFV->A", "OE->Z", "QA->X", "ZV->F", "CSFV->Q", "ZOCE->V" };
    assertEquals(26, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case20() {
    String initial = "FBKFFFKKFKFFPFBKFKFKKKFFFKKKFFFFWFFFKFFKKPKPFBFFF";
    String[] reactions = { "PWBF->D", "KF->B", "DPG->N", "FB->P", "KPBW->O", "BWPD->G", "DNWO->X", "PFK->W" };
    assertEquals(30, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case21() {
    String initial = "FWFFKKFFKKKPKPKKFBFFFFFKKFFKFFKFFFAFBFBKPKKFFFFKFF";
    String[] reactions = { "BDPW->G", "WNOD->X", "PWBK->O", "DPG->N", "KF->B", "PWFB->D", "BF->P", "FKP->W" };
    assertEquals(30, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case22() {
    String initial = "BBWBW";
    String[] reactions = { "BW->R", "RZ->X", "MG->T", "BI->Z", "IB->G", "WI->M", "WB->I", "TG->P" };
    assertEquals(4, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case23() {
    String initial = "WBB";
    String[] reactions = { "BW->R", "RZ->X", "IW->M", "WB->I", "MG->T", "BI->G", "BI->Z", "GT->P" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case24() {
    String initial = "ZGZGGZGGGZZ";
    String[] reactions = { "WZ->C", "YF->X", "WA->F", "GZ->A", "WG->P", "RA->Y", "AG->W", "ZW->R" };
    assertEquals(10, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case25() {
    String initial = "GZGZNGZGZGZG";
    String[] reactions = { "WZ->C", "GA->W", "AR->Y", "GZ->A", "WA->F", "ZW->R", "FY->X", "GW->P" };
    assertEquals(10, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case26() {
    String initial = "NVVN";
    String[] reactions = { "ZN->C", "NM->I", "MN->S", "NM->Z", "VN->M", "ZV->E", "KV->X", "MN->K" };
    assertEquals(3, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case27() {
    String initial = "VNN";
    String[] reactions = { "NM->Z", "MN->I", "VN->M", "KV->X", "ZV->E", "NM->S", "NM->K", "NZ->C" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case28() {
    String initial = "KKZK";
    String[] reactions = { "IE->V", "KZ->E", "EI->A", "IK->W", "EZ->Q", "KE->I", "KI->N", "KI->X" };
    assertEquals(3, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case29() {
    String initial = "MGMGMMUBMGGGGUMGMCGGBMBMGUGUCCGMMMMGGMJMMGGGMWMGGG";
    String[] reactions = { "GM->B", "WMGJ->S", "MJBGWC->R", "GSCMBWRUJ->X", "MGB->U", "CU->W", "MBUG->C", "CGBU->J" };
    assertEquals(22, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case30() {
    String initial = "BMGCCMGGGMGGGMWUBGMUUGGMGMUGJMBMGGMGMMCGGMMMMGMGG";
    String[] reactions = { "GBM->U", "MG->B", "UC->W", "WMGJ->S", "UWGBMRSJC->X", "BMGU->C", "BUGC->J", "CMWGBJ->R" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case31() {
    String initial = "JJJJYYYJYY";
    String[] reactions = { "SY->Z", "WJY->T", "WATJY->Q", "QWJT->S", "YSJTAWQ->P", "JY->W", "YJA->X", "JYTW->A" };
    assertEquals(5, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case32() {
    String initial = "JYJYJYOJJYYW";
    String[] reactions = { "YJW->T", "TYWJA->Q", "WTJQ->S", "TAQJWSY->P", "AJY->X", "YJ->W", "WYTJ->A", "YS->Z" };
    assertEquals(4, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case33() {
    String initial = "VQVQKGVQVVQVVVQRVVQVQVQVGHQJQKQKQGQQQVVQQHQVVRV";
    String[] reactions = { "QRVJHKG->I", "KRGQHV->J", "VKQGR->H", "IJHRKGQV->S", "VQKG->R", "KQV->G", "SGK->X", "QV->K" };
    assertEquals(19, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case34() {
    String initial = "VQVGQKVVQVVQKVHQQKQVVQHVQVRQQGGQQQRVJVVVQQQV";
    String[] reactions = { "RQKGV->H", "RQGVKH->J", "VQ->K", "KSG->X", "QVK->G", "VGKQ->R", "JIVGQRHK->S", "HGRKVQJ->I" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case35() {
    String initial = "JMJMMWJMWMJWRRMJJRMJWJAMJMJJJWMMWMMJMWWMJJJJMMWJR";
    String[] reactions = { "AWPJ->N", "NJLMRPWAZ->X", "AR->L", "MJR->Z", "MJW->R", "MJ->W", "WMJRA->P", "WRMJ->A" };
    assertEquals(19, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case36() {
    String initial = "JMMMJWJJJJJJJMWWRMMWMRJMJMWMJJMJJJWWRMMWJJAMMMR";
    String[] reactions = { "RJMW->A", "RA->L", "JWPA->N", "JM->W", "AMLJWZNRP->X", "JRM->Z", "MWJ->R", "AMJWR->P" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case37() {
    String initial = "SDBBMNJZTNFLYZDCQHBUSSDJQFSNLHZDZHAZSDDWNQEDVCHMB";
    String[] reactions = { "BD->I", "TYZD->C", "UMNF->V", "QY->N", "MU->G", "UVN->K", "SITD->Y", "ZQ->F", "RMVG->O", "AJ->L", "SHBD->Z", "VR->X", "HS->D", "BL->S", "PE->W", "HDZS->T", "CU->M", "VMKN->R", "CF->U", "WE->A", "PE->J", "YTIZ->Q", "LBJ->H", "AEJW->B" };
    assertEquals(24, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case38() {
    String initial = "WCNDDTDDEUYHBFDSZHDZNAVBBBDSNLMQZCSJZSLZJHMNQSQFAH";
    String[] reactions = { "YQ->N", "CU->M", "MKVN->R", "UM->G", "RGMV->O", "BL->S", "QZ->F", "JEWA->B", "HSDZ->T", "JA->L", "MNFU->V", "VUN->K", "EP->J", "YTDZ->C", "DB->I", "WE->A", "RV->X", "SDBH->Z", "EP->W", "SH->D", "JLB->H", "FC->U", "TZYI->Q", "DSTI->Y" };
    assertEquals(24, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case39() {
    String initial = "MGTQUMUWHIOHZWCZHTBMWUQIQHQZKMHWEQEUDZJHZBBWUZUZIB";
    String[] reactions = { "ZQI->B", "ZT->U", "TN->I", "MUI->O", "WHKJ->D", "UB->W", "EG->P", "SNV->M", "HJR->E", "UMZ->Q", "JW->H", "FG->X", "DEH->C", "WQ->J", "AL->V", "TMN->Z", "AS->T", "CD->Y", "WQO->R", "DE->G", "YGDC->F", "JRBH->K", "LAS->N", "AV->S" };
    assertEquals(28, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case40() {
    String initial = "TDJMZQICOUTHMGQQUMKIQBZHWWUBHWUHHMBBEEQWZHZWIUU";
    String[] reactions = { "ZT->U", "TMN->Z", "GE->P", "DE->G", "UMI->O", "UB->W", "UZM->Q", "GF->X", "WQ->J", "NT->I", "WOQ->R", "QZI->B", "HJR->E", "CD->Y", "HWJK->D", "JHRB->K", "DYGC->F", "VA->S", "LA->V", "WJ->H", "AS->T", "DEH->C", "ASL->N", "NVS->M" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case41() {
    String initial = "LLLLUSLUBIUUUUOUCUULUGULLUUGUUGULLLLGUIGLUUULUUVUU";
    String[] reactions = { "BS->Y", "PO->S", "IK->E", "KD->Q", "AP->T", "UL->G", "RM->D", "BR->P", "DK->Z", "UC->R", "GI->K", "LU->V", "GO->C", "YA->H", "GC->I", "UG->M", "JH->X", "VO->B", "UG->O", "BK->A", "HT->J", "BG->W", "TQ->F", "EZ->N" };
    assertEquals(49, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case42() {
    String initial = "LLUUUUUGULLGUGULUULVULUULUGLUUOCUULUUBIGUIUL";
    String[] reactions = { "IK->E", "DK->Q", "DK->Z", "RB->P", "JH->X", "OG->C", "AY->H", "ZE->N", "PA->T", "GB->W", "KB->A", "IG->K", "VO->B", "UC->R", "SB->Y", "TH->J", "GC->I", "TQ->F", "GU->O", "LU->V", "MR->D", "PO->S", "UG->M", "LU->G" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case43() {
    String initial = "YYYYSSYSYSYYSSSYSYSYYZYSYSSSVYYSSYRSSYBVYYSYSSSSSY";
    String[] reactions = { "YB->A", "VZ->J", "SY->R", "JM->G", "QN->X", "VD->M", "PM->I", "GM->K", "BO->U", "DM->H", "WI->N", "YR->Z", "BR->T", "GF->E", "RS->B", "BR->D", "UG->P", "IM->F", "YS->V", "AZ->C", "GJ->L", "WG->Q", "DZ->W", "RJ->O" };
    assertEquals(49, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case44() {
    String initial = "SSSYYSYSSSYRSBYYYSYSYZYYSSYSSYVYSYSYYSS";
    String[] reactions = { "GF->E", "SY->R", "OB->U", "WI->N", "UG->P", "RS->B", "RB->D", "MI->F", "BR->T", "RY->Z", "SY->V", "QN->X", "VD->M", "BY->A", "GJ->L", "RJ->O", "GW->Q", "AZ->C", "ZD->W", "PM->I", "GM->K", "DM->H", "VZ->J", "MJ->G" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case45() {
    String initial = "WJLSRFJKNIPLRTYAMIEWUDMOGCYIOUCNGDRDZZJEPMTJISELZ";
    String[] reactions = { "UWIRSZL->C", "FJABGQEHYP->X", "QPEBAJO->F", "TZLR->U", "NJCMDI->E", "ICW->V", "TLUZR->W", "PY->H", "ZNWRTDIL->S", "RT->Z", "GP->A", "CKISDU->O", "PVSCDKOEJM->G", "ZRT->L", "BFMQGEP->Y", "MSINCDK->J", "NWDIZSVLCU->K", "VWSKI->M", "IWUZR->N", "ZLRTWU->I", "EO->B", "OPMSEJGC->Q", "LWZTIN->D", "EMVSKJD->P" };
    assertEquals(10, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case46() {
    String initial = "AINCDJEWTYTEGNYDLOZMOIRJERZCMLSURUDSJIWJZPMILP";
    String[] reactions = { "SUWNZLCVDI->K", "SPMCEJDOKV->G", "YP->H", "ITLWNZ->D", "GP->A", "OE->B", "AGPFHYBJQE->X", "JNCDIM->E", "RZULSIW->C", "IWVSK->M", "RLZTU->W", "CWI->V", "MVDKESJ->P", "QJEPBOA->F", "CDUIKS->O", "TZR->L", "KISDNCM->J", "LZRT->U", "RT->Z", "PFMEGBQ->Y", "RULWZT->I", "ITZDWLNR->S", "URZWI->N", "OGSPCJEM->Q" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case47() {
    String initial = "OWBWENNSNAEDDCOMICMGVWYIMDKSBSESAEOCEOMMHCCNZOSSEO";
    String[] reactions = { "OE->M", "EMO->V", "SYVCOIME->H", "BRAKNWT->Q", "DH->N", "ISMHNYW->K", "QBL->J", "BQLRJTUPF->Z", "PLZABF->G", "CDEOS->Y", "KWPRFNTBAH->L", "NBKHW->A", "KBLAFNTQ->U", "IY->W", "NW->P", "KWYNSHC->B", "DPW->F", "VIDSWKHCN->T", "QZG->X", "NABY->R", "CIOV->D", "VEOM->C", "MECVO->S", "SOEMVC->I" };
    assertEquals(11, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case48() {
    String initial = "COWOEOSNYVZSBDNCBEIMDNSWECEMSKCSEOEAMODCSMMGHON";
    String[] reactions = { "LQB->J", "VOEM->C", "NWBHK->A", "OCDSE->Y", "EMCVOS->I", "IY->W", "UFPLTJQRB->Z", "DWP->F", "NKFTBAQL->U", "LPBAFZ->G", "RBATNWFPHK->L", "ZGQ->X", "DH->N", "OEM->V", "OE->M", "WIYNMSH->K", "CMEVO->S", "HNSKWYC->B", "IYSEOCMV->H", "ABRWKTN->Q", "NYAB->R", "WN->P", "DICWVHNKS->T", "OCIV->D" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case49() {
    String initial = "UGMKGQGIFFKHAJCBTPPASEBGQHTMRHVQIQHYPSODJZMSJE";
    String[] reactions = { "QT->B", "JGPZCBWRDFVTYIQ->X", "BAGMQEIPHSTJK->V", "EIHUGRSLJNB->Y", "OIUKF->L", "SH->M", "SMH->G", "JGMITHASPK->Q", "MFOSUBQEDVA->W", "JFSELOKQAUVTIMPHGZBD->R", "SMGPH->J", "PSFABH->O", "HDGIBAPMESQVTJFK->U", "QKDMAGOTPFEUSHVJIB->Z", "HSIPT->A", "ISJGPTMH->K", "GIH->T", "GHSM->P", "KH->D", "MQTGJAIHSKPB->E", "DIJQSZULTPOABGMR->N", "MGHSJP->I", "SDPEBJVUWZOATKGFRN->C", "AMVKBS->F" };
    assertEquals(7, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case50() {
    String initial = "RETBPEHGIDQKJFUCQIBGHHOQTJTYFQGAMSPJAMZKPSGSMHV";
    String[] reactions = { "SHM->G", "STGAKMPIHJ->Q", "SBVAKM->F", "OULQBJMTSZIRDPGA->N", "APIKBSHTMEGJQ->V", "UIOKF->L", "STIHP->A", "TJIGPMHS->K", "WIZCJQFYRGVPBTD->X", "SPJHGM->I", "HPBFSA->O", "TWZONAURFBGKDVESPJ->C", "IGMQAPBTSKHJ->E", "HK->D", "SAUIPJQKEDHOMGVBFT->Z", "MOUEFAVSBDQ->W", "TQ->B", "GHI->T", "PMHSG->J", "ZBIUEFSTQDGKVALMPHJO->R", "HS->M", "RNBSLGUEJIH->Y", "KSTPQHIFJEAGVMDB->U", "MGHS->P" };
    assertEquals(5, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case51() {
    String initial = "DRGACDSFLMMMFECWQPKDQPIOCPGRIIFFDWMYWFERGYAYPPR";
    String[] reactions = { "CRDYAKFEMLWQGIPO->S", "PDFM->W", "FSHY->X", "GRDQCFMPWEI->O", "OVFWIALKRMPUQCDYH->J", "CWGSQMPIYKRAE->H", "EOAPWIQGCDM->L", "PYLAGHMEVOFWRNSKDCQI->U", "CDLTEUANYJMSBKIQ->Z", "FIEADQWGMLCOPR->Y", "RWSDGOFJPVIELUQNKCA->B", "VRWKDUGYBEMHAQNPJOFILCS->T", "DFWPM->R", "QF->C", "IGDEPOMRQCFW->A", "PF->D", "DGFWPMR->Q", "PQR->I", "GDQCPFMWR->E", "ALISDYMGRPOWKCEQFH->V", "DPF->M", "RPIWFQCD->K", "MWFRPD->G", "APFGHEMKLRY->N" };
    assertEquals(6, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case52() {
    String initial = "GMAIPRGLRYPYLRIMEDFICMOFSQCWGDKPDRAFYDPFWPMFQECW";
    String[] reactions = { "FHYS->X", "PDOQGIEACMW->L", "QRDCFIWP->K", "PRQ->I", "DPF->M", "RODPMECQGWFI->A", "PWGFQDRMC->E", "DPIMQGCFRWE->O", "GFLOSWAPQMHICYDRKE->V", "FP->D", "DQYCRPFLKIWAGOME->S", "WIERYAGCQMPSK->H", "FPDRGWM->Q", "MKYBSLCDUQEATNJI->Z", "QRYMAOCDWLPIKFNSGHVE->U", "UPJESWLIQODCAKRFNGV->B", "PFDM->W", "FWRPMOIGLQEDCA->Y", "FQ->C", "HFKYAPRELMG->N", "DRFMPW->G", "ULRHAYVDFPIWOCQMK->J", "NSHLERGVAOJFPWCBKYDMQIU->T", "WDFMP->R" };
    assertEquals(6, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case53() {
    String initial = "RRTLZQHEHETBYVGDVOOIFTWEJINCJDVNUUJBYOPQICZZMHS";
    String[] reactions = { "JOZINBRU->V", "ON->E", "TOIDLWBCGENVYJQZRUH->A", "JEUO->B", "TBIJEONVHCUZR->G", "NUEZO->I", "JIUOZNBE->R", "EUZONI->J", "VEJNORIHZBUC->T", "NVJ->H", "RNEJDIVUHGCOBTZ->Q", "IEYCUTZDW->F", "PTGDJSMYZAVHFOIEQ->X", "EMDJHVCNO->S", "TNRBGUVICHOJDZ->Y", "NEOZ->U", "AJRYETZIDWQUV->M", "OZIEHNBJVRU->C", "JCHOEDGRZIQTNUVBY->L", "GHDNIRJUYZBCOTLQEV->W", "RVGATMDOBE->P", "NEO->Z", "ZTVIPCHJNMODQYAUEF->K", "GNOBHVT->D" };
    assertEquals(3, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case54() {
    String initial = "CTEIVIHCPNZNOHUBQJFIYLOZVODYTQJJDHUBEERSVZGWTM";
    String[] reactions = { "JVN->H", "ZNOEU->I", "ZOEN->U", "GDOBVJUCNRZTHI->Y", "JIUCVROZHENB->T", "TJBHIOCURNVZE->G", "EZUYICWTD->F", "ZUIEON->J", "ON->E", "JCNTIQAHOYMFUEPZVD->K", "QJHCIYRGVTNBUEOZD->L", "RTVGDAEMBO->P", "NOE->Z", "NGBVTOH->D", "EUOBNVIHRZJ->C", "VEHTYUWCRNJZGLIODBQ->A", "UJEO->B", "DTGRJVEOUHCINZB->Q", "JENUOIBZ->R", "DJUTVIQRWZYEA->M", "UNIJBROZ->V", "OPJVHEZIASQGTMDYF->X", "RVHOQBILDUYCENGZTJ->W", "NOMJHCEDV->S" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case55() {
    String initial = "ZEIBCKWDOVMSSQJCOOBHIRASKVUFYPUNFCPERLG";
    String[] reactions = { "SCFO->Y", "OPGENYKULCSVBDFAI->R", "PRBOSYEIKCVU->T", "OC->F", "UPIDWTYL->M", "SFYOIC->N", "YHW->Z", "OCFSNIDY->G", "SOFYC->I", "OCF->S", "FOSCNIY->D", "UAIOV->W", "BGF->V", "BNSLACVGFK->E", "FSYIDGOC->A", "ILFY->B", "NESOGBFLKVYIACD->P", "UKNMTQDBSOEFCPWARGVLIY->J", "AVNSCOYTKPGWBDIM->H", "DSINOGFYC->L", "AZIGYLQPKCNJDWOMSHUEFTVBR->X", "DBC->K", "AYKILDFNVGEOPSC->U", "LTGDSAKEUPVRWBMFIYO->Q" };
    assertEquals(3, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case56() {
    String initial = "VLSYCKEBNGSIIWRMKJDCCBPUVHOAQREFOSPF";
    String[] reactions = { "LSGCAFDNKEYVOIP->U", "URYCLQOENPMSKGFAWIDBVT->J", "TWYPILDU->M", "GBF->V", "CBKTWPGOIVYNDMAS->H", "DFSCINYO->G", "AVOIU->W", "OIYCSGDF->A", "CO->F", "AOPYCBDUKNFIGVLSE->R", "YFSOC->I", "ABKSFVNLCG->E", "HWY->Z", "SNOFYDCGI->L", "YECOFSNKVAGBDLI->P", "ICSYOF->N", "FCO->S", "LVAIFODKBRWUEGMTYPS->Q", "YIFL->B", "CBD->K", "OIUYPCRBKEVS->T", "FARQVZSCLDGBKNMEJPHYOTUIW->X", "INYFCSO->D", "FCOS->Y" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case57() {
    String initial = "ACLTMCARCCCMCYMMCCRATAAMAAVYRMLLMAVMCGSACALMCSRASV";
    String[] reactions = { "AC->M", "MISTHCLVPOYKAR->N", "PUIHSNOAKJFTRVCZWQML->E", "TCVLYAMRS->P", "PQRMHKSTV->Z", "MUYHAKOVNRTSCL->J", "MUDCAHFOIENZWRTLKPSVJ->G", "LYKVTHCPSIAMR->O", "LPITSYMHACRV->K", "TFKJAM->D", "NOMKUHTJSPR->F", "VYTRAPSMLC->H", "LYSTUORHZPKMIVCJQNA->W", "MTRAVSYPHLC->I", "VPCHG->X", "HPVIYTACOMK->U", "CAMR->L", "LMATR->Y", "MCA->V", "PARYCTUMHSJKLVNIO->Q", "MAC->R", "CTRLAYM->S", "ODP->B", "ML->T" };
    assertEquals(14, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case58() {
    String initial = "SMMMACVLMTARLCCVGAAMACCYMCAMR";
    String[] reactions = { "TYIAMVRLPHSC->K", "VONASCKYRMHULT->J", "MCASOLKTPRHVIY->N", "IVCPOKMAYHT->U", "MCRA->L", "AC->M", "ML->T", "YCMALTR->S", "MAJTFK->D", "LTSACVMPHYR->I", "SMUTZVLYPCANJRQOIKH->W", "HMCRTYKAPSVIL->O", "HRTPKMQVS->Z", "CPVGH->X", "MSRATPLYVC->H", "DPO->B", "NPMHUJRKTOS->F", "MCA->R", "TAEPVJMCUKZWFRHOISNLD->G", "IURWTZOVPMAKFCHQLNSJ->E", "ALMTR->Y", "SMTARYVCL->P", "ACM->V", "IKPYTMUVAHLNJCROS->Q" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case59() {
    String initial = "DSQSJEZCRWCZTGFOAAMTVTBURIIRNWQSILDYBJWJEMGGQ";
    String[] reactions = { "OTILESQUMBAJGC->F", "TJAOFDQULWMSE->Z", "TIGMJERCSWA->B", "ETQPJMRAGIWCLSB->U", "EARCSJWIGUBTPQLM->O", "QJASTEIGWCRBM->P", "NEABHCZUIKORDMW->Y", "GSRJTBQMEPIWC->L", "IJBOCQSLMRGFPTUEWA->V", "JQTUWGFMNIRZKBYSD->X", "AWREGSTIJM->C", "SPFTQOILUVBGAMWERCJ->D", "OCTGQLJBZWPDFVIER->H", "JEAPLCQOTZDSRGWIV->K", "EMRWSAGCJBTI->Q", "FMSUCKIWZJR->N" };
    assertEquals(3, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case60() {
    String initial = "SYGZUCARGZQSVRBRDITSECWBIJWJLFMTGQJNDQWIAMTO";
    String[] reactions = { "AMBGRTWSIEJC->Q", "SWRAGEIJTM->C", "MQRNDKIWZFBTJYSGU->X", "CUEAHOBNRZDKMWI->Y", "IESQMJBARGWTC->P", "GFWECDLIBPJTZVRQO->H", "PJSIUTQLRWBGAEMC->O", "RBCEPGQJWSTIM->L", "APMOWGBEUIRTJSLCFQ->V", "SWZRJIUCKFM->N", "TSIARDGPLCZQVEWJO->K", "QBAJLEPSIMWCRTG->U", "WJMIRESCGTA->B", "BUAGPIREJTVFWSCLOMQ->D", "QOUTDJAFLWESM->Z", "OAEUTQCGJBIMLS->F" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case61() {
    String initial = "VSPSTMTIVEENLFCBYNTRFHIZSAGKRJAHYVRQZYLWQNKHF";
    String[] reactions = { "QOZJDBFYWETMAKPSIL->G", "WPBTQHREKVSNYIOGF->X", "BVNLEWMTQACJYFOIHKZSDR->P", "FMWRNZYTHVSQCAJLKIE->O", "VKHYFWLNZRCTAS->I", "ZYCNKRFTIWHVALS->J", "JFIGLBVSPOHEQCA->U", "JMVQZRLIYAHCFNSTWK->E", "SZNARFYLTV->H", "NYHFCVRJZQTILESWAOMK->B", "CLVHTFWNASI->M", "INYWRAFVTCLHKZJS->Q", "WNFYLZSHVTAR->K", "FLVTRKZANWSH->C", "JLCVWFKHTRYZEIBQAOM->D", "HVTSNLYAZRF->W" };
    assertEquals(3, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case62() {
    String initial = "FYLKMNNJEFVRKHEBHRZCRTTASQHVZLFTPQGSWIANSVYY";
    String[] reactions = { "HRZSTWAFNLVK->C", "OLZTAKPYBEMFDSQIWJ->G", "KWYAHFLZCSVTNR->I", "SLJVMYNTZQHWCKARIF->E", "LYMAVQIOBEDJKRWNSCZFHT->P", "HYMCKFEAWRINQJOVZLST->B", "RNFETKBHSVWPOYIGQ->X", "MIKQFLNSHJRCVTEYAZW->O", "KWQVZROAHFYTMIBJCEL->D", "HFNLYWZASVRT->K", "YHJKZSCNRLTAVFWI->Q", "FYLATZRNHSV->W", "ATZSYRVFLN->H", "OCJBAFEQGPIVLHS->U", "VSHCNILWAFT->M", "NWKISTZHLCYAVFR->J" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case63() {
    String initial = "ADSJTSPWGFQTZRUGKISMOIWCDMWFJVKATPMLFRHUBPVVOEQOA";
    String[] reactions = { "KFAMJRTSIWGVPLO->Q", "VSADQURHTIFGNKOLWJPM->C", "NFPKVHQCRTUZMOSDGWJAI->B", "NLMVPOITCKQBGFJSHZW->Y", "HIJKUGVAWRFLDOTQPMS->N", "TSVROKWFAM->P", "GOPQSJITAWFRKLVM->U", "VFJOAKGCRQ->Z", "WSTIOFVKLAMPR->G", "RSMVWPFIOTA->L", "AKFVTPWMRSO->I", "ACZKVGBOWU->E", "JSPEZAGVKFLNCWMUBQTOD->X", "QUOVRFGKPAWSIMTLJ->D", "FDVWOSUMJQGKTARILP->H", "SGTMROVIPFWLKA->J" };
    assertEquals(3, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case64() {
    String initial = "WJEPMROFVGHIODDVMFWGKJKTUQSFIAAVTMQPAUVTCRBPSZWOLS";
    String[] reactions = { "OBCUWVAZKG->E", "BJSWLVZFPCTOQKIGNMH->Y", "GRJWPHAKQTSIMVLFDUO->N", "FHVZUAQDJCSINTWOPKMGR->B", "TOWFMVKPSRA->I", "GMLTASPJOWIFRVK->Q", "AGLKFTRMOWIVPS->J", "QJDGLESCTFBPKUMOZVNAW->X", "PINDROWKJALGFTUQHMVS->C", "RPIKSOATLVFMW->G", "MIPTWOFRVSA->L", "SWOIMPGQJVFAUDRTKL->H", "QCGKAVFOJR->Z", "MGLAWVFSUPJIKOQTR->D", "TGRIPJOWLVFSKQMA->U", "TFKWVROAMS->P" };
    assertEquals(3, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case65() {
    String initial = "BOUKBVPATIKWJUYNDVWGPERQDRCFNIUTNFRGCKCLPDJAT";
    String[] reactions = { "IBDGWRNCVJTPUK->M", "POTHMVJKUNZWGCLBDYE->Q", "RIOFNWAGKDUCBTJVPE->Z", "CKAODFERPINJWT->G", "FTJRDOAWNICP->K", "TOAIFJNCWDP->R", "DCBTIRAWPFGKEJON->V", "ZUMARFCNLKTQYPD->X", "TGCFDJREPIWAONK->B", "AWKDOFRTNIJCP->E", "QTVUNGMZCDYPWB->S", "PODWCAFNJT->I", "WAVGJOFRTBPMNEZDICU->Y", "TGUYPOVEWZRB->L", "YMTPLEWJFDUOIZNVGCA->H", "TJVFKOGWBREPINACD->U" };
    assertEquals(3, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case66() {
    String initial = "GBDNTVAFKWUTTJQVLFWKCDOUEURPPRKCCBNPDA";
    String[] reactions = { "NRGFJIAPTWEDCKO->B", "AIJFCDOWTRPN->K", "AWIONDTJCPF->R", "NRKOAPCFJITWD->E", "CUNBPGWKTRDVIJ->M", "DTWIGJKVORFAEUCNPB->Z", "JUMEIVRBOWNPDCZGFAT->Y", "TWCNJOPDFA->I", "KABVIPNGETDFWCJOR->U", "OPTWKRDEFNIJCA->G", "TAURZQKLYPNDCFM->X", "IJETUMYCDVWOPLGNZFA->H", "YNVPZQBUDGCTMW->S", "KUMYGNBTZJCWEPVHDLO->Q", "NBFIJTWPAEKDGCRO->V", "EBVRPZGYOTWU->L" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case67() {
    String initial = "QGPIWHAKUNBKANBBKYJDVEDHMJENEBAAHJNDWMUQUKMCHJUED";
    String[] reactions = { "MAYKWHNQDGIPJECBU->Z", "CHIENQMAWUKJYGBD->P", "TNKCBLDSOJP->R", "KYZEVBNAUHQOMTDSWIGFCPJ->L", "BAMYNHDJEKU->W", "MJUBKACEHWYND->G", "HGQDYWKNCUBAJME->I", "JNUMBHEDKA->Y", "UGKJYMEAWDNBHC->Q", "ZQKEAVJBNUDHC->X", "QPANECZYOUWMIJKVHGDB->T", "YPWHBKACUIJD->O", "ENAIZQHWKVCOBJY->F", "HJUAMKNWYDBE->C", "YFWIMTZQKBVCDGNP->S", "DWJQKMZOYUAHPGE->V" };
    assertEquals(4, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case68() {
    String initial = "GUEANBIAAUHAKWMMNJMEKDWYDEBNNJQVBJPUEHKDCHBQHKJUJD";
    String[] reactions = { "NBTJOSCLDKP->R", "HKVIOYWEQABZJCN->F", "TAQBVOUFKZSCDGJINPHEYMW->L", "NBGAKCMHWJUEDY->Q", "EMGCBWUINHKQYPADJ->Z", "MEWUJDACHKYBN->G", "UPAMWQJHYZKEDGO->V", "JACBKMNHUGWQDYE->I", "WMCKITVFZPBYGDNQ->S", "CIUQNHYKDMBGWJAE->P", "DJQKVNUHEBACZ->X", "PIEGCVZQUANOYHMDKWBJ->T", "DEJBNMUKHA->Y", "YMBKJNUEHAD->W", "ADWKMUJYBHNE->C", "CJIUPAKHBDWY->O" };
    assertEquals(4, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case69() {
    String initial = "CCII";
    String[] reactions = { "QFJ->V", "BE->A", "RKE->F", "EZ->B", "IE->X", "BG->L", "IGS->U", "IZE->M", "BC->Q", "IC->D", "DC->E", "EDF->Y", "HJD->P", "CFR->H", "KWC->J", "ZK->R", "QDH->O", "YH->S", "UCD->T", "ECD->W", "KI->Z", "EC->K", "EVP->N", "BW->G" };
    assertEquals(3, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case70() {
    String initial = "ICC";
    String[] reactions = { "IK->Z", "CE->K", "IZE->M", "DC->E", "BG->L", "HDQ->O", "VPE->N", "ZK->R", "EZ->B", "EI->X", "JDH->P", "RKE->F", "BW->G", "FCR->H", "BE->A", "JFQ->V", "KCW->J", "EFD->Y", "CDE->W", "CI->D", "YH->S", "GIS->U", "CB->Q", "CDU->T" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case71() {
    String initial = "MMMMCCCMCCCCMMMMCCMCC";
    String[] reactions = { "JG->A", "CM->V", "PMF->J", "BV->P", "ZQO->D", "OC->I", "KL->U", "MC->R", "EF->T", "ZVE->S", "MC->O", "ZFE->N", "OIP->G", "UEG->Y", "QVO->F", "YP->H", "CM->L", "OEM->W", "CV->Q", "LE->B", "CVK->Z", "QCV->K", "QLJ->X", "OMC->E" };
    assertEquals(16, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case72() {
    String initial = "CMCMCMCCCCCCMMMMMC";
    String[] reactions = { "FE->T", "OIP->G", "MOE->W", "MC->O", "BV->P", "VQC->K", "EL->B", "MC->L", "EFZ->N", "JQL->X", "JG->A", "VC->Q", "MC->R", "MC->V", "MCO->E", "ZVE->S", "ZQO->D", "MFP->J", "CKV->Z", "OVQ->F", "YP->H", "OC->I", "LK->U", "GUE->Y" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case73() {
    String initial = "DDDLDDDDDLDDDWDDLUDDDDDLDLDDDDDDLLDDDDLULDDLLLDLDL";
    String[] reactions = { "LD->W", "FH->E", "LD->M", "PF->I", "UJ->Y", "DP->F", "FA->C", "UD->H", "LD->U", "EJ->Q", "FA->Z", "WP->O", "KZ->B", "TC->V", "JP->R", "UD->N", "UZ->G", "FH->K", "SK->A", "DN->S", "WN->P", "NP->T", "DZ->J", "RB->X" };
    assertEquals(49, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case74() {
    String initial = "DDLLLDDDDDDDLDDDDDDDDLDLDDUDDLDLDDLL";
    String[] reactions = { "BR->X", "DZ->J", "DP->F", "FA->Z", "NW->P", "LD->W", "JU->Y", "HF->E", "JP->R", "LD->M", "HF->K", "ZK->B", "PF->I", "KS->A", "WP->O", "ZU->G", "ND->S", "NP->T", "LD->U", "UD->N", "TC->V", "UD->H", "FA->C", "EJ->Q" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case75() {
    String initial = "OOOLLOLLLOLL";
    String[] reactions = { "LO->B", "OL->D", "IB->U", "AO->M", "LO->F", "TP->Z", "GO->J", "PW->Y", "FD->H", "SR->X", "UF->R", "VK->N", "OF->V", "OV->W", "LN->C", "LV->K", "PM->Q", "PT->G", "OV->A", "LP->I", "LV->S", "SF->E", "FL->P", "DF->T" };
    assertEquals(11, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case76() {
    String initial = "LOOLLOOLLL";
    String[] reactions = { "LV->K", "OA->M", "PT->G", "FU->R", "PL->I", "RS->X", "LV->S", "PT->Z", "SF->E", "LN->C", "FD->H", "BI->U", "GO->J", "LO->B", "LO->F", "OF->V", "PW->Y", "OV->W", "MP->Q", "LF->P", "OL->D", "OV->A", "KV->N", "FD->T" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case77() {
    String initial = "OAMBOYYOBPOAOBBBPAAYMAMOYABYO";
    String[] reactions = { "YU->E", "NDQV->S", "KMI->N", "DLFJ->H", "IYPM->W", "UCT->D", "WEN->G", "UK->Q", "OBYM->C", "AO->U", "GJ->X", "BAOY->K", "ECT->V", "OYBP->T", "DL->Z", "KIT->L", "OAB->I", "LWDN->R", "ETNW->F", "NT->J" };
    assertEquals(14, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case78() {
    String initial = "OYAMOBYBOPAOYYOMOAYOBAPAABBB";
    String[] reactions = { "LDJF->H", "UK->Q", "LWDN->R", "ITK->L", "TWEN->F", "OPBY->T", "WEN->G", "TCU->D", "MPIY->W", "BYMO->C", "TN->J", "QDVN->S", "CTE->V", "AO->U", "JG->X", "ABOY->K", "IKM->N", "UY->E", "BAO->I", "DL->Z" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case79() {
    String initial = "JOOTJOCKIKTCCTIJJJKKCCKTJJOCOKIOIHICKTKWCTIKCCTJK";
    String[] reactions = { "ZGQPVO->D", "ICJ->H", "KATPOCQ->S", "KJOIC->U", "PZOK->N", "VGQESPA->R", "AQUTVHP->F", "TJICHOK->Q", "ZWLEQ->B", "UNSZ->M", "TKOC->P", "JTK->Z", "AZEGUPL->Y", "PFN->X", "AIZ->E", "KHI->L", "WCTKOJ->G", "TKCWAHJ->V", "JKIC->A" };
    assertEquals(14, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case80() {
    String initial = "KTIOKKKCICKOCTICOIJKTJTCKTOCIJJJJTWJTOHKCKTCCCOJKI";
    String[] reactions = { "CIOKJ->U", "IKH->L", "JOKCTIH->Q", "JCI->H", "IZA->E", "EZLQW->B", "VTQPHUA->F", "LPEAZGU->Y", "GPVQOZ->D", "IJCK->A", "KZPO->N", "EAQPGSV->R", "SNUZ->M", "KOCT->P", "PFN->X", "OCWTJK->G", "JAWCHKT->V", "TKJ->Z", "PQAKCTO->S" };
    assertEquals(14, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case81() {
    String initial = "AEHWDDCHCAAHDEEADWAAWHFCEWWDEEHAEHAEAHWHDHEEC";
    String[] reactions = { "ADMOHCE->J", "ESWH->B", "NBIYLV->X", "OIMJ->G", "SVFIC->K", "WCEDA->N", "MCHNS->Y", "NOS->Q", "RLQJ->Z", "DWAEH->M", "QNBVYJ->U", "EMDS->V", "ILNWMSD->P", "EAH->S", "MWF->R", "EAHD->O", "OISJ->T", "DAHW->L", "SFC->I" };
    assertEquals(14, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case82() {
    String initial = "WHEDEWWCHEAAEAWEAEHDAHACCEWCEHHDAHDDAEFHE";
    String[] reactions = { "DAWHE->M", "HMNCS->Y", "OSN->Q", "IVLNYB->X", "WSHE->B", "CSVFI->K", "QBVNJY->U", "COEDHAM->J", "JIMO->G", "DEWAC->N", "AHE->S", "LJRQ->Z", "EDHA->O", "SFC->I", "FMW->R", "HDAW->L", "OISJ->T", "ESMD->V", "LDSNMWI->P" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case83() {
    String initial = "VAIAVAVA";
    String[] reactions = { "AI->Q", "UV->E", "VA->B", "VM->N", "JG->L", "PD->H", "ON->Y", "IU->W", "IV->P", "AV->D", "SR->X", "UO->C", "BH->F", "PO->T", "PO->K", "HO->Z", "VA->J", "BI->G", "AH->S", "AJ->R" };
    assertEquals(7, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case84() {
    String initial = "IUNG";
    String[] reactions = { "SU->W", "MC->E", "IN->Y", "UG->R", "BP->O", "JU->D", "NA->L", "YJ->V", "MU->K", "MS->T", "GI->F", "CU->B", "GU->S", "JP->Q", "RY->X", "GP->Z", "IG->P", "AY->H", "IG->J", "PR->A" };
    assertEquals(3, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case85() {
    String initial = "FWIQHQRISPTGFEJUQJWYSCLRRRLOANUTCCUJSFTJRKSLWTYYPG";
    String[] reactions = { "DW->O", "PRL->J", "UGO->M", "ISUT->L", "LP->F", "NCL->R", "DO->Y", "ZAM->V", "QV->B", "RJYW->Z", "TZHU->D", "QLF->W", "WHKX->I", "QBW->P", "NLGJ->C", "ND->E", "CZ->X", "XJ->N", "IQZ->T", "TA->K", "NXJ->S", "OZES->G", "SD->Q", "GQ->H", "SAEF->U", "YD->A" };
    assertEquals(2, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case86() {
    String initial = "ITUGLJPRYCRLRQTIOKQSFYNJTURSWTHFUACPCSWJRSJFYEQLW";
    String[] reactions = { "TA->K", "DN->E", "LGNJ->C", "VQ->B", "LNC->R", "DW->O", "ZC->X", "DO->Y", "JX->N", "ESOZ->G", "SD->Q", "QG->H", "QFL->W", "WBQ->P", "TISU->L", "WXHK->I", "JXN->S", "YD->A", "PL->F", "IQZ->T", "AZM->V", "UZHT->D", "EFSA->U", "OGU->M", "RPL->J", "YRWJ->Z" };
    assertEquals(2, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case87() {
    String initial = "VYEWYCGTDJDHDAMOTHASFBQLFTRPPJOFISZIEMMBKI";
    String[] reactions = { "BGM->T", "EIAB->W", "GTMHJ->K", "WU->G", "TUP->F", "OUKAWVEFYQZTDHGNRLC->B", "UNDMTCOFWXE->Q", "ONHDCBQXY->J", "IDURXPYF->L", "KMLFZBRAXNGYUVCWETQP->D", "MIUOAWPZYR->C", "JTYMHFBDXEKOGAQSL->P", "DMOIWETNR->S", "JRBTQ->H", "ALFQJGWIOZ->Y", "FDWO->N", "ICGFSAVRJNXTBKZEHPW->O", "HRUZBIPCDNWJVLYMFQKOSTAE->X", "HJGDYNTZSLKMFCBE->V", "TSYKDFPMI->U", "LDSMQHZFCKPVIWTB->E", "BLFCH->I", "MDQB->Z", "EKQVRYDIFJCBW->A", "YZDFLSJAVONXMB->R", "QUFYVPLDRXHWAOBNGCT->M" };
    assertEquals(5, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case88() {
    String initial = "OQEPMAFITDGTMCDYYWIPZEZHLDFVJMFSHKIJBOSTRAB";
    String[] reactions = { "DETINOMRW->S", "QLRNISZEFVAWJYHOUTBCDMKP->X", "BDMQ->Z", "LFBHC->I", "AFJLWGIOQZ->Y", "DFJVECRKWQYIB->A", "FOWD->N", "FIXYDRPU->L", "UPT->F", "TEMKGCLYNBJSFHDZ->V", "PURYWMIZOA->C", "TRJBQ->H", "FNLWUMZQEPABVKRCYGXT->D", "DEFWOXMUTCN->Q", "UOHFNQRLWKDCAVEYGTZ->B", "NDLYFSAVOBXJMZ->R", "GBM->T", "JMHGT->K", "CXBNHDQYO->J", "AIBE->W", "VLDMQZCHWPTKISFB->E", "CNTJSBIHEFXZWKGVARP->O", "DCALORQTWUFGXYVNPBH->M", "BJYLXEGTAMOKQDSHF->P", "UW->G", "YFSDTIPKM->U" };
    assertEquals(5, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case89() {
    String initial = "NJVPNGLSHLRHDFSMOQEVGTKEYUMZKWDRAQITBIFJB";
    String[] reactions = { "QTAMCOJYVLHRIFNSKEPDUGBZW->X", "OXQSRUEBDCVKNWGFYJI->P", "JWDSRZIENQGCTYXFP->U", "NSODWAIKEGXQCZBFLVPTJ->R", "OBMEJRQLCWYGHD->N", "XJFQLGYSRE->W", "IXWQNBKDOLCVSAURHY->F", "KXHJRSFLOBVAMUDEPIQZC->Y", "BQYUTOJDGRVZHPFWAKXIC->S", "KLDBXFIMVUGQRZSY->E", "HLJAIBVNOYPMU->T", "OMERQPNJUIBFTDWSHXCZGAL->K", "VZKFYXRAIOUJW->L", "GRKVXAETHPLJM->B", "CPLESYRBHFMVKX->J", "KRQNHDFMELSVIGBTJ->C", "QBTZXPRSEUKFMGICN->A", "VJUTGHDNRC->M", "HGELPTWZYDNJVQBXA->O", "XEHKUMYWNGVROIFTCJQ->D", "YDIJOKTEFN->V", "GPZEKALFYSMVOCBUQNWHDT->I", "GDMAZTYBPQKENVXIJUCSW->H", "MVCWFRDNJHGAPLSTUYZKEXIO->Q", "OJTDSULQIBG->Z", "MXECARFOHWTBSVDNQJYIPL->G" };
    assertEquals(2, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case90() {
    String initial = "TRJLKTPQABSGGVBYOQHZRSFFVLJDEEIKUHMDNIN";
    String[] reactions = { "YQPIAZGVEWBNUSMDJXCTK->H", "THNDUVJRGC->M", "GQMNHRWXUYJTKIOCFVE->D", "FICEXRBMQPGTUNSKZ->A", "INDFMTQRSBHJLEGVK->C", "AQWXZDJYPELHVNBGT->O", "XKOEJFGQNVUCISYDRWB->P", "RNTEBASHWZDOIUGJKQFPMCLVY->X", "QNWBJOXLYIEACPRMHSVFDT->G", "YOMPVNBJHULIA->T", "MJLQGCRBEWHOYD->N", "UXNCOIWLADQRHYKSBV->F", "ZUPTCSHQOENALBGVFDKYWM->I", "FWIRUYKXAJVOZ->L", "HLDAXPKIUVCOFQMJEZSBR->Y", "SJQFLGRXEY->W", "LPWBSVGAJQXOTFDICEKNZ->R", "MGQHSPBWUETICZOXDAJFNRL->K", "VMGXARPTEHLKJ->B", "MUVQBYKZDGFSRXLI->E", "QSTOLGIDJBU->Z", "FRSTPGXNZDCQJIEYW->U", "KOTLWMPVXZUDNCAJEFHGSRYI->Q", "HCGWXRQTZKDOPJFYVBAIU->S", "XBLRSMKEPCYVHF->J", "NETIJYFODK->V" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case91() {
    String initial = "IJKHHMSDPUEKMPSCUAQWNRTCTHDEIYWGDWYQATOMKOLJB";
    String[] reactions = { "EGBDXRMVOTLIQPNFKHJASZYUW->C", "EQNSKYPVHZXGDJMTAOBWF->I", "BSZINJXGWEOFQARUPCMYVTLD->H", "EMQIPFNDBHUORGLYJCSTAKXVZ->W", "TWORYGXZKEJFDASUIBCLHVM->P", "CPXHSOWZRNYQMAGUFKTJ->E", "KFTOMSHGBLAZIVPUQCNRWXJ->D", "KMFGEVCSXWDQBYILOJ->T", "DSFCTYWHGXAMLPBNOIKVU->Q", "QUEWCVXSMZKYJTNPFAHRGID->O", "XFBCLKPSWUJQDIRYANVE->M", "FQTBWZUNHVSEJDP->A", "BNOIRLUGYWQSAFHTXCMVJE->K", "HQJKPNZSDYAX->B", "VDUAMLWQEKYTSNX->Z", "UAEYZPTRQXGBWFVOIK->J", "FQBZHRIMYSONPEVC->G", "EMCKIZXQBRYFVJNGSPHU->L", "ODCRTUQWIALHNG->S", "BOGADFZSMQTYKCWUE->N", "WJHMSRKPOYTD->F", "LEBYIFQGNDKMHTWOCAU->V", "UAQCEHVTWMDSIJPK->X", "MJICXEVTNHFO->U", "WYVUENJSFKOBTAZMDQHLXGC->R", "SPZWVKCELIXTRGQU->Y" };
    assertEquals(3, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case92() {
    String initial = "HDYAUGDKMIPWHWQOUSSQKTOEPMJTWINBMKLSYECAJCDHRT";
    String[] reactions = { "WQTZGSUKVLPRIXCE->Y", "PRHGIZVAUQDCKTFWSMYXEJN->O", "EPOBZKQHSNGMJFADXYWTV->I", "LQKFTCNVDJWXZBOYAMHGEUS->R", "GCFXKVAITUMDOSBWLHNPY->Q", "WQVSBPHUJZNDEFT->A", "WOSCEQKZMABTFYUGD->N", "SJPYMWORHDTK->F", "IAUTHRWODLCNQG->S", "FUSIGVCHZXEKQBPJMNYR->L", "SQKHPXJNZDYA->B", "NBOZIMPEFHRYQVSC->G", "AZOTYUKBQEGWFPVXRI->J", "VYRSPFQEKCUWAJILXBND->M", "CKTAFGVMPJOUBQZRHLXIWNS->D", "FMURHJTKXGQZCAYNWSPO->E", "LBWHFTYDENOKMIUAQCG->V", "OGJZUDCNFMEVPAWQSBRXILYT->H", "QPESCVHAIJWTDMKU->X", "NUXQLWTVADMKYSE->Z", "LAJRFXHBTEQWCNOMVIUGYS->K", "CTISYOXZDVRFJALUEBWKHMG->P", "KSYQLOEDMVCIWXJFBG->T", "OHPEJYBDZGAFXLQMKTWVSINRU->C", "SCXMHFYQORUZLPIVEDJKTGANB->W", "FHCVIXMONJTE->U" };
    assertEquals(3, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case93() {
    String initial = "KWDCNDHGLFQGPKUPLZNCVVSHBDWESSQHWBYYNGGJNPYISLAHDS";
    String[] reactions = { "HS->N", "YW->H", "NFS->M", "BPJ->L", "ALS->R", "FH->B", "EDV->U", "KC->V", "WOB->Z", "QNC->E", "CA->G", "HL->A", "MD->J", "TUN->K", "IA->S", "GTH->Q", "KU->Y", "NU->I", "GH->W", "PS->D", "WJI->X", "ZLS->F", "AE->O", "ILE->T", "WDL->C", "NZV->P" };
    assertEquals(1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case94() {
    String initial = "KLNPDVCYPHHWDDWGLJSGNFLSBSNIUZNSKBADEQVWYHGGSQY";
    String[] reactions = { "SLA->R", "TGH->Q", "HS->N", "WJI->X", "BPJ->L", "HF->B", "NU->I", "EIL->T", "DEV->U", "UTN->K", "BWO->Z", "AC->G", "MD->J", "SP->D", "SFN->M", "ZLS->F", "NQC->E", "KC->V", "YW->H", "NZV->P", "DWL->C", "UK->Y", "EA->O", "HG->W", "LH->A", "AI->S" };
    assertEquals(1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case95() {
    String initial = "URWQMCQVEWCRTESKPNJVKCQNTMPQCVNJVZJEJKZJFWMJJCRATV";
    String[] reactions = { "AP->R", "WR->A", "JT->Z", "FS->C", "RK->N", "FQ->O", "DJ->H", "PT->J", "ZV->P", "WC->F", "FP->K", "ZS->Q", "KZ->L", "TI->G", "HU->W", "TU->I", "NC->M", "TZ->U", "MV->T", "QM->V", "WJ->E", "JP->Y", "QR->D", "EJ->S", "YZ->X", "QK->B" };
    assertEquals(2, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case96() {
    String initial = "MCTNCJPQRCTVUQRMNWAEJWRQVPJKJMZSTJFKCENCKEVVZJVQJ";
    String[] reactions = { "WJ->E", "WR->A", "TP->J", "KZ->L", "ZY->X", "QF->O", "VZ->P", "JD->H", "UT->I", "JP->Y", "MQ->V", "UH->W", "KQ->B", "SF->C", "KR->N", "WC->F", "JT->Z", "SZ->Q", "IT->G", "QR->D", "NC->M", "TZ->U", "MV->T", "PF->K", "PA->R", "EJ->S" };
    assertEquals(2, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case97() {
    String initial = "QKVGYCUIASBDDUIGSWJQTJWLVUBFWIUZNNKQVLYCSSUVZYNN";
    String[] reactions = { "OINXY->V", "EYPZ->I", "DBWTE->X", "GNZIVU->T", "DYQUJSC->E", "FND->L", "CZU->S", "YPIMWZF->R", "RCNLP->H", "STQKBWZ->C", "WLUY->D", "SVJXMF->A", "NPM->O", "KENT->Y", "UWL->F", "RSFG->J", "PMRAI->U", "IYVC->Q", "PHAZ->K", "SAFN->G", "QLVG->Z", "GVQXY->P", "AICXE->B", "GORUE->M", "WSKO->N", "PIEL->W" };
    assertEquals(2, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case98() {
    String initial = "AILQSDQWCTVJUZFSJBDZWULGNKBUNVUWSVQIINGNYVUCYSYLK";
    String[] reactions = { "NKET->Y", "TDEWB->X", "KTWBQSZ->C", "SVXFMJ->A", "ZAHP->K", "EYPZ->I", "AICXE->B", "LQGV->Z", "NCPRL->H", "SOKW->N", "LPIE->W", "UWL->F", "IAPRM->U", "NDF->L", "UEROG->M", "ZUC->S", "PWZIMYF->R", "WLUY->D", "ZINVGU->T", "YSQDJUC->E", "GVXYQ->P", "NASF->G", "RSFG->J", "NOXIY->V", "VCIY->Q", "PMN->O" };
    assertEquals(2, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case99() {
    String initial = "BECRQRUTHUMRVUTVUDVYLLFDBAIARPDDLBUUGEKEAPQPRTSRRF";
    String[] reactions = { "KPXUJF->B", "DUVPZAS->Q", "PNEMZ->G", "ITOVBRX->K", "BSLNVKF->T", "XRK->I", "XBYG->W", "PRL->O", "BURVDLP->H", "IZBKWN->Y", "VHPQRJ->C", "USPE->V", "RKEC->F", "QKEHV->M", "IAUW->R", "ZQEVFAS->X", "FEBJ->L", "YXBZRFO->J", "DBZEMTR->U", "QPHJG->N", "HDUYKV->A", "UHR->Z", "AZDUV->P", "PAQFI->S", "GDT->E", "FLTY->D" };
    assertEquals(2, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case100() {
    String initial = "RAUVEAEUQUVPDSFQMATIUPURGBHTRTKDYRCLV";
    String[] reactions = { "VHKYUD->A", "DEZMBRT->U", "GQPJH->N", "BFEJ->L", "XRBZFYO->J", "TGD->E", "PSVUADZ->Q", "ZNMEP->G", "VUZDA->P", "TBVIXOR->K", "KVHEQ->M", "UESP->V", "RLP->O", "YBGX->W", "KXR->I", "FTYL->D", "INZWKB->Y", "RKCE->F", "JFKXUP->B", "DLPURVB->H", "AWUI->R", "QFPAI->S", "SFQVEAZ->X", "UHR->Z", "QRVJPH->C", "LNFKSBV->T" };
    assertEquals(2, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case101() {
    String initial = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBCC";
    String[] reactions = { "AB->C", "AC->D", "CD->E", "DE->F", "EF->G", "FG->H", "CDEFGH->X" };
    assertEquals(45, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case102() {
    String initial = "X";
    String[] reactions = { "AB->C" };
    assertEquals(0, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case103() {
    String initial = "A";
    String[] reactions = { "AB->C" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case104() {
    String initial = "A";
    String[] reactions = { "AB->X" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case105() {
    String initial = "A";
    String[] reactions = { "BA->X", "XA->B" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case106() {
    String initial = "A";
    String[] reactions = { "BA->X", "CA->B", "BA->C" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case107() {
    String initial = "Z";
    String[] reactions = { "BZ->X", "CZ->B", "BZ->C" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case108() {
    String initial = "AAXB";
    String[] reactions = { "BZ->Y", "ZY->X", "AB->Z" };
    assertEquals(0, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case109() {
    String initial = "AABBB";
    String[] reactions = { "BZ->Y", "ZY->X", "AB->Z", "AZ->W" };
    assertEquals(4, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case110() {
    String initial = "ABCDEFGHIJKLMNOPQRSTUVWYZABCDEFGHIJKLMNOPQRSTUVWYZ";
    String[] reactions = { "ABCE->Z", "RTYUIO->P", "QWER->T", "MN->B", "AB->X" };
    assertEquals(1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case111() {
    String initial = "DDDDDDDDDDDDDDDDDDDDDDDDDDDD";
    String[] reactions = { "ABC->X", "AB->C", "AC->B", "BC->A" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case112() {
    String initial = "ZZZZZZZZZABBAAAAAAAAAAAAAABBAAA";
    String[] reactions = { "BCDEFGHIJKLMNOPQRSTUVWXY->A", "ACDEFGHIJKLMNOPQRSTUVWXY->B", "ABDEFGHIJKLMNOPQRSTUVWXY->C", "ABCEFGHIJKLMNOPQRSTUVWXY->D", "ABCDFGHIJKLMNOPQRSTUVWXY->E", "ABCDEGHIJKLMNOPQRSTUVWXY->F", "ABCDEFHIJKLMNOPQRSTUVWXY->G", "ABCDEFGIJKLMNOPQRSTUVWXY->H", "ABCDEFGHJKLMNOPQRSTUVWXY->I", "ABCDEFGHIKLMNOPQRSTUVWXY->J", "ABCDEFGHIJLMNOPQRSTUVWXY->K", "ABCDEFGHIJKMNOPQRSTUVWXY->L", "ABCDEFGHIJKLNOPQRSTUVWXY->M", "ABCDEFGHIJKLMOPQRSTUVWXY->N", "ABCDEFGHIJKLMNPQRSTUVWXY->O", "ABCDEFGHIJKLMNOQRSTUVWXY->P", "ABCDEFGHIJKLMNOPRSTUVWXY->Q", "ABCDEFGHIJKLMNOPQSTUVWXY->R", "ABCDEFGHIJKLMNOPQRTUVWXY->S", "ABCDEFGHIJKLMNOPQRSUVWXY->T", "ABCDEFGHIJKLMNOPQRSTVWXY->U", "ABCDEFGHIJKLMNOPQRSTUWXY->V", "ABCDEFGHIJKLMNOPQRSTUVXY->W", "ABCDEFGHIJKLMNOPQRSTUVWY->X", "ABCDEFGHIJKLMNOPQRSTUVWX->Y" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case113() {
    String initial = "GGGGGG";
    String[] reactions = { "AG->X", "BC->A", "AC->B", "AB->C" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case114() {
    String initial = "ABCDEFGHIJKLMNOPQRSTUVWYZABCDEFGHIJKLMNOPQRSTUVWYZ";
    String[] reactions = { "ABCE->Z", "RTYUIO->X", "QWER->T", "MN->B" };
    assertEquals(1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case115() {
    String initial = "A";
    String[] reactions = { "AB->X", "AX->B", "BX->A" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case116() {
    String initial = "AABBB";
    String[] reactions = { "BZ->Y", "ZY->X", "AB->Z" };
    assertEquals(4, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case117() {
    String initial = "AAAZY";
    String[] reactions = { "YZW->X", "WZ->Y", "WY->Z", "YZ->W" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case118() {
    String initial = "AAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBB";
    String[] reactions = { "AB->C", "BC->D", "CD->E", "DE->F", "EF->G", "FG->H", "GH->I", "HI->J", "IJ->K", "JK->L", "KL->M", "LM->N", "MN->O", "NO->P", "OP->Q", "PQ->R", "QR->S", "RS->T", "ST->U", "TU->V", "UV->W", "VW->X" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case119() {
    String initial = "ABCDEF";
    String[] reactions = { "ABCDE->F", "ACDEF->G", "CDEFG->H", "DEFGH->I", "EFGHI->J", "FGHIJ->K", "GHIJK->L", "HIJKL->M", "IJKLM->N", "JKLMN->O", "KLMNO->P", "LMNOP->Q", "MNOPQ->R", "NOPQR->S", "OPQRS->T", "PQRST->U", "QRSTU->V", "RSTUV->W", "STUVW->Y", "TUVWY->Z", "UVWYZ->X", "FG->A", "FG->B", "FG->C", "FG->D", "FG->E" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case120() {
    String initial = "Y";
    String[] reactions = { "XY->Z", "XZ->Y", "YZ->X" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case121() {
    String initial = "A";
    String[] reactions = { "XY->Z", "ZX->Y", "YZ->X" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case122() {
    String initial = "B";
    String[] reactions = { "AB->X", "CD->A", "AB->C" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case123() {
    String initial = "ABCDEFGHIJKLMNOPQRSTUVWYZABCDEFGHIJKLMNOPQRSTUV";
    String[] reactions = { "AB->C", "BC->D", "CD->E", "DE->F", "EF->G", "FG->H", "GH->I", "HI->J", "IJ->K", "JK->L", "KL->M", "LM->N", "MN->O", "NO->P", "OP->Q", "PQ->R", "QR->S", "RS->T", "ST->U", "TU->V", "UV->W", "WX->Y", "XY->Z", "YZ->A", "ZA->B" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case124() {
    String initial = "AACC";
    String[] reactions = { "ABCE->X", "AE->B", "AB->E" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case125() {
    String initial = "ACD";
    String[] reactions = { "ABC->X", "AB->C", "BC->A", "AC->B" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case126() {
    String initial = "ABCDEFGHIJKLMNOPQRSTUVWYZABCDEFGHIJKLMNOPQRSTUVWYZ";
    String[] reactions = { "ABCE->Z", "RTYUIO->P", "QWER->T", "MN->B", "BC->A", "NDB->C", "OIU->D", "ABV->E", "IYT->F", "QWER->G", "XCZV->H", "LP->I", "IUY->J", "ERT->K", "MO->L", "AC->M", "BS->N", "QW->O", "OP->Q", "TE->R", "VB->S", "TR->U", "AB->V", "KL->W", "AT->X", "ZX->Y" };
    assertEquals(1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case127() {
    String initial = "YYYYYYYYYYYYYYYYYYYYYYYYYZZZZZZZZZZZZZZZZZZZZZZZZZ";
    String[] reactions = { "YZ->A", "ZY->B", "ZY->C", "ZY->D", "ZY->E", "YZ->F", "ZY->G", "ZY->H", "ZY->I", "ZY->J", "YZ->K", "ZY->L", "ZY->M", "ZY->N", "ZY->O", "YZ->P", "ZY->Q", "ZY->R", "ZY->S", "ZY->T", "YZ->U", "ZY->V", "ZW->X" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case128() {
    String initial = "A";
    String[] reactions = { "XY->Z", "YZ->X", "ZX->Y" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case129() {
    String initial = "AAAAAAAAAAAAAAABBBBBBBBBBBBBBBBB";
    String[] reactions = { "AB->C", "CA->D", "CA->E", "CDE->X" };
    assertEquals(6, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case130() {
    String initial = "ABC";
    String[] reactions = { "YZ->X", "XZ->Y" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case131() {
    String initial = "ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE";
    String[] reactions = { "YZ->X", "XZ->Y", "XY->Z" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case132() {
    String initial = "ABCDEFGHIJKLMNOPQRSTUVWYZABCDEFGHIJKLMNOPQRSTUVWYZ";
    String[] reactions = { "AB->C", "BC->D", "CD->E", "DE->F", "EF->G", "FG->H", "GH->I", "HI->J", "IJ->K", "JK->L", "KL->M", "LM->N", "MN->O", "NO->P", "OP->Q", "PQ->R", "QR->S", "RS->T", "ST->U", "TU->V", "UV->W", "WX->Y", "XY->Z", "YZ->A", "ZA->B" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case133() {
    String initial = "A";
    String[] reactions = { "AB->C", "BC->A", "CA->B", "ABC->X" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case134() {
    String initial = "ABCD";
    String[] reactions = { "XY->Z", "YZ->X", "ZX->Y" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case135() {
    String initial = "ABCDEFGHIJKLMNOPQRSTUVWYABCDEFGHIJKLMNOPQRSTUVWY";
    String[] reactions = { "AB->C", "BC->D", "CD->E", "DE->F", "EF->G", "FG->H", "GH->I", "HI->J", "IJ->K", "JK->L", "KL->M", "LM->N", "MN->O", "NO->P", "OP->Q", "PQ->R", "QR->S", "RS->T", "ST->U", "TU->V", "UV->W", "WZ->X" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case136() {
    String initial = "AB";
    String[] reactions = { "AB->C", "BC->A", "AC->B", "ABC->X" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case137() {
    String initial = "AAAAAAAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBBBBBBB";
    String[] reactions = { "AC->B", "AB->C", "AB->D", "AB->E", "AB->F", "AB->G", "AB->H", "AB->I", "AB->J", "AB->K", "AB->L", "AB->M", "AB->N", "AB->O", "AB->P", "AB->Q", "AB->R", "AB->S", "AB->T", "AB->U", "AB->V", "AB->W", "AB->Y", "AB->Z", "STUVWYZ->X" };
    assertEquals(8, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case138() {
    String initial = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    String[] reactions = { "AK->B", "AB->C", "AC->D", "AD->E", "AE->F", "AF->G", "AG->H", "AH->I", "AI->J", "AJ->K", "KJ->A", "KJ->X" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case139() {
    String initial = "ABCABBABQEUIOPADFGHJKLCBNMEFBAEFBAACDAABBAA";
    String[] reactions = { "AYZ->X", "AB->R", "BR->S", "AS->T", "BT->Z", "VW->Y", "VB->W", "AB->V", "AB->C", "BC->D", "CD->E", "DE->F", "EF->G", "FG->H", "GH->I", "HI->J", "IJ->K", "JK->L", "KL->M", "LM->N", "MN->O", "NO->P", "RS->A", "ST->B" };
    assertEquals(9, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case140() {
    String initial = "A";
    String[] reactions = { "XB->A", "AB->X", "XA->B" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case141() {
    String initial = "ABCDEFGHIJKLMNABCDEFLBJ";
    String[] reactions = { "AB->Z", "BC->T", "VC->S", "SB->L", "LA->B", "BS->E", "EI->J", "AC->I", "SV->X", "SL->H", "ZE->V" };
    assertEquals(6, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case142() {
    String initial = "AAAAAAAAAAAAAAAACCCCCCCCCCCCCCCCCCCBBBBBBBBBBBBBBB";
    String[] reactions = { "BD->X", "AC->B", "BC->A", "AB->C", "BX->Y" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case143() {
    String initial = "A";
    String[] reactions = { "AB->X", "AX->B" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case144() {
    String initial = "AAAAAAAAAAAAAAABBBBBBBBBBBBBBBCCCCCCCCCC";
    String[] reactions = { "AB->C", "BC->A", "AC->B", "KG->X", "GL->K", "UW->Z" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case145() {
    String initial = "AB";
    String[] reactions = { "ABD->X", "AB->D", "AD->B", "BD->A" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case146() {
    String initial = "AAABB";
    String[] reactions = { "CD->X", "CE->D", "DE->C", "CD->E" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case147() {
    String initial = "AB";
    String[] reactions = { "FA->X", "FA->C", "CA->F" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case148() {
    String initial = "C";
    String[] reactions = { "AB->X", "AX->B", "XB->A" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case149() {
    String initial = "AAAAAAAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBBBBBBB";
    String[] reactions = { "AB->C", "AB->D", "AB->E", "AB->F", "AB->G", "AB->H", "AB->I", "CD->J", "CD->K", "CD->L", "CD->M", "CD->N", "EJ->O", "EJ->P", "EJ->Q", "EJ->R", "EJ->S", "EJ->T", "EJ->U", "EJ->V", "ABCEDFGHIJKLMQ->X" };
    assertEquals(25, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case150() {
    String initial = "AZY";
    String[] reactions = { "AB->X", "BD->A", "AC->B", "AB->D", "AB->C" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case151() {
    String initial = "YZ";
    String[] reactions = { "AB->X", "BC->A", "AC->B" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case152() {
    String initial = "X";
    String[] reactions = { "ABCE->Z", "RTYUIO->P", "QWER->T", "MN->B" };
    assertEquals(0, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case153() {
    String initial = "AAAAA";
    String[] reactions = { "CA->X", "CX->A", "AX->C" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case154() {
    String initial = "X";
    String[] reactions = { "FE->X" };
    assertEquals(0, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case155() {
    String initial = "DEF";
    String[] reactions = { "AC->B", "AB->C", "BC->A", "BC->X" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case156() {
    String initial = "AB";
    String[] reactions = { "AX->Y", "BY->X" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case157() {
    String initial = "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ";
    String[] reactions = { "BCDEFGHIJKLMNOPQRSTUVWXY->A", "ACDEFGHIJKLMNOPQRSTUVWXY->B", "ABDEFGHIJKLMNOPQRSTUVWXY->C", "ABCEFGHIJKLMNOPQRSTUVWXY->D", "ABCDFGHIJKLMNOPQRSTUVWXY->E", "ABCDEGHIJKLMNOPQRSTUVWXY->F", "ABCDEFHIJKLMNOPQRSTUVWXY->G", "ABCDEFGIJKLMNOPQRSTUVWXY->H", "ABCDEFGHJKLMNOPQRSTUVWXY->I", "ABCDEFGHIKLMNOPQRSTUVWXY->J", "ABCDEFGHIJLMNOPQRSTUVWXY->K", "ABCDEFGHIJKMNOPQRSTUVWXY->L", "ABCDEFGHIJKLNOPQRSTUVWXY->M", "ABCDEFGHIJKLMOPQRSTUVWXY->N", "ABCDEFGHIJKLMNPQRSTUVWXY->O", "ABCDEFGHIJKLMNOQRSTUVWXY->P", "ABCDEFGHIJKLMNOPRSTUVWXY->Q", "ABCDEFGHIJKLMNOPQSTUVWXY->R", "ABCDEFGHIJKLMNOPQRTUVWXY->S", "ABCDEFGHIJKLMNOPQRSUVWXY->T", "ABCDEFGHIJKLMNOPQRSTVWXY->U", "ABCDEFGHIJKLMNOPQRSTUWXY->V", "ABCDEFGHIJKLMNOPQRSTUVXY->W", "ABCDEFGHIJKLMNOPQRSTUVWY->X", "ABCDEFGHIJKLMNOPQRSTUVWX->Y" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case158() {
    String initial = "AAAAAAAAAAAAA";
    String[] reactions = { "AB->X", "CA->B", "BA->C" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case159() {
    String initial = "ABABABABABABABABAAAAAAAAAAAAAABBBBBBBBBBBBBBCDIJ";
    String[] reactions = { "AB->C", "AB->D", "CD->E", "CD->F", "EF->G", "EF->H", "GH->I", "GH->J", "IJ->K", "IJ->R", "KR->Y", "YZ->X" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case160() {
    String initial = "B";
    String[] reactions = { "AB->X", "BC->A", "CA->B" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case161() {
    String initial = "ABCDE";
    String[] reactions = { "ABC->F", "FE->X" };
    assertEquals(2, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case162() {
    String initial = "AAABBCD";
    String[] reactions = { "BZ->Y", "ZY->X", "AB->Z", "CD->B" };
    assertEquals(5, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case163() {
    String initial = "ABFE";
    String[] reactions = { "AB->C", "FE->X" };
    assertEquals(1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case164() {
    String initial = "X";
    String[] reactions = { "AB->C" };
    assertEquals(0, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case165() {
    String initial = "AAAAAAAAAAAAAAA";
    String[] reactions = { "AB->C", "AC->B", "BC->A", "AB->X" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case166() {
    String initial = "ABCDEFGHIJKLMNOPQRSTUVWY";
    String[] reactions = { "AB->C", "BC->D", "CD->E", "DE->F", "EF->G", "ZA->X", "FG->H", "GH->I", "HI->J", "IJ->K", "JK->L", "KL->M", "LM->N", "MN->O", "NO->P", "OP->Q", "PQ->R", "QR->S", "RS->T", "ST->U", "TU->V", "UV->W", "VW->Y" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case167() {
    String initial = "A";
    String[] reactions = { "BC->X", "XC->B" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case168() {
    String initial = "EF";
    String[] reactions = { "ABC->X", "AB->C", "CB->A", "AC->B" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case169() {
    String initial = "ABDEFOPQRSTUVW";
    String[] reactions = { "BCDEFGHIJKLMNOPQRSTUVWXYZ->A", "ACDEFGHIJKLMNOPQRSTUVWXYZ->B", "ABDEFGHIJKLMNOPQRSTUVWXYZ->C", "ABCEFGHIJKLMNOPQRSTUVWXYZ->D", "ABCDFGHIJKLMNOPQRSTUVWXYZ->E", "ABCDEGHIJKLMNOPQRSTUVWXYZ->F", "ABCDEFHIJKLMNOPQRSTUVWXYZ->G", "ABCDEFGIJKLMNOPQRSTUVWXYZ->H", "ABCDEFGHJKLMNOPQRSTUVWXYZ->I", "ABCDEFGHIKLMNOPQRSTUVWXYZ->J", "ABCDEFGHIJLMNOPQRSTUVWXYZ->K", "ABCDEFGHIJKMNOPQRSTUVWXYZ->L", "ABCDEFGHIJKLNOPQRSTUVWXYZ->M", "ABCDEFGHIJKLMOPQRSTUVWXYZ->N", "ABCDEFGHIJKLMNPQRSTUVWXYZ->O", "ABCDEFGHIJKLMNOQRSTUVWXYZ->P", "ABCDEFGHIJKLMNOPRSTUVWXYZ->Q", "ABCDEFGHIJKLMNOPQSTUVWXYZ->R", "ABCDEFGHIJKLMNOPQRTUVWXYZ->S", "ABCDEFGHIJKLMNOPQRSUVWXYZ->T", "ABCDEFGHIJKLMNOPQRSTVWXYZ->U", "ABCDEFGHIJKLMNOPQRSTUWXYZ->V", "ABCDEFGHIJKLMNOPQRSTUVXYZ->W", "ABCDEFGHIJKLMNOPQRSTUVWYZ->X", "ABCDEFGHIJKLMNOPQRSTUVWXZ->Y", "ABCDEFGHIJKLMNOPQRSTUVWXY->Z" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case170() {
    String initial = "AA";
    String[] reactions = { "BZ->Y", "ZY->X", "AB->Z" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case171() {
    String initial = "ABCDEFGHIJKL";
    String[] reactions = { "XY->Z", "YZ->X", "XZ->Y" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case172() {
    String initial = "AC";
    String[] reactions = { "BC->X", "BX->C", "CX->B" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

  @Test
  public void case173() {
    String initial = "AB";
    String[] reactions = { "AC->X", "AB->C", "AC->B", "BC->A" };
    assertEquals(-1, quantumalchemy.minSteps(initial, reactions));
  }

}
