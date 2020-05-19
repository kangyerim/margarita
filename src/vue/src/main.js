import Vue from 'vue'
import App from './App.vue'
import vuetify from './plugins/vuetify';
import router from './router'
import vuex from 'vuex'
import {store} from './store'
import axios from "axios";

Vue.config.productionTip = false
Vue.use(vuex)
Vue.prototype.$http = axios

new Vue({
  vuetify,
  router,
  vuex,
  store,
  axios,
  render: h => h(App)
}).$mount('#app')
