package com.local.lib

class Notifier implements Serializable {

    def steps 
    Notifier(steps) { this.steps = steps }

    def slack(channel, msg) {
        steps.echo "Notify ${channel}: ${msg}"

        steps.sh "echo test mit Shell V2"
    } 

    def email(channel, msg) {
        steps.echo "Notify ${channel}: ${msg}"

        steps.sh "echo test mit Shell V2"
    } 


    def notion(channel, msg) {
        steps.echo "Notify ${channel}: ${msg}"

        steps.sh "echo test mit Shell V2"
    }
}