package appewtc.masterung.callfriend;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class FormActivity extends ActionBarActivity {

    //Explicit
    private EditText edtName, edtPhone;
    private String strName, strPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        //Bind Widget
        bindWidget();

    }   // onCreate

    private void bindWidget() {
        edtName = (EditText) findViewById(R.id.editText2);
        edtPhone = (EditText) findViewById(R.id.editText3);
    }

    public void clickSave(View view) {

        strName = edtName.getText().toString().trim();
        strPhone = edtPhone.getText().toString().trim();

        if (strName.equals("") || strPhone.equals("") ) {

            spaceDialog();

        } else {

        }

    }   // clickSave

    private void spaceDialog() {

        AlertDialog.Builder objBuilder = new AlertDialog.Builder(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_form, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}   // Main Class
