package io.github.agent0876.anvil

import java.io.Closeable
import java.nio.file.Path

class Anvil(val path: Path) : Closeable {
    init {
        // TODO: Initialise and open MCA (Minecraft Region Format) files
    }

    fun readChunk(chunkX: Int, chunkZ: Int): ByteArray? {
        // TODO: Read compressed NBT byte array for chunk from region files
        return null
    }

    fun writeChunk(chunkX: Int, chunkZ: Int, data: ByteArray) {
        // TODO: Write compressed NBT byte array for chunk to region files
    }

    override fun close() {
        // TODO: Close resources
    }
}
