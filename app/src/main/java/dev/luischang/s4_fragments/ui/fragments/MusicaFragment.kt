package dev.luischang.s4_fragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.luischang.s4_fragments.R
import dev.luischang.s4_fragments.ui.adapter.SongAdapter
import dev.luischang.s4_fragments.ui.model.Song

class MusicaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_musica, container, false)
        val rvMusica: RecyclerView = view.findViewById(R.id.rvMusica)
        rvMusica.adapter = SongAdapter(listSongLinkinPark())
        rvMusica.layoutManager = LinearLayoutManager(requireContext())

        return view
    }

    private fun listSongLinkinPark(): List<Song> {
        val lstSong: ArrayList<Song> = ArrayList()
        lstSong.add(Song(1,R.drawable.intheend,
                "In the End","Hybrid Theory",
        "10,000","3:36"))
        lstSong.add(Song(2,R.drawable.numb,
                "Numb","Meteora",
                "9,000","3:05"))
        lstSong.add(Song(3,R.drawable.whativedone,
                "What I've Done","Minutes to Midnight",
                "8,000","3:25"))
        lstSong.add(Song(4,R.drawable.onestepcloser,
                "One Step Closer","Hybrid Theory",
                "7,000","2:37"))
        lstSong.add(Song(5,R.drawable.castleofglass,
                "Castle Of Glass","Living Things",
                "6,000","3:25"))


        return lstSong
    }
}