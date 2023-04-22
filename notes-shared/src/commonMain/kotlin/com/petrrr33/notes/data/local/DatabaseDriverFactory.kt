package com.petrrr33.notes.data.local

import com.squareup.sqldelight.db.SqlDriver

expect class DatabaseDriverFactory {
     fun createDriver() : SqlDriver
}