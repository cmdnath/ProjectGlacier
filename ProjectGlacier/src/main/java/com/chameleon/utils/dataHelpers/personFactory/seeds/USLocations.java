package com.chameleon.utils.dataHelpers.personFactory.seeds;

import java.util.Random;

public class USLocations {
    private static String[] locations = {
            "99501,ANCHORAGE,AK",
            "99505,JBER,AK",
            "99556,ANCHOR POINT,AK",
            "99567,CHUGIAK,AK",
            "99573,COPPER CENTER,AK",
            "35006,ADGER,AL",
            "35007,ALABASTER,AL",
            "36720,ALBERTA,AL",
            "35010,ALEXANDER CITY,AL",
            "35442,ALICEVILLE,AL",
            "72003,ALMYRA,AR",
            "72611,ALPENA,AR",
            "72004,ALTHEIMER,AR",
            "72821,ALTUS,AR",
            "71923,ARKADELPHIA,AR",
            "85321,AJO,AZ",
            "85118,GOLD CANYON,AZ",
            "85119,APACHE JUNCTION,AZ",
            "85338,GOODYEAR,AZ",
            "85603,BISBEE,AZ",
            "96101,ALTURAS,CA",
            "96103,BLAIRSDEN-GRAEAGLE,CA",
            "96107,COLEVILLE,CA",
            "96118,LOYALTON,CA",
            "96120,MARKLEEVILLE,CA",
            "81020,AGUILAR,CO",
            "81101,ALAMOSA,CO",
            "81120,ANTONITO,CO",
            "80002,ARVADA,CO",
            "81611,ASPEN,CO",
            "6231,AMSTON,CT",
            "6401,ANSONIA,CT",
            "6278,ASHFORD,CT",
            "6330,BALTIC,CT",
            "6750,BANTAM,CT",
            "19701,BEAR,DE",
            "19930,BETHANY BEACH,DE",
            "19933,BRIDGEVILLE,DE",
            "19934,CAMDEN WYOMING,DE",
            "19703,CLAYMONT,DE",
            "32615,ALACHUA,FL",
            "32420,ALFORD,FL",
            "32421,ALTHA,FL",
            "32320,APALACHICOLA,FL",
            "32618,ARCHER,FL",
            "30701,CALHOUN,GA",
            "30707,CHICKAMAUGA,GA",
            "30710,COHUTTA,GA",
            "30711,CRANDALL,GA",
            "30725,FLINTSTONE,GA",
            "96701,AIEA,HI",
            "96704,CAPTAIN COOK,HI",
            "96706,EWA BEACH,HI",
            "96708,HAIKU,HI",
            "96712,HALEIWA,HI",
            "83211,AMERICAN FALLS,ID",
            "83213,ARCO,ID",
            "83221,BLACKFOOT,ID",
            "83702,BOISE,ID",
            "83604,BRUNEAU,ID",
            "61231,ALEDO,IL",
            "61232,ANDALUSIA,IL",
            "61234,ANNAWAN,IL",
            "61239,CARBON CLIFF,IL",
            "61240,COAL VALLEY,IL",
            "47106,BORDEN,IN",
            "47108,CAMPBELLSBURG,IN",
            "47610,CHANDLER,IN",
            "47611,CHRISNEY,IN",
            "47112,CORYDON,IN",
            "66712,ARMA,KS",
            "66002,ATCHISON,KS",
            "66006,BALDWIN CITY,KS",
            "66007,BASEHOR,KS",
            "66713,BAXTER SPRINGS,KS",
            "42202,ADAIRVILLE,KY",
            "42120,ADOLPHUS,KY",
            "41601,ALLEN,KY",
            "42020,ALMO,KY",
            "42122,ALVATON,KY",
            "70420,ABITA SPRINGS,LA",
            "70710,ADDIS,LA",
            "70031,AMA,LA",
            "70422,AMITE,LA",
            "71403,ANACOCO,LA",
            "2478,BELMONT,MA",
            "2445,BROOKLINE,MA",
            "2420,LEXINGTON,MA",
            "2492,NEEDHAM,MA",
            "2494,NEEDHAM HEIGHTS,MA",
            "20607,ACCOKEEK,MD",
            "20608,AQUASCO,MD",
            "20609,AVENUE,MD",
            "20611,BEL ALTON,MD",
            "20705,BELTSVILLE,MD",
            "4406,ABBOT,ME",
            "4606,ADDISON,ME",
            "4910,ALBION,ME",
            "4002,ALFRED,ME",
            "4535,ALNA,ME",
            "48001,ALGONAC,MI",
            "48101,ALLEN PARK,MI",
            "48002,ALLENTON,MI",
            "48003,ALMONT,MI",
            "48103,ANN ARBOR,MI",
            "56431,AITKIN,MN",
            "56433,AKELEY,MN",
            "56007,ALBERT LEA,MN",
            "55301,ALBERTVILLE,MN",
            "55910,ALTURA,MN",
            "65351,SWEET SPRINGS,MO",
            "65080,TEBBETTS,MO",
            "63087,VALLES MINES,MO",
            "63088,VALLEY PARK,MO",
            "63385,WENTZVILLE,MO",
            "39735,ACKERMAN,MS",
            "38821,AMORY,MS",
            "38721,ANGUILLA,MS",
            "38824,BALDWYN,MS",
            "39421,BASSFIELD,MS",
            "59353,WIBAUX,MT",
            "59086,WILSALL,MT",
            "59648,WOLF CREEK,MT",
            "59201,WOLF POINT,MT",
            "59088,WORDEN,MT",
            "28774,SAPPHIRE,NC",
            "28578,SEVEN SPRINGS,NC",
            "28467,CALABASH,NC",
            "28468,SUNSET BEACH,NC",
            "28469,OCEAN ISLE BEACH,NC",
            "58078,WEST FARGO,ND",
            "58793,WESTHOPE,ND",
            "58384,WILLOW CITY,ND",
            "58495,WISHEK,ND",
            "58081,WYNDMERE,ND",
            "68810,ALDA,NE",
            "68813,ANSELMO,NE",
            "68814,ANSLEY,NE",
            "68922,ARAPAHOE,NE",
            "69120,ARNOLD,NE",
            "3890,WEST OSSIPEE,NH",
            "3287,WILMOT,NH",
            "3816,CENTER TUFTONBORO,NH",
            "3894,WOLFEBORO,NH",
            "3785,WOODSVILLE,NH",
            "7675,WESTWOOD,NJ",
            "7677,WOODCLIFF LAKE,NJ",
            "7885,WHARTON,NJ",
            "7981,WHIPPANY,NJ",
            "8889,WHITEHOUSE STATION,NJ",
            "87711,ANTON CHICO,NM",
            "87930,ARREY,NM",
            "88210,ARTESIA,NM",
            "87410,AZTEC,NM",
            "87002,BELEN,NM",
            "89020,AMARGOSA VALLEY,NV",
            "89820,BATTLE MOUNTAIN,NV",
            "89005,BOULDER CITY,NV",
            "89008,CALIENTE,NV",
            "89822,CARLIN,NV",
            "14897,WHITESVILLE,NY",
            "14589,WILLIAMSON,NY",
            "14172,WILSON,NY",
            "14898,WOODHULL,NY",
            "14174,YOUNGSTOWN,NY",
            "45810,ADA,OH",
            "43901,ADENA,OH",
            "45812,ALGER,OH",
            "44601,ALLIANCE,OH",
            "44802,ALVADA,OH",
            "73938,FORGAN,OK",
            "73939,GOODWELL,OK",
            "73942,GUYMON,OK",
            "73945,HOOKER,OK",
            "73950,TURPIN,OK",
            "97324,ALSEA,OR",
            "97813,ATHENA,OR",
            "97325,AUMSVILLE,OR",
            "97410,AZALEA,OR",
            "97814,BAKER CITY,OR",
            "15920,ARMAGH,PA",
            "16111,ATLANTIC,PA",
            "16720,AUSTIN,PA",
            "15312,AVELLA,PA",
            "15618,AVONMORE,PA",
            "2895,WOONSOCKET,RI",
            "2896,NORTH SMITHFIELD,RI",
            "2898,WYOMING,RI",
            "2919,JOHNSTON,RI",
            "2914,EAST PROVIDENCE,RI",
            "29801,AIKEN,SC",
            "29812,BARNWELL,SC",
            "29902,BEAUFORT,SC",
            "29907,LADYS ISLAND,SC",
            "29817,BLACKVILLE,SC",
            "57278,WILLOW LAKE,SD",
            "57580,WINNER,SD",
            "57384,WOLSEY,SD",
            "57077,WORTHING,SD",
            "57078,YANKTON,SD",
            "38310,ADAMSVILLE,TN",
            "38001,ALAMO,TN",
            "37701,ALCOA,TN",
            "38504,ALLARDT,TN",
            "38541,ALLONS,TN",
            "76693,WORTHAM,TX",
            "78886,YANCEY,TX",
            "77995,YOAKUM,TX",
            "78164,YORKTOWN,TX",
            "78076,ZAPATA,TX",
            "84003,AMERICAN FORK,UT",
            "84006,BINGHAM CANYON,UT",
            "84511,BLANDING,UT",
            "84007,BLUEBELL,UT",
            "84010,BOUNTIFUL,UT",
            "24486,WEYERS CAVE,VA",
            "22578,WHITE STONE,VA",
            "23894,WILSONS,VA",
            "22580,WOODFORD,VA",
            "23898,ZUNI,VA",
            "5440,ALBURGH,VT",
            "5441,BAKERSFIELD,VT",
            "5821,BARNET,VT",
            "5641,BARRE,VT",
            "5822,BARTON,VT",
            "98596,WINLOCK,WA",
            "98072,WOODINVILLE,WA",
            "98901,YAKIMA,WA",
            "98597,YELM,WA",
            "98953,ZILLAH,WA",
            "54611,ALMA CENTER,WI",
            "54805,ALMENA,WI",
            "54001,AMERY,WI",
            "54721,ARKANSAW,WI",
            "54613,ARKDALE,WI",
            "26031,BENWOOD,WV",
            "26035,COLLIERS,WV",
            "26037,FOLLANSBEE,WV",
            "26038,GLEN DALE,WV",
            "26039,GLEN EASTON,WV",
            "82442,TEN SLEEP,WY",
            "83127,THAYNE,WY",
            "82443,THERMOPOLIS,WY",
            "82401,WORLAND,WY",
            "82190,YELLOWSTONE NATIONAL PARK,WY"
    };

    public static String getLocation() {

        Random r = new Random();
        return locations[r.nextInt(locations.length)];
    }
}
