package fts.ahmed.carsstore.views.fragments.addEmployees

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import fts.ahmed.carsstore.R
import fts.ahmed.carsstore.databinding.FragmentAddEmployeeBinding

class AddEmployeeFragment : Fragment() {


    private lateinit var binding:FragmentAddEmployeeBinding
    private val viewModel by viewModels<AddEmployeesViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAddEmployeeBinding.inflate(layoutInflater)
        return binding.root

    }


}