package supervisor.rosia.com.navigationcompdemo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_account.*

class AccountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nextButton.setOnClickListener {

            val nameBundle = AccountFragmentDirections.actionAccountFragmentToNameFragment()
            nameBundle.setNameArg(nameEt.text.toString())
            Navigation.findNavController(activity!!, R.id.my_nav_host_fragment).navigate(nameBundle)
        }
    }

}
