/* 
 * Copyright (c) 2017 Baidu, Inc. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.baidu.dueros.data.request;

import com.baidu.dueros.data.request.supportedInterfaces.*;
import com.baidu.dueros.data.request.supportedInterfaces.Screen;
import com.baidu.dueros.data.request.supportedInterfaces.System;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SupportedInterfaces {

    private com.baidu.dueros.data.request.supportedInterfaces.TextInput textInput;
    private com.baidu.dueros.data.request.supportedInterfaces.VoiceInput voiceInput;
    private com.baidu.dueros.data.request.supportedInterfaces.VoiceOutput voiceOutput;
    private com.baidu.dueros.data.request.supportedInterfaces.PlayController playController;
    private com.baidu.dueros.data.request.supportedInterfaces.AudioPlayer audioPlayer;
    private com.baidu.dueros.data.request.supportedInterfaces.Alerts alerts;
    private Screen screen;
    private com.baidu.dueros.data.request.supportedInterfaces.SpeakerController speakerController;
    private System system;
    private com.baidu.dueros.data.request.supportedInterfaces.ScreenExtendedCard screenExtendedCard;
    private com.baidu.dueros.data.request.supportedInterfaces.VideoPlayer videoPlayer;
    private com.baidu.dueros.data.request.supportedInterfaces.Display display;

    public static Builder newBuild() {
        return new Builder();
    }

    public SupportedInterfaces(Builder builder) {
        textInput = builder.textInput;
        voiceInput = builder.voiceInput;
        voiceOutput = builder.voiceOutput;
        playController = builder.playController;
        audioPlayer = builder.audioPlayer;
        alerts = builder.alerts;
        screen = builder.screen;
        speakerController = builder.speakerController;
        system = builder.system;
        screenExtendedCard = builder.screenExtendedCard;
        videoPlayer = builder.videoPlayer;
        display = builder.display;
    }

    public SupportedInterfaces(@JsonProperty("TextInput") com.baidu.dueros.data.request.supportedInterfaces.TextInput textInput,
                               @JsonProperty("VoiceInput") com.baidu.dueros.data.request.supportedInterfaces.VoiceInput voiceInput, @JsonProperty("VoiceOutput") com.baidu.dueros.data.request.supportedInterfaces.VoiceOutput voiceOutput,
                               @JsonProperty("PlayController") com.baidu.dueros.data.request.supportedInterfaces.PlayController playController,
                               @JsonProperty("AudioPlayer") com.baidu.dueros.data.request.supportedInterfaces.AudioPlayer audioPlayer, @JsonProperty("Alerts") com.baidu.dueros.data.request.supportedInterfaces.Alerts alerts,
                               @JsonProperty("Screen") Screen screen,
                               @JsonProperty("SpeakerController") com.baidu.dueros.data.request.supportedInterfaces.SpeakerController speakerController,
                               @JsonProperty("System") System system,
                               @JsonProperty("ScreenExtendedCard") com.baidu.dueros.data.request.supportedInterfaces.ScreenExtendedCard screenExtendedCard,
                               @JsonProperty("VideoPlayer") com.baidu.dueros.data.request.supportedInterfaces.VideoPlayer videoPlayer, @JsonProperty("Display") com.baidu.dueros.data.request.supportedInterfaces.Display display) {
        this.voiceInput = voiceInput;
        this.textInput = textInput;
        this.voiceOutput = voiceOutput;
        this.playController = playController;
        this.audioPlayer = audioPlayer;
        this.alerts = alerts;
        this.screen = screen;
        this.speakerController = speakerController;
        this.system = system;
        this.screenExtendedCard = screenExtendedCard;
        this.videoPlayer = videoPlayer;
        this.display = display;
    }

    public com.baidu.dueros.data.request.supportedInterfaces.TextInput getTextInput() {
        return textInput;
    }

    public com.baidu.dueros.data.request.supportedInterfaces.VoiceInput getVoiceInput() {
        return voiceInput;
    }

    public com.baidu.dueros.data.request.supportedInterfaces.VoiceOutput getVoiceOutput() {
        return voiceOutput;
    }

    public com.baidu.dueros.data.request.supportedInterfaces.PlayController getPlayController() {
        return playController;
    }

    public com.baidu.dueros.data.request.supportedInterfaces.AudioPlayer getAudioPlayer() {
        return audioPlayer;
    }

    public com.baidu.dueros.data.request.supportedInterfaces.Alerts getAlerts() {
        return alerts;
    }

    public Screen getScreen() {
        return screen;
    }

    public com.baidu.dueros.data.request.supportedInterfaces.SpeakerController getSpeakerController() {
        return speakerController;
    }

    public System getSystem() {
        return system;
    }

    public com.baidu.dueros.data.request.supportedInterfaces.ScreenExtendedCard getScreenExtendedCard() {
        return screenExtendedCard;
    }

    public com.baidu.dueros.data.request.supportedInterfaces.VideoPlayer getVideoPlayer() {
        return videoPlayer;
    }

    public com.baidu.dueros.data.request.supportedInterfaces.Display getDisplay() {
        return display;
    }

    public static final class Builder {

        private com.baidu.dueros.data.request.supportedInterfaces.TextInput textInput;
        private com.baidu.dueros.data.request.supportedInterfaces.VoiceInput voiceInput;
        private com.baidu.dueros.data.request.supportedInterfaces.VoiceOutput voiceOutput;
        private com.baidu.dueros.data.request.supportedInterfaces.PlayController playController;
        private com.baidu.dueros.data.request.supportedInterfaces.AudioPlayer audioPlayer;
        private com.baidu.dueros.data.request.supportedInterfaces.Alerts alerts;
        private Screen screen;
        private com.baidu.dueros.data.request.supportedInterfaces.SpeakerController speakerController;
        private System system;
        private com.baidu.dueros.data.request.supportedInterfaces.ScreenExtendedCard screenExtendedCard;
        private com.baidu.dueros.data.request.supportedInterfaces.VideoPlayer videoPlayer;
        private com.baidu.dueros.data.request.supportedInterfaces.Display display;

        public Builder setTextInput(TextInput textInput) {
            this.textInput = textInput;
            return this;
        }

        public Builder setVoiceInput(VoiceInput voiceInput) {
            this.voiceInput = voiceInput;
            return this;
        }

        public Builder setVoiceOutput(VoiceOutput voiceOutput) {
            this.voiceOutput = voiceOutput;
            return this;
        }

        public Builder setPlayController(PlayController playController) {
            this.playController = playController;
            return this;
        }

        public Builder setAudioPlayer(AudioPlayer audioPlayer) {
            this.audioPlayer = audioPlayer;
            return this;
        }

        public Builder setAlerts(Alerts alerts) {
            this.alerts = alerts;
            return this;
        }

        public Builder setScreen(Screen screen) {
            this.screen = screen;
            return this;
        }

        public Builder setSpeakerController(SpeakerController speakerController) {
            this.speakerController = speakerController;
            return this;
        }

        public Builder setSystem(System system) {
            this.system = system;
            return this;
        }

        public Builder setScreenExtendedCard(ScreenExtendedCard screenExtendedCard) {
            this.screenExtendedCard = screenExtendedCard;
            return this;
        }

        public Builder setVideoPlayer(VideoPlayer videoPlayer) {
            this.videoPlayer = videoPlayer;
            return this;
        }

        public Builder setDisplay(Display display) {
            this.display = display;
            return this;
        }

        public SupportedInterfaces build() {
            return new SupportedInterfaces(this);
        }
    }
}