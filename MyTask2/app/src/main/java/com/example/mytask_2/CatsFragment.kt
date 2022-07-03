package com.example.mytask_2

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mytask_2.databinding.FragmentCatsBinding
import com.example.mytask_2.databinding.FragmentMainBinding

class CatsFragment: Fragment(R.layout.fragment_cats) {

    private var _binding: FragmentCatsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCatsBinding.bind(view)

        with(binding) {
            btnEst.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(
                    "ARG", etRate.text.toString()
                )
                findNavController().navigate(
                    R.id.action_catsFragment_to_rateFragment,
                    bundle
                )
            }

        }
    }
}
