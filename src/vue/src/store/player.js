import axios from 'axios'
import router from '../router'
const state = {
    context : 'http://localhost:3000/',
    player : {},
    fail : false,
    auth : false
}

const actions = {
    async login({commit},payload){
        const url = state.context + `players/${payload.playerId}/access`
        const headers = {
            authorization : 'JWT fefege..',
            Accept : 'application/json',
            'Content-Type': 'application/json'
        }

        axios.post(url, payload, headers)
            .then(({data})=>{
                if(data.result) {
                    commit('LOGIN_COMMIT',data)
                } else {
                    commit('fail_commit')
                }
            })
            .catch(()=>{
                alert('서버 전송 실패')
                state.fail=true})
    }
    ,
    async join({commit}){
        commit('join')
    }
}
const mutations = {
    LOGIN_COMMIT(state, data){
        state.auth=true
        state.player=data.player
        localStorage.setItem('token', data.token)
        localStorage.setItem('playerId', data.player.playerId)
        if(data.player.teamId !== 'K01'){
            alert('일반 사용자')
            router.push('/')
        }else{
            alert('관리 자')
            /*관리자*/
        }
    }
}
const getters = {

}
export default {
    name : 'player',
    namespaced : true,
    state,
    actions,
    mutations,
    getters
}