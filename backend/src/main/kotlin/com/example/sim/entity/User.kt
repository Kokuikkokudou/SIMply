package com.example.sim.entity       // ← フォルダーに合わせる

import jakarta.persistence.*

@Entity                       // これが「JPA 管理対象」の合図
@Table(name = "user")         // 実際のテーブル名
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // AUTO_INCREMENT
    val id: Long = 0,          // ① 主キー。0 はダミーで DB が上書き
    val name: String = ""        // ② 名前列（null にしたくない場合はそのまま）
)
