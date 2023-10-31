package com.example.simu_autos.auth

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.simu_autos.databinding.FragmentLoginBinding
import java.lang.ClassCastException

class LoginFragment : Fragment() {

    private lateinit var loginFragmentActions: ILoginFragmentActions

    override fun onAttach(context: Context) {
        super.onAttach(context)
        loginFragmentActions = try {
            context as ILoginFragmentActions
        } catch (e: ClassCastException) {
            throw ClassCastException("$context must implement LoginFragmentActions")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLoginBinding.inflate(inflater)

        binding.idButtonRegistroLogin.setOnClickListener{
            loginFragmentActions.onRegisterButtonClick()
        }

        return binding.root
    }
}