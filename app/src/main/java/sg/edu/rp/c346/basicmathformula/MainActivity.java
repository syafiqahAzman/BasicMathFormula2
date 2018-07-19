package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvFormula;
    ArrayList<FormulaItem> alFormulaList;
    CustomAdaptor caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.ListViewFormula);
        String fType = "Formula type is: ";
        alFormulaList = new ArrayList<>();
        FormulaItem item1 = new FormulaItem("Area of rectangle", "Length x Length", fType + "Area");
        FormulaItem item2 = new FormulaItem("Area of triangle", "(Length of base x Length)/2", fType + "Area");
        FormulaItem item3 = new FormulaItem("Volume of cube", "Length x Length x Length", fType + "Volume");

        alFormulaList.add(item1);
        alFormulaList.add(item2);
        alFormulaList.add(item3);

        caFormula = new CustomAdaptor(this, R.layout.formula_item, alFormulaList);

        lvFormula.setAdapter(caFormula);

    }
}
