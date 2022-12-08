package com.cristianvillamil.platziwallet.ui.commands

class FileCommandManager {
    private val commands: HashMap<String, FileCommand> = HashMap()

    fun putCommand(name: String, command: FileCommand){
        commands[name] = command
    }

    fun getCommand(name:String): FileCommand {
        if(commands.containsKey(name)){
            return commands[name]!!
        }else{
            throw java.lang.RuntimeException("command not found $name")
        }
    }
}