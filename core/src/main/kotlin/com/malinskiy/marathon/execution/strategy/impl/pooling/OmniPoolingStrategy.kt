package com.malinskiy.marathon.execution.strategy.impl.pooling

import com.malinskiy.marathon.device.Device
import com.malinskiy.marathon.device.DevicePoolId
import com.malinskiy.marathon.execution.strategy.PoolingStrategy

class OmniPoolingStrategy : PoolingStrategy {
    override fun associate(device: Device): DevicePoolId = DevicePoolId("omni")

    override fun hashCode() = javaClass.canonicalName.hashCode()

    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        val javaClass: Class<Any> = other.javaClass
        return this.javaClass.canonicalName == javaClass.canonicalName
    }

    override fun toString(): String {
        return "OmniPoolingStrategy()"
    }


}
