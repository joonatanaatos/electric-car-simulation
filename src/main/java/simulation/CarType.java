package simulation;

public enum CarType {
    AUDI_E(301),
    BMWI_I3S(29),
    BMWI_I3(215),
    BMW_I3S(5),
    BMW_I3(38),
    BMW_Maarittelematon(1),
    CHEVROLET_BOLT(3),
    CITROEN_2CV(1),
    CITROEN_AX(1),
    CITROEN_BERLINGO(2),
    CITROEN_C_ZERO(13),
    CITROEN_SAXO(2),
    CITROEN_XSARA(1),
    DS_3CROSSBACK(7),
    FIAT_500E(47),
    FIAT_500(24),
    FIAT_DOBLO(1),
    FIAT_Maarittelematon(1),
    FORD_CNG_TECHNIK_FOCUS(3),
    FORD_FOCUS(2),
    FORD_MUSTANG(2),
    HONDA_E(18),
    HYUNDAI_IONIQ(465),
    HYUNDAI_KONA(565),
    JAGUAR_I_PACE(164),
    KIA_NIRO(183),
    KIA_SOUL(62),
    LandRover_I_PACE(2),
    MAZDA_MX_3(26),
    MERCEDES_BENZ_240GD(1),
    MERCEDES_BENZ_250E(1),
    MERCEDES_BENZ_B200(2),
    MERCEDES_BENZ_B250E(3),
    MERCEDES_BENZ_B250(45),
    MERCEDES_BENZ_ELECTRIC(40),
    MERCEDES_BENZ_EQC400(127),
    MERCEDES_BENZ_V_KLASSE(16),
    MERCEDES_BENZ_VITO(5),
    MERCEDES_BENZ_Maarittelematon(1),
    MICRO_VETT___(1),
    MICRO_VETT_Maarittelematon(1),
    MINI_COOPERSE(62),
    MITSUBISHI_I_MIEV(14),
    MITSUBISHI_MINICAB(1),
    NISSAN_E_NV200(37),
    NISSAN_LEAF(1213),
    OMAVALMISTE_ELECTRIC(1),
    OPEL_AMPERA(5),
    OPEL_CORSA(43),
    PEUGEOT_106(3),
    PEUGEOT_2008(39),
    PEUGEOT_208(31),
    PEUGEOT_ION(11),
    POLESTAR_2(2),
    PORSCHE_TAYCAN(124),
    RENAULT_FLUENCE(2),
    RENAULT_TWINGO(1),
    RENAULT_ZOE(292),
    SAAB_99(1),
    SEAT_MII(271),
    SKODA_CITIGO(149),
    SMART_EQ(15),
    SMART_FORFOUR(1),
    SMART_FORTWO(3),
    TESLAMOTORS_85D(2),
    TESLAMOTORS_MODEL3(1541),
    TESLAMOTORS_MODELS(1440),
    TESLAMOTORS_MODELX(423),
    TESLAMOTORS_P85D(2),
    TESLAMOTORS_S85(6),
    TESLAMOTORS_TESLA(1),
    TESLAMOTORS_Maarittelematon(6),
    THINK_CITY(2),
    THINK_TH_NK(9),
    TOYOTA_COROLLA(2),
    TOYOTA_PREVIA(1),
    TUNTEMATON_THINK(2),
    VOLKSWAGEN_2000(1),
    VOLKSWAGEN_E_GOLF(1),
    VOLKSWAGEN_EGOLF(2),
    VOLKSWAGEN_GOLF(487),
    VOLKSWAGEN_ID_3(496),
    VOLKSWAGEN_UP(371),
    VOLVO_XC40(154),
    GAS(-1);

    public final int amount;

    private CarType(int amount_) {
        amount = amount_;
    }
}
