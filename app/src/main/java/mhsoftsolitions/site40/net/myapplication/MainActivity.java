package mhsoftsolitions.site40.net.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtWeight;

    private TextView lblFluid;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();

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
                    lblFluid.setText(setFluid(weight));
                    lblCefuroxim.setText(setCefuroxim(weight));
                    lblUOP.setText(setUOP(weight));
                    lblFluidIV.setText(setFluidIV(weight));
                    lblFluidOral.setText(setFluidOral(weight));
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

    public String setFluid(Double weight){
        return Double.toString(weight *1.5);
    }

    public String setCefuroxim (Double weight) {
        Double Cefuroxim = weight *30;
        if (Cefuroxim >= 750){
            return "750.0";
        }
        return Double.toString(weight *30);
    }

    public String setFluidIV(Double weight){
        return Double.toString(weight);
    }

    public String setFluidOral(Double weight){
        return Double.toString(weight * 1.5);
    }

    public String setUOP(Double weight) {
        return Double.toString(weight * 0.7 * 3);
    }

    public String setMaintainance (Double weight) {
        double result = 0.0;
        if (weight > 20) {
            result = (weight - 20) * 20;
            result = result+ (100*10 ) + (50 * 10);
            return Double.toString(result);
        }  if (weight >= 11) {
            result = result + (weight - 10) * 50;
            result = result + (100*10 );
            return Double.toString(result);
        } if (weight <= 10) {
            result = result + (weight * 100);
            return Double.toString(result);
        }
        return Double.toString(result);
    }
    //TODO rename this method
    public String setAdditional(Double weight){
        double result = 0.0;
        double m= Double.valueOf(lblMaintainance.getText().toString());
        result = m + (50 * weight);
        return Double.toString(result);
    }
    public void clearText(){
        lblFluid.setText("0");
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
        return Double.toString(weight * 10);
    }

    public String setOmeprazole (Double weight) {
        return Double.toString(weight * 0.5);
    }
    public String setFlagyl(Double weight){
        return Double.toString(weight * 7.5);
    }
    public String setCefotaxim(Double weight) {
        return Double.toString(weight * 50);
    }
}
