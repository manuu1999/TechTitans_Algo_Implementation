package com.fhnw.TechTitans.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "truck")
public class Truck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "truck_id", nullable = false)
    private Integer id;

    @Column(name = "size_capacity_in_m3", nullable = false)
    private Float sizeCapacityInM3;

    @Column(name = "weight_capacity", nullable = false)
    private Float weightCapacity;

    @Column(name = "current_location", nullable = false, length = 100)
    private String currentLocation;

    @Column(name = "latitude", nullable = false)
    private Double latitude;

    @Column(name = "longitude", nullable = false)
    private Double longitude;

    @ManyToOne
    @JoinColumn(name = "depot_depot_id", nullable = false)
    private Depot depot;

    @ManyToOne
    @JoinColumn(name = "truck_driver_truck_driver_id", nullable = false)
    private TruckDriver truckDriver;

    @Column(name = "status", nullable = false, length = 20)
    private String status;
}
