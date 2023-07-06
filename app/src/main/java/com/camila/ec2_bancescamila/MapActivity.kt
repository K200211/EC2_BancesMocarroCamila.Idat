package com.camila.ec2_bancescamila

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camila.ec2_bancescamila.databinding.ActivityCameraBinding
import com.camila.ec2_bancescamila.databinding.ActivityMapBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapActivity : AppCompatActivity() , OnMapReadyCallback {
    private lateinit var binding: ActivityMapBinding
    private lateinit var googleMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fragmentMap=supportFragmentManager.findFragmentById(R.id.mapa)as SupportMapFragment
        fragmentMap.getMapAsync(this)

    }

    override fun onMapReady(map: GoogleMap) {
        googleMap=map
        val idat = LatLng(-12.066877, -77.035721)
        val idatChiclayo= LatLng(-6.764018301766267, -79.86374356522278)
        val casa= LatLng(-6.766836, -79.834401)
        googleMap.addMarker(MarkerOptions().position(idat).title("Idat Centro"))
        googleMap.addMarker(MarkerOptions().position(idatChiclayo).title("Idat Chiclayo"))
        googleMap.addMarker(MarkerOptions().position(casa).title("HOME"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(idat))
    }
}