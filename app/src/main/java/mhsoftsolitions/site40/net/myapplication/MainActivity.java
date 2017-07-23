package mhsoftsolitions.site40.net.myapplication;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import static mhsoftsolitions.site40.net.myapplication.BuildConfig.*;

public class MainActivity extends AppCompatActivity {

    private EditText txtWeight;

    private TextView lblFluid;
    private TextView lblFluidOralAndiV;
    private TextView lblCefuroxim;
    private TextView lblUOP;

    private TextView lblFluidIV;
    private TextView lblFluidOral;
    private TextView lblMaintainance;
    //TODO rename this variable
    private TextView lblAdditional;
    private TextView lblTranexamicAcid;
    private TextView lblOmeprazole;

    private TextView lblFlagyl;
    private TextView lblCefotaxim;

    private double mainAdd = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        String versionName = BuildConfig.VERSION_NAME;

        String  title = getString(R.string.app_name);

        this.setTitle(title  + " V" + versionName);
        txtWeight.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (txtWeight.getText().toString().matches("")){
                    clearText();

                } else{
                    double weight = Double.valueOf(txtWeight.getText().toString());
                    lblFluid.setText(setFluid(weight ,1.5));
                    lblFluidOralAndiV.setText(setFluidIVandOral(weight,1.5));
                    lblCefuroxim.setText(setCefuroxim(weight));
                    lblUOP.setText(setUOP(weight));
                    lblFluidIV.setText(setFluid(weight , 2.5));
                    lblFluidOral.setText(setFluidIVandOral(weight, 2.5));
                    lblMaintainance.setText(setMaintainance(weight));
                    lblAdditional.setText(setAdditional(weight));
                    lblTranexamicAcid.setText(setTranexamicAcid(weight));
                    lblOmeprazole.setText(setOmeprazole(weight));
                    lblFlagyl.setText(setFlagyl(weight));
                    lblCefotaxim.setText(setCefotaxim(weight));
                }
            }
        });
    }


    private void initComponents(){
        txtWeight=(EditText) findViewById(R.id.txtWeight);
        lblFluid = (TextView)findViewById(R.id.lblFluid);
        lblFluidOralAndiV = (TextView)findViewById(R.id.lblFluidOralAndIV);
        lblCefuroxim = (TextView)findViewById(R.id.lblcefuroxim);
        lblUOP  = (TextView) findViewById(R.id.lblUOP);
        lblFluidIV = (TextView) findViewById(R.id.lblFluidIV);
        lblFluidOral = (TextView) findViewById(R.id.lblFluidORal);
        lblMaintainance=(TextView) findViewById(R.id.lblMaintainance);
        lblAdditional =(TextView) findViewById(R.id.lblAdditional);
        lblTranexamicAcid = (TextView) findViewById(R.id.lblTranexamicAcid);
        lblOmeprazole = (TextView)findViewById(R.id.lblOmeprazole);
        lblFlagyl =(TextView)  findViewById(R.id.lblFlagyl);
        lblCefotaxim = (TextView) findViewById(R.id.lblCefotaxim);

        clearText();
    }

    public String setFluid(Double weight, double value){
        return Double.toString(weight * value)  +" ml/ hr ";
    }

    public String setFluidIVandOral(Double weight, double value) {
        if (value == 1.5) {
            return "O:" + weight  +  " IV:" + Double.toString(weight * 0.5) ;
        }
        else {
            return "O:" + Double.toString(weight * 2)  +  " IV:" + Double.toString(weight * 0.5) ;
        }
    }

    public String setCefuroxim (Double weight) {
        Double Cefuroxim = weight *30;
        if (Cefuroxim >= 750){
            return "750.0 mg/ 8hr" ;
        }
        return Double.toString(weight *30)+ " mg/ 8hr";
    }

/*    public String setFluidIV(Double weight){
        return Double.toString(weight * 0.5) + " ml/ hr";
    }

    public String setFluidOral(Double weight){
        return Double.toString(weight * 2) + " ml/ hr";
    }*/

    public String setUOP(Double weight) {
        return Double.toString(weight * 0.7 * 3) + "ml/ 3hr";
    }

    public String setMaintainance (Double weight) {
        double result = 0.0;
        mainAdd = 0.0;
        if (weight > 20) {
            result = (weight - 20) * 20;
            result = result+ (100*10 ) + (50 * 10);
            mainAdd = result;
            if (result >=2100) {
                mainAdd = 2100;
                return "2100 ml/ 24hr";
            }
            return Double.toString(result)  + "ml/ 24hr";
        }  if (weight >= 11) {
            result = result + (weight - 10) * 50;
            result = result + (100*10 );
            mainAdd = result;
            if (result >=2100) {
                mainAdd = 2100;
                return "2100 ml/ 24hr";
            }
            return Double.toString(result)  + "ml/ 24hr";
        }  else { //(weight <= 10) {
            result = result + (weight * 100);
            mainAdd = result;
            if (result >=2100) {
                mainAdd = 2100;
                return "2100 ml/ 24hr";
            }
            return Double.toString(result) + "ml/ 24hr";
        }
       // return Double.toString(result);
    }
    //TODO rename this method
    public String setAdditional(Double weight){
        double result = 0.0;
        result = mainAdd + (50 * weight);
        if (result >=4600) {
            return "4600 ml/ 24hr";
        }
        return Double.toString(result) + "ml/ 48hr";
    }
    public void clearText(){
        lblFluid.setText("0");
        lblFluidOralAndiV.setText("0");
        lblCefuroxim.setText("0");
        lblUOP.setText("0");
        lblFluidIV.setText("0");
        lblFluidOral.setText("0");
        lblMaintainance.setText("0");
        lblAdditional.setText("0");
        lblTranexamicAcid.setText("0");
        lblOmeprazole.setText("0");
        lblFlagyl.setText("0");
        lblCefotaxim.setText("0");
    }

    public String setTranexamicAcid(Double weight) {
        Double tranexamic = weight * 10;
        if (tranexamic >=500) {
            return "500.0 mg/ tds";
        }
        return Double.toString(tranexamic) + " mg tds";
    }

    public String setOmeprazole (Double weight) {
        Double Omeprazole = weight * 0.5;
        if (Omeprazole >=20){
            return "20.0 mg bd";
        }
        return Double.toString(Omeprazole) + "mg bd" ;
    }
    public String setFlagyl(Double weight){
        Double flagyl=weight * 7.5;
        if (flagyl >=500) {
            return "500 mg tds";
        }
        return Double.toString(flagyl) + " mg tds";
    }
    public String setCefotaxim(Double weight) {
        Double Cefotaxim = weight * 50;
        if (Cefotaxim >=4000){
            return "4 mg/ 8hr" ;
        }
        return Double.toString(weight * 50) + "mg/ 8hr";
    }
}
