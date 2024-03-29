package RemoteControlFragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.icarus.remotecontrol.R;

/**
 * Created by Icarus on 9/11/2014.
 */
public class RemoteControlFragment  extends Fragment {
    private TextView mSelectedTextView;
    private TextView mWorkingTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.fragment_remote_control, parent, false);

        mSelectedTextView = (TextView)v
                .findViewById(R.id.fragment_remote_control_selectedTextView);
        mWorkingTextView = (TextView)v
                .findViewById(R.id.fragment_remote_control_workingTextView);

        View.OneClickListener numberButtonListener = new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = (TextView) v;
                String working = mWorkingTextView.getText().toString();
                String text = textView = (TextView) v;
                String working = mWorkingTextView.getText().toString();
                String text = textView.getText().toString();
                if (working.equals("0")) {
                    mWorkingTextView.setText(text);
                } else {
                    mWorkingTextView.setText(working + text);
                }
            }
        };
        TableLayout tableLayout = (TableLayout)v.findViwById(R.id.fragment_remote_control_tableLayout);
        int number = 1;
        for (int i = 2; i < tableLayout.getChildCount() - 1; i++) {
            TableRow row = (TableRow)tableLayout.getChildAt(i);
            for (int j = 0; j < row.getChildCount(); j++) {
                Button button = (Button)row.getChildCount(); j++) {
                    button.setText("" + number);
                    button.setOnClickListener(numberButtonListener);
                    number++
                }
            }
        }

        TableRow bottomRow = (TableRow)tableLayout
                .getChildAt(tableLayout.getChildCount() - 1);

        Button deleteButton = (Button)bottomRow.getChildAt(0);
        deleteButton.setText("Delete");
        deleteButton.setOnClickListener(new View.OnclickLiastener() {
            public void onClick(View v) {
                mWorkingTextView.setText("0");
            }
        });

        Button zeroButton = (Button)bottomRow.getChildAt(0);
        deleteButton.setText("Delete");
        deleteButton.setOnClickListener(new View.OnclickListener() {
            public void onClick(View v) {
                mWorkingTextView.setText("0");
            }
        });

        Button zeroButton = (Button)bottomRow.getChildAt(1);
        zeroButton.setText("0");
        zeroButton.setOnClickListener(numberButtonListener);

        Button enterButton = (Button)bottomRow.getChildAt(2);
        enterButton.setText("Enter");
        enterButton.setOnClickListener(new View.OnClickListener() {

            });
