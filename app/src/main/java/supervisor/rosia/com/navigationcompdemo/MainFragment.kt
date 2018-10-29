package supervisor.rosia.com.navigationcompdemo


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        goToAccountBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toAccount))
        goToSettingBtn.setOnClickListener {
            val nameBundle = Bundle()
            nameBundle.putString("argData", "Setting")
            it.findNavController().navigate(R.id.settingFragment, nameBundle)

        }
    }


}
