
public class MainActivity extends AppCompatActivity {

   
    private String unityGameID = "Enter Your Game ID";
    private Boolean testMode = false;
    private String Interstitial  = "video";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        UnityAds.initialize(MainActivity.this, unityGameID, testMode);
        IUnityAdsListener iUnityAdsListener = new IUnityAdsListener() {

            @Override
            public void onUnityAdsReady(String s) {

            }

            @Override
            public void onUnityAdsStart(String s) {

            }

            @Override
            public void onUnityAdsFinish(String s, UnityAds.FinishState finishState) {

            }

            @Override
            public void onUnityAdsError(UnityAds.UnityAdsError unityAdsError, String s) {

            }
        };
        UnityAds.setListener(iUnityAdsListener);


    @Override
    public void onBackPressed() {
        DisplayInterstitialAd();
    }


    public void DisplayInterstitialAd () {
        if (UnityAds.isReady (Interstitial)) {
            UnityAds.show (this, Interstitial);
        }
    }
}
