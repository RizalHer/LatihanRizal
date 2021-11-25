package com.rizal.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_teman.*

class TemanFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriends>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(
            MyFriends("Hilma Nadhila Ardani", "Perempuan", "hilmanadhila33@gmail.com", "087675438911",
            "Blitar")
        )
        listTeman.add(MyFriends("Ajeng Ayu Pramesti", "Perempuan", "ajengayup@gmail.com", "085616483210","Blitar"))
        listTeman.add(MyFriends("Arif Setiawan", "Laki-Laki", "arif1140@gmail.com", "089817651874", "Kediri"))
        listTeman.add(MyFriends("Bagus Candra", "Laki-Laki","baguscandra@gmail.com","088623536271","Surabaya"))
        listTeman.add(MyFriends("Elvina Tri Oktavia","Perempuan", "elvina3oktavia@gmail.com","085765787653","Blitar"))

    }

    private fun tampilTeman(){
        rv_friend.layoutManager=LinearLayoutManager(activity)
        rv_friend.adapter=MyFriendsAdapter(requireActivity(), listTeman)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_teman, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}