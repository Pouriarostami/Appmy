import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public class CustomerListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list); // مطمئن شوید که این فایل XML درست است

        // فرض بر این است که در layout XML یک ListView با id customer_list_view دارید
        ListView listView = findViewById(R.id.customer_list_view); 

        ArrayList<String> customerList = new ArrayList<>();
        customerList.add("مشتری 1");
        customerList.add("مشتری 2");
        // به همین ترتیب مشتری‌های دیگر را اضافه کنید

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, customerList);
        listView.setAdapter(adapter);
    }
}